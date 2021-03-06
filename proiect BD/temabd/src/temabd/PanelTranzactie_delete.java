package temabd;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
public class PanelTranzactie_delete extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idt;

	/**
	 * Create the panel.
	 */
	public PanelTranzactie_delete() {
		setLayout(null);
		
		JLabel lblTranzactiaDoritaA = new JLabel("Tranzactia dorita a fi eliminata:");
		lblTranzactiaDoritaA.setBounds(10, 69, 561, 86);
		lblTranzactiaDoritaA.setToolTipText("");
		lblTranzactiaDoritaA.setHorizontalAlignment(SwingConstants.CENTER);
		lblTranzactiaDoritaA.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTranzactiaDoritaA.setBackground(new Color(240, 240, 240));
		add(lblTranzactiaDoritaA);
		
		JLabel lblIdulTranzactiei = new JLabel("Suma Tranzactiei");
		lblIdulTranzactiei.setBounds(88, 187, 153, 34);
		lblIdulTranzactiei.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblIdulTranzactiei);
		
		idt = new JTextField();
		idt.setBounds(286, 189, 186, 39);
		idt.setColumns(10);
		add(idt);
		
		JButton btnNewButton = new JButton("Executa");
		btnNewButton.setBounds(181, 274, 186, 31);
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
				String Suma=idt.getText();
				String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-3SAOEFS;instanceName=SQLEXPRESS;databaseName=Gestiunea_cardurilor_la_o_banca;integratedSecurity=true";
				try
				{
					Connection con = DriverManager.getConnection(connectionUrl); 
				
					String query="Delete From Tranzactie Where Suma=('" + Suma +"')";
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
		add(btnNewButton);

	}
}
