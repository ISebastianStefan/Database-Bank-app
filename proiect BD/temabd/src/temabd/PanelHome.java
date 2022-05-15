package temabd;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelHome extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setForeground(new Color(0, 0, 0));
		
		setBounds(0, 0, 581, 538);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Bun venit la banca!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel.setBounds(47, 159, 475, 186);
		add(lblNewLabel);
	}

}
