package temabd;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class PanelBanca extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	
	private PanelBanca_afisare panelAfis;
	private Blank panel;
	private PanelBanca_delete panelDelete;
	private PanelBanca_insert panelInsert;
	private PanelBanca_update panelUpdate;
	
	public PanelBanca() {
		setForeground(new Color(0, 0, 0));
		setBounds(0, 0, 581, 538);
		setLayout(null);
		panelAfis=new PanelBanca_afisare();
		panel=new Blank();
		panelDelete=new PanelBanca_delete();
		panelInsert=new PanelBanca_insert();
		panelUpdate=new PanelBanca_update();
		
		panelAfis.setBounds(12, 90, 559, 438);
		panelAfis.setLayout(null);
		add(panelAfis);
		
		panel.setBounds(12, 90, 559, 438);
		panel.setLayout(null);
		add(panel);
		
		panelDelete.setBounds(12, 90, 559, 438);
		panelDelete.setLayout(null);
		add(panelDelete);
		
		panelInsert.setBounds(12, 90, 559, 438);
		panelInsert.setLayout(null);
		add(panelInsert);
		
		panelUpdate.setBounds(12, 90, 559, 438);
		panelUpdate.setLayout(null);
		add(panelUpdate);
		
		panelAfis.setVisible(false);
		panelUpdate.setVisible(false);
		panelInsert.setVisible(false);
		panelDelete.setVisible(false);
		panel.setVisible(true);
		
		JButton btnAfisare = new JButton("Afisare");
		btnAfisare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				panelUpdate.setVisible(false);
				panelInsert.setVisible(false);
				panel.setVisible(false);
				panelDelete.setVisible(false);
				panelAfis.setVisible(true);
			}
		});
		btnAfisare.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAfisare.setBounds(10, 42, 129, 33);
		add(btnAfisare);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				panelUpdate.setVisible(false);
				panelInsert.setVisible(true);
				panel.setVisible(false);
				panelAfis.setVisible(false);
				panelDelete.setVisible(false);
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnInsert.setBounds(149, 41, 129, 33);
		add(btnInsert);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				panelUpdate.setVisible(true);
				panelInsert.setVisible(false);
				panel.setVisible(false);
				panelAfis.setVisible(false);
				panelDelete.setVisible(false);
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnUpdate.setBounds(303, 41, 129, 33);
		add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				panelUpdate.setVisible(false);
				panelInsert.setVisible(false);
				panel.setVisible(false);
				panelAfis.setVisible(false);
				panelDelete.setVisible(true);
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDelete.setBounds(442, 41, 129, 33);
		add(btnDelete);
	}
}
