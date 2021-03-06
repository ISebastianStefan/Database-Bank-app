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

public class PanelBanca_update extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idb;
	private JTextField nume;
	private JTextField strada;
	private JTextField numar;
	private JTextField oras;
	private JTextField mail;
	private JTextField orascautat;

	/**
	 * Create the panel.
	 */
	public PanelBanca_update() {
		setLayout(null);
		
		JLabel lblBancaDoritaA = new JLabel("Banca dorita a fi modificata in evidenta");
		lblBancaDoritaA.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblBancaDoritaA.setBounds(92, 0, 387, 52);
		add(lblBancaDoritaA);
		
		JLabel lblBancaid = new JLabel("BancaID");
		lblBancaid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBancaid.setBounds(94, 52, 129, 34);
		add(lblBancaid);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNume.setBounds(94, 101, 129, 34);
		add(lblNume);
		
		JLabel lblStrada = new JLabel("Strada");
		lblStrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStrada.setBounds(94, 150, 129, 34);
		add(lblStrada);
		
		JLabel lblNumar = new JLabel("Numar");
		lblNumar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumar.setBounds(94, 199, 129, 34);
		add(lblNumar);
		
		JLabel lblOras = new JLabel("Oras");
		lblOras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOras.setBounds(94, 248, 129, 34);
		add(lblOras);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMail.setBounds(94, 297, 129, 34);
		add(lblMail);
		
		idb = new JTextField();
		idb.setColumns(10);
		idb.setBounds(309, 54, 186, 39);
		add(idb);
		
		nume = new JTextField();
		nume.setColumns(10);
		nume.setBounds(309, 103, 186, 39);
		add(nume);
		
		strada = new JTextField();
		strada.setColumns(10);
		strada.setBounds(309, 152, 186, 39);
		add(strada);
		
		numar = new JTextField();
		numar.setColumns(10);
		numar.setBounds(309, 201, 186, 39);
		add(numar);
		
		oras = new JTextField();
		oras.setColumns(10);
		oras.setBounds(309, 250, 186, 39);
		add(oras);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(309, 299, 186, 39);
		add(mail);
		
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
				String OrasC=orascautat.getText();
				String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-3SAOEFS;instanceName=SQLEXPRESS;databaseName=Gestiunea_cardurilor_la_o_banca;integratedSecurity=true";
				try
				{
					Connection con = DriverManager.getConnection(connectionUrl); 
					Statement s = con.createStatement();
					if(!BancaID.isEmpty())
					{
						String query="Update Banca Set BancaID=('" + BancaID +"') Where Oras=('" + OrasC +"')";
						s.execute(query);
					}
					con.close();
					Connection con1 = DriverManager.getConnection(connectionUrl); 
					Statement s1 = con1.createStatement();
					if(!Nume.isEmpty())
					{
						String query="Update Banca Set Nume=('" + Nume +"') Where Oras=('" + OrasC +"')";
						s1.execute(query);
					}
					con1.close();
					Connection con2 = DriverManager.getConnection(connectionUrl); 
					Statement s2 = con2.createStatement();
					if(!Strada.isEmpty())
					{
						String query="Update Banca Set Strada=('" + Strada +"') Where Oras=('" + OrasC +"')";
						s2.execute(query);
					}
					con2.close();
					Connection con3 = DriverManager.getConnection(connectionUrl); 
					Statement s3 = con3.createStatement();
					if(!Numar.isEmpty())
					{
						String query="Update Banca Set Numar=('" + Numar +"') Where Oras=('" + OrasC +"')";
						s3.execute(query);
					}
					con3.close();
					Connection con4 = DriverManager.getConnection(connectionUrl); 
					Statement s4 = con4.createStatement();
					if(!Oras.isEmpty())
					{
						String query="Update Banca Set Oras=('" + Oras +"') Where Oras=('" + OrasC +"')";
						s4.execute(query);
					}
					con4.close();
					Connection con5 = DriverManager.getConnection(connectionUrl); 
					Statement s5 = con5.createStatement();
					if(!Mail.isEmpty())
					{
						String query="Update Banca Set Mail=('" + Mail +"') Where Oras=('" + OrasC +"')";
						s5.execute(query);
					}
					con5.close();
				}
				catch(Exception e1)
				{
					System.out.println("error"+e1);
					JOptionPane.showMessageDialog(null, "UnSuccessfully Updated!");
				}
			}
		});
		btnNewButton.setBounds(78, 400, 186, 31);
		add(btnNewButton);
		
		JLabel lblIntroducetiOrasulBanci = new JLabel("Introduceti  orasul banci care se modifica");
		lblIntroducetiOrasulBanci.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIntroducetiOrasulBanci.setBounds(51, 341, 423, 39);
		add(lblIntroducetiOrasulBanci);
		
		JLabel lblOrasulCautat = new JLabel("Orasul cautat");
		lblOrasulCautat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOrasulCautat.setBounds(92, 372, 129, 34);
		add(lblOrasulCautat);
		orascautat = new JTextField();
		orascautat.setBounds(470, 505, 186, 39);
		add(orascautat);
		orascautat.setColumns(10);
		
		orascautat = new JTextField();
		orascautat.setColumns(10);
		orascautat.setBounds(309, 374, 186, 39);
		add(orascautat);

	}

}
