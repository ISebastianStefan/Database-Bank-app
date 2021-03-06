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

public class PanelTranzactie_insert extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idt;
	private JTextField idc;
	private JTextField suma;
	private JTextField data;

	/**
	 * Create the panel.
	 */
	public PanelTranzactie_insert() {
		setLayout(null);
		
		JLabel lblIntroducetiDateNoi_1 = new JLabel("Introduceti date noi despre  tranzactie");
		lblIntroducetiDateNoi_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIntroducetiDateNoi_1.setBounds(93, 32, 394, 56);
		add(lblIntroducetiDateNoi_1);
		
		JLabel lblTranzactieid = new JLabel("TranzactieID");
		lblTranzactieid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTranzactieid.setBounds(93, 108, 129, 34);
		add(lblTranzactieid);
		
		JLabel lblCardid = new JLabel("CardID");
		lblCardid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCardid.setBounds(93, 175, 129, 34);
		add(lblCardid);
		
		JLabel lblSuma = new JLabel("Suma");
		lblSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSuma.setBounds(93, 240, 129, 34);
		add(lblSuma);
		
		JLabel lblDataprocesare = new JLabel("DataProcesare");
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
				String TranzactieID=idt.getText();
				String CardID=idc.getText();
				String Suma=suma.getText();
				String DataProcesare=data.getText();
				String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-3SAOEFS;instanceName=SQLEXPRESS;databaseName=Gestiunea_cardurilor_la_o_banca;integratedSecurity=true";
				try
				{
					Connection con = DriverManager.getConnection(connectionUrl); 
				
					String query="Insert into Tranzactie Values(('" + TranzactieID +"'),('" + CardID +"'),('" + Suma +"'),('" + DataProcesare +"'))";
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
		
		idt = new JTextField();
		idt.setColumns(10);
		idt.setBounds(274, 110, 186, 39);
		add(idt);
		
		idc = new JTextField();
		idc.setColumns(10);
		idc.setBounds(274, 177, 186, 39);
		add(idc);
		
		suma = new JTextField();
		suma.setColumns(10);
		suma.setBounds(274, 242, 186, 39);
		add(suma);
		
		data = new JTextField();
		data.setColumns(10);
		data.setBounds(274, 318, 186, 39);
		add(data);

	}

}
