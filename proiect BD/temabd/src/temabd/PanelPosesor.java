package temabd;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPosesor extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	private Blank panel;
	private PanelPosesor_insert panelInsert;
	private PanelPosesor_update panelUpdate;
	
	public PanelPosesor() {
		setForeground(new Color(0, 0, 0));
		setBounds(0, 0, 581, 538);
		setLayout(null);
		panel=new Blank();
		panelInsert=new PanelPosesor_insert();
		panelUpdate=new PanelPosesor_update();
		
		panelInsert.setBounds(12, 90, 891, 552);
		panelInsert.setLayout(null);
		add(panelInsert);
		
		panelUpdate.setBounds(12, 90, 891, 552);
		panelUpdate.setLayout(null);
		add(panelUpdate);
		
		panelUpdate.setVisible(false);
		panelInsert.setVisible(false);
		panel.setVisible(true);
		
		JButton btnAfisare = new JButton("Afisare");
		btnAfisare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				panelUpdate.setVisible(false);
				panelInsert.setVisible(false);
				panel.setVisible(false);

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

			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDelete.setBounds(442, 41, 129, 33);
		add(btnDelete);
	}
}
