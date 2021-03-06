package temabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelTranzactie_afisare extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public PanelTranzactie_afisare() 
	{
		setBounds(0, 0, 581, 538);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 581, 538);
		add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-3SAOEFS;instanceName=SQLEXPRESS;databaseName=Gestiunea_cardurilor_la_o_banca;integratedSecurity=true";
		
		
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("TranzactieID");
		model.addColumn("CardID");
		model.addColumn("Suma");
		model.addColumn("DataProcesare");
		
		try
		{
			Connection con = DriverManager.getConnection(connectionUrl); 
			String query="select * from Tranzactie";
			java.sql.Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
				model.addRow(new Object[] 
						{rs.getString("TranzactieID"),
						rs.getString("CardID"),
						rs.getString("Suma"),
						rs.getString("DataProcesare"),
				});
			}
			rs.close();
			st.close();
			con.close();
			
			table_1.setModel(model);
			table_1.setAutoResizeMode(0);
			table_1.getColumnModel().getColumn(0).setPreferredWidth(80);
			table_1.getColumnModel().getColumn(1).setPreferredWidth(80);
			table_1.getColumnModel().getColumn(2).setPreferredWidth(80);
			table_1.getColumnModel().getColumn(3).setPreferredWidth(80);
			
		}
		catch(Exception e)
		{
			System.out.println("error"+e);
		}
	
	}
}
