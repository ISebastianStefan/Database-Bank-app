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

public class PanelTranzactie_update extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField sumacautata;
	private JTextField idt;
	private JTextField idc;
	private JTextField suma;
	private JTextField data;

	/**
	 * Create the panel.
	 */
	public PanelTranzactie_update() {
		setLayout(null);
		
		JLabel lblTranzactiaDoritaA = new JLabel("Tranzactia dorita a fi modificata in evidenta");
		lblTranzactiaDoritaA.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTranzactiaDoritaA.setBounds(53, 10, 442, 75);
		add(lblTranzactiaDoritaA);
		
		JLabel lblTranzactieid = new JLabel("TranzactieID");
		lblTranzactieid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTranzactieid.setBounds(77, 82, 129, 34);
		add(lblTranzactieid);
		
		JLabel lblCardid = new JLabel("CardID");
		lblCardid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCardid.setBounds(77, 137, 129, 34);
		add(lblCardid);
		
		JLabel lblSuma = new JLabel("Suma");
		lblSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSuma.setBounds(77, 192, 129, 34);
		add(lblSuma);
		
		JLabel lblDataprocesare = new JLabel("DataProcesare");
		lblDataprocesare.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataprocesare.setBounds(77, 243, 129, 34);
		add(lblDataprocesare);
		
		JLabel lblIntroducetiSumaTranzactiei = new JLabel("Introduceti  suma tranzactiei care se modifica");
		lblIntroducetiSumaTranzactiei.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIntroducetiSumaTranzactiei.setBounds(61, 292, 461, 39);
		add(lblIntroducetiSumaTranzactiei);
		
		JLabel lblSumaCautata = new JLabel("Suma cautata\r\n");
		lblSumaCautata.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSumaCautata.setBounds(77, 341, 129, 34);
		add(lblSumaCautata);
		
		sumacautata = new JTextField();
		sumacautata.setColumns(10);
		sumacautata.setBounds(270, 353, 186, 39);
		add(sumacautata);
		
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
				String TranzactieID=idt.getText();
				String CardID=idc.getText();
				String Suma=suma.getText();
				String DataProcesare=data.getText();
				String SumaC=sumacautata.getText();
				String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-3SAOEFS;instanceName=SQLEXPRESS;databaseName=Gestiunea_cardurilor_la_o_banca;integratedSecurity=true";
				try
				{
					Connection con = DriverManager.getConnection(connectionUrl); 
					Statement s = con.createStatement();
					if(!TranzactieID.isEmpty())
					{
						String query="Update Tranzactie Set TranzactieID=('" + TranzactieID +"') Where Suma=('" + SumaC +"')";
						s.execute(query);
					}
					con.close();
					Connection con1 = DriverManager.getConnection(connectionUrl); 
					Statement s1 = con1.createStatement();
					if(!CardID.isEmpty())
					{
						String query="Update Tranzactie Set CardID=('" + CardID +"') Where Suma=('" + SumaC +"')";
						s1.execute(query);
					}
					con1.close();
					Connection con2 = DriverManager.getConnection(connectionUrl); 
					Statement s2 = con2.createStatement();
					if(!Suma.isEmpty())
					{
						String query="Update Tranzactie Set Suma=('" + Suma +"') Where Suma=('" + SumaC +"')";
						s2.execute(query);
					}
					con2.close();
					Connection con3 = DriverManager.getConnection(connectionUrl); 
					Statement s3 = con3.createStatement();
					if(!DataProcesare.isEmpty())
					{
						String query="Update Tranzactie Set DataProcesare=('" + DataProcesare +"') Where Suma=('" + SumaC +"')";
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
		
		idt = new JTextField();
		idt.setColumns(10);
		idt.setBounds(270, 84, 186, 39);
		add(idt);
		
		idc = new JTextField();
		idc.setColumns(10);
		idc.setBounds(270, 139, 186, 39);
		add(idc);
		
		suma = new JTextField();
		suma.setColumns(10);
		suma.setBounds(270, 194, 186, 39);
		add(suma);
		
		data = new JTextField();
		data.setColumns(10);
		data.setBounds(270, 243, 186, 39);
		add(data);

	}

}
