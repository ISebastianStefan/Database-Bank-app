package temabd;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelCont extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelCont() {

		setBounds(0, 0, 580, 538);
		setLayout(null);
		
		JLabel lblDateTipCard = new JLabel("Date Cont");
		lblDateTipCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateTipCard.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblDateTipCard.setBounds(104, 156, 340, 186);
		add(lblDateTipCard);
	}

}