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

public class PanelPosesor_update extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField numecautat;
	private JTextField idp;
	private JTextField nume;
	private JTextField oras;
	private JTextField sex;

	/**
	 * Create the panel.
	 */
	public PanelPosesor_update() {
		setLayout(null);
		
		JLabel lblTranzactiaDoritaA = new JLabel("Posesorul dorit a fi modificat in evidenta");
		lblTranzactiaDoritaA.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTranzactiaDoritaA.setBounds(53, 10, 442, 75);
		add(lblTranzactiaDoritaA);
		
		JLabel lblTranzactieid = new JLabel("PosesorID");
		lblTranzactieid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTranzactieid.setBounds(77, 82, 129, 34);
		add(lblTranzactieid);
		
		JLabel lblCardid = new JLabel("Nume");
		lblCardid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCardid.setBounds(77, 137, 129, 34);
		add(lblCardid);
		
		JLabel lblSuma = new JLabel("Oras");
		lblSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSuma.setBounds(77, 192, 129, 34);
		add(lblSuma);
		
		JLabel lblDataprocesare = new JLabel("Sex");
		lblDataprocesare.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataprocesare.setBounds(77, 243, 129, 34);
		add(lblDataprocesare);
		
		JLabel lblIntroducetiSumaTranzactiei = new JLabel("Introduceti  numele posesorului care se modifica");
		lblIntroducetiSumaTranzactiei.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIntroducetiSumaTranzactiei.setBounds(61, 292, 461, 39);
		add(lblIntroducetiSumaTranzactiei);
		
		JLabel lblNumeCautat = new JLabel("Nume cautat");
		lblNumeCautat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumeCautat.setBounds(77, 341, 129, 34);
		add(lblNumeCautat);
		
		numecautat = new JTextField();
		numecautat.setColumns(10);
		numecautat.setBounds(270, 353, 186, 39);
		add(numecautat);
		
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
				String NumeC=numecautat.getText();
				String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-3SAOEFS;instanceName=SQLEXPRESS;databaseName=Gestiunea_cardurilor_la_o_banca;integratedSecurity=true";
				try
				{
					Connection con = DriverManager.getConnection(connectionUrl); 
					Statement s = con.createStatement();
					if(!PosesorID.isEmpty())
					{
						String query="Update Posesor Set PosesorID=('" + PosesorID +"') Where Nume=('" + NumeC +"')";
						s.execute(query);
					}
					con.close();
					Connection con1 = DriverManager.getConnection(connectionUrl); 
					Statement s1 = con1.createStatement();
					if(!Nume.isEmpty())
					{
						String query="Update Posesor Set Nume=('" + Nume +"') Where Nume=('" + NumeC +"')";
						s1.execute(query);
					}
					con1.close();
					Connection con2 = DriverManager.getConnection(connectionUrl); 
					Statement s2 = con2.createStatement();
					if(!Oras.isEmpty())
					{
						String query="Update Posesor Set Oras=('" + Oras +"') Where Nume=('" + NumeC +"')";
						s2.execute(query);
					}
					con2.close();
					Connection con3 = DriverManager.getConnection(connectionUrl); 
					Statement s3 = con3.createStatement();
					if(!Sex.isEmpty())
					{
						String query="Update Posesor Set Sex=('" + Sex +"') Where Nume=('" + NumeC +"')";
						s3.execute(query);
					}
					JOptionPane.showMessageDialog(null, "Successfully Updated!");
					con3.close();
				}
				catch(Exception e1)
				{
					System.out.println("error"+e1);
					JOptionPane.showMessageDialog(null, "UnSuccessfully Updated!");
				}
			}
		});
		btnNewButton.setBounds(167, 410, 186, 31);
		add(btnNewButton);
		
		idp = new JTextField();
		idp.setColumns(10);
		idp.setBounds(270, 84, 186, 39);
		add(idp);
		
		nume = new JTextField();
		nume.setColumns(10);
		nume.setBounds(270, 139, 186, 39);
		add(nume);
		
		oras = new JTextField();
		oras.setColumns(10);
		oras.setBounds(270, 194, 186, 39);
		add(oras);
		
		sex = new JTextField();
		sex.setColumns(10);
		sex.setBounds(270, 243, 186, 39);
		add(sex);

	}

}
