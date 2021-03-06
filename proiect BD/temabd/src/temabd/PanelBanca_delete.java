package temabd;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelBanca_delete extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idb;

	/**
	 * Create the panel.
	 */
	public PanelBanca_delete() {
		setLayout(null);
		
		JLabel lblIntroducetiDateDespre = new JLabel("Banca dorita a fi eliminata:");
		lblIntroducetiDateDespre.setToolTipText("");
		lblIntroducetiDateDespre.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroducetiDateDespre.setBackground(new Color(240, 240, 240));
		lblIntroducetiDateDespre.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIntroducetiDateDespre.setBounds(10, 48, 551, 86);
		add(lblIntroducetiDateDespre);
		
		JLabel lblIdulBanci = new JLabel("Numele Banci");
		lblIdulBanci.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIdulBanci.setBounds(77, 161, 149, 34);
		add(lblIdulBanci);
		
		idb = new JTextField();
		idb.setColumns(10);
		idb.setBounds(275, 163, 186, 39);
		add(idb);
		
		JButton btnNewButton = new JButton("Executa");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Nume=idb.getText();
				String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-3SAOEFS;instanceName=SQLEXPRESS;databaseName=Gestiunea_cardurilor_la_o_banca;integratedSecurity=true";
				try
				{
					Connection con = DriverManager.getConnection(connectionUrl); 
				
					String query="Delete From Banca Where Nume=('" + Nume +"')";
					Statement s = con.createStatement();
		            s.execute(query);
					JOptionPane.showMessageDialog(null, "Successfully deleted");
					con.close();
				}
				catch(Exception e1)
				{
					System.out.println("error"+e1);
					JOptionPane.showMessageDialog(null, "UnSuccessfully deleted");
				}
			
			}
		});
		btnNewButton.setBounds(180, 248, 186, 31);
		add(btnNewButton);

	}
}
