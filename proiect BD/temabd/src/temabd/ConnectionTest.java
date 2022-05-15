package temabd;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.sql.Connection;

public class ConnectionTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
		String connectionUrl = "jdbc:jtds:sqlserver://DESKTOP-3SAOEFS;instanceName=SQLEXPRESS;databaseName=Gestiunea_cardurilor_la_o_banca;integratedSecurity=true;";  
		try (Connection con = DriverManager.getConnection(connectionUrl)) {
		} finally {
		}
		JOptionPane.showConfirmDialog(null, "Connected");
	}
	
}
