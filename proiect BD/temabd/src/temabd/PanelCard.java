package temabd;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelCard extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelCard() {
		setForeground(new Color(0, 0, 0));
		
		setBounds(0, 0, 581, 538);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Date Card");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel.setBounds(119, 157, 340, 186);
		add(lblNewLabel);
	}

}
