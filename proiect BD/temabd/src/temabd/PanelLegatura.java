package temabd;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelLegatura extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelLegatura() {

		setBounds(0, 0, 580, 538);
		setLayout(null);
		
		JLabel lblDateLegatura = new JLabel("Date Legatura");
		lblDateLegatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateLegatura.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblDateLegatura.setBounds(105, 158, 340, 186);
		add(lblDateLegatura);
	}

}
