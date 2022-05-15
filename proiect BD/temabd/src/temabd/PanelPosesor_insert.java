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

public class PanelPosesor_insert extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idp;
	private JTextField nume;
	private JTextField oras;
	private JTextField sex;

	/**
	 * Create the panel.
	 */
	public PanelPosesor_insert() {
		setLayout(null);
		
		JLabel lblIntroducetiDateNoi_1 = new JLabel("Introduceti date noi despre  tranzactie");
		lblIntroducetiDateNoi_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIntroducetiDateNoi_1.setBounds(93, 32, 394, 56);
		add(lblIntroducetiDateNoi_1);
		
		JLabel lblTranzactieid = new JLabel("PosesorID");
		lblTranzactieid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTranzactieid.setBounds(93, 108, 129, 34);
		add(lblTranzactieid);
		
		JLabel lblCardid = new JLabel("Nume");
		lblCardid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCardid.setBounds(93, 175, 129, 34);
		add(lblCardid);
		
		JLabel lblSuma = new JLabel("Oras");
		lblSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSuma.setBounds(93, 240, 129, 34);
		add(lblSuma);
		
		JLabel lblDataprocesare = new JLabel("Sex");
		lblDataprocesare.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataprocesare.setBounds(93, 316, 129, 34);
		add(lblDataprocesare);
		
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
				String PosesorID=idp.getText();
				String Nume=nume.getText();
				String Oras=oras.getText();
				String Sex=sex.getText();
				String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-3SAOEFS;instanceName=SQLEXPRESS;databaseName=Gestiunea_cardurilor_la_o_banca;integratedSecurity=true";
				try
				{
					Connection con = DriverManager.getConnection(connectionUrl); 
				
					String query="Insert into Posesor (PosesorID, Nume, Oras, Sex) Values(('" + PosesorID +"'),('" + Nume +"'),('" + Oras +"'),('" + Sex +"'))";
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
		btnNewButton.setBounds(175, 391, 186, 31);
		add(btnNewButton);
		
		idp = new JTextField();
		idp.setColumns(10);
		idp.setBounds(274, 110, 186, 39);
		add(idp);
		
		nume = new JTextField();
		nume.setColumns(10);
		nume.setBounds(274, 177, 186, 39);
		add(nume);
		
		oras = new JTextField();
		oras.setColumns(10);
		oras.setBounds(274, 242, 186, 39);
		add(oras);
		
		sex = new JTextField();
		sex.setColumns(10);
		sex.setBounds(274, 318, 186, 39);
		add(sex);

	}

}
