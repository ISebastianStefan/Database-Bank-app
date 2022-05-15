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

import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelBanca_insert extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idb;
	private JTextField strada;
	private JTextField numar;
	private JTextField oras;
	private JTextField mail;
	private JTextField nume;

	/**
	 * Create the panel.
	 */
	public PanelBanca_insert() {
		setLayout(null);
		
		JLabel lblIntroducetiDateNoi = new JLabel("Introduceti date noi despre  banca");
		lblIntroducetiDateNoi.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIntroducetiDateNoi.setBounds(103, 10, 375, 56);
		add(lblIntroducetiDateNoi);
		
		JLabel lblBancaid = new JLabel("BancaID");
		lblBancaid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBancaid.setBounds(100, 76, 129, 34);
		add(lblBancaid);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNume.setBounds(103, 127, 129, 34);
		add(lblNume);
		
		JLabel lblStrada = new JLabel("Strada");
		lblStrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStrada.setBounds(103, 186, 129, 34);
		add(lblStrada);
		
		idb = new JTextField();
		idb.setColumns(10);
		idb.setBounds(292, 78, 186, 39);
		add(idb);
		
		strada = new JTextField();
		strada.setColumns(10);
		strada.setBounds(292, 188, 186, 39);
		add(strada);
		
		JLabel lblNumar = new JLabel("Numar");
		lblNumar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumar.setBounds(100, 235, 129, 34);
		add(lblNumar);
		
		JLabel lblOras = new JLabel("Oras");
		lblOras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOras.setBounds(100, 284, 129, 34);
		add(lblOras);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMail.setBounds(100, 340, 129, 34);
		add(lblMail);
		
		numar = new JTextField();
		numar.setColumns(10);
		numar.setBounds(292, 237, 186, 39);
		add(numar);
		
		oras = new JTextField();
		oras.setColumns(10);
		oras.setBounds(292, 286, 186, 39);
		add(oras);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(292, 335, 186, 39);
		add(mail);
		
		
		nume = new JTextField();
		nume.setColumns(10);
		nume.setBounds(292, 129, 186, 39);
		add(nume);
		
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
				String BancaID=idb.getText();
				String Nume=nume.getText();
				String Strada=strada.getText();
				String Numar=numar.getText();
				String Oras=oras.getText();
				String Mail=mail.getText();
				String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-3SAOEFS;instanceName=SQLEXPRESS;databaseName=Gestiunea_cardurilor_la_o_banca;integratedSecurity=true";
				try
				{
					Connection con = DriverManager.getConnection(connectionUrl); 
				
					String query="Insert into Banca Values(('" + BancaID +"'),('" + Nume +"'),('" + Strada +"'),('" + Numar +"'),('" + Oras +"'),('" + Mail +"'))";
					Statement s = con.createStatement();
		            s.execute(query);
					JOptionPane.showMessageDialog(null, "Successfully inserted");
					con.close();
				}
				catch(Exception e1)
				{
					System.out.println("error"+e1);
					JOptionPane.showMessageDialog(null, "UnSuccessfully inserted");
				}
			}
		});
		btnNewButton.setBounds(177, 384, 186, 31);
		add(btnNewButton);

	}

}
