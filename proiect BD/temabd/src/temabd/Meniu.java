package temabd;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;

import javax.swing.SwingConstants;

/*import com.sun.glass.events.MouseEvent;
import com.sun.prism.paint.Color;*/

public class Meniu {

	public static JFrame frame;
	
	/**
	 * Launch the application.
	 */
	//private Home panelHome;
	private PanelCard panelCard;
	private PanelBanca panelBanca;
	private PanelPosesor panelPosesor;
	private PanelTranzactie panelTranzactie;
	private PanelCont panelCont;
	private PanelLegatura panelLegatura;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Meniu.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Meniu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

		frame.getContentPane().setBackground(new java.awt.Color(0, 128, 128));
		frame.setBounds(100, 100, 1231, 728);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//panelHome=new PanelHome();
		//panelHome.setBounds(457, 5, 1, 1);
		panelCard = new PanelCard();
		panelBanca = new PanelBanca();
		panelPosesor = new PanelPosesor();
		panelTranzactie = new PanelTranzactie();
		panelLegatura = new PanelLegatura();
		panelCont =new PanelCont();
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new java.awt.Color(0, 128, 128));
		panelMenu.setBounds(12, 13, 266, 655);
		frame.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel labelIcon = new JLabel("");
		labelIcon.setHorizontalAlignment(SwingConstants.CENTER);
		Image img_menu=new ImageIcon(this.getClass().getResource("/prima.png")).getImage();
		labelIcon.setIcon(new ImageIcon(img_menu));
		labelIcon.setBounds(12, 13, 228, 151);
		panelMenu.add(labelIcon);
		
		JPanel panel = new JPanel();
		panel.setBackground(new java.awt.Color(0, 128, 128));
		panel.addMouseListener(new PanelButtonMouseAdapter(panel){
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
			}
		});
		panel.setBounds(0, 191, 266, 49);
		panelMenu.add(panel);
		panel.setLayout(null);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setBounds(68, 0, 100, 49);
		lblHome.setFont(new Font("Dialog", Font.BOLD, 26));
		panel.add(lblHome);
		
		JLabel labelIconHome = new JLabel("");
		labelIconHome.setHorizontalAlignment(SwingConstants.CENTER);
		Image img_menuhome=new ImageIcon(this.getClass().getResource("/Home-icon.png")).getImage();
		labelIconHome.setIcon(new ImageIcon(img_menuhome));
		labelIconHome.setBounds(0, 0, 56, 49);
		panel.add(labelIconHome);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new java.awt.Color(0, 128, 128));
		panel_1.addMouseListener(new PanelButtonMouseAdapter(panel_1)
		{
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				//menuClicked(panelInch);
			}
		});
		panel_1.setBounds(0, 241, 266, 49);
		panelMenu.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblInchiriere = new JLabel("Inchiriere");
		lblInchiriere.setBounds(68, 0, 132, 49);
		lblInchiriere.setFont(new Font("Dialog", Font.BOLD, 26));
		panel_1.add(lblInchiriere);
		
		JLabel labelIconInch = new JLabel("");
		Image img_menuinch=new ImageIcon(this.getClass().getResource("/renticon.png")).getImage();
		labelIconInch.setIcon(new ImageIcon(img_menuinch));
		labelIconInch.setBounds(12, 0, 71, 49);
		panel_1.add(labelIconInch);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new java.awt.Color(0, 128, 128));
		panel_2.addMouseListener(new PanelButtonMouseAdapter(panel_2){
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				menuClicked(panelBanca);
			}
		});
		panel_2.setBounds(0, 290, 266, 49);
		panelMenu.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setBounds(68, 0, 119, 49);
		lblClient.setFont(new Font("Dialog", Font.BOLD, 26));
		panel_2.add(lblClient);
		
		JLabel labeliconClient = new JLabel("");
		Image img_menuclient=new ImageIcon(this.getClass().getResource("/client.png")).getImage();
		labeliconClient.setIcon(new ImageIcon(img_menuclient));
		labeliconClient.setBounds(12, 0, 56, 49);
		panel_2.add(labeliconClient);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new java.awt.Color(0, 128, 128));
		panel_3.addMouseListener(new PanelButtonMouseAdapter(panel_3){
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) 
			{
				menuClicked(panelPosesor);
			}
		});
		panel_3.setBounds(0, 340, 266, 49);
		panelMenu.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblAutoturism = new JLabel("Autoturism");
		lblAutoturism.setBounds(68, 0, 158, 49);
		lblAutoturism.setFont(new Font("Dialog", Font.BOLD, 26));
		panel_3.add(lblAutoturism);
		
		JLabel labelIconAuto = new JLabel("");
		Image img_menuauto=new ImageIcon(this.getClass().getResource("/car.png")).getImage();
		labelIconAuto.setIcon(new ImageIcon(img_menuauto));
		labelIconAuto.setBounds(12, 0, 56, 49);
		panel_3.add(labelIconAuto);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new java.awt.Color(0, 128, 128));
		panel_4.addMouseListener(new PanelButtonMouseAdapter(panel_4)
		{
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) 
			{
				menuClicked(panelCont);
			}
		});
		panel_4.setBounds(0, 391, 266, 49);
		panelMenu.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblCategorie = new JLabel("Categorie");
		lblCategorie.setBounds(68, 0, 145, 49);
		lblCategorie.setFont(new Font("Dialog", Font.BOLD, 26));
		panel_4.add(lblCategorie);
		
		JLabel labelIconCateg = new JLabel("");
		Image img_menucateg=new ImageIcon(this.getClass().getResource("/categ.png")).getImage();
		labelIconCateg.setIcon(new ImageIcon(img_menucateg));
		labelIconCateg.setBounds(12, 0, 56, 49);
		panel_4.add(labelIconCateg);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new java.awt.Color(0, 128, 128));
		panel_5.addMouseListener(new PanelButtonMouseAdapter(panel_5)
		{
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) 
			{
				menuClicked(panelLegatura);
			}
		});
		panel_5.setBounds(0, 441, 266, 49);
		panelMenu.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblLocatie = new JLabel("Locatie");
		lblLocatie.setBounds(68, 0, 143, 49);
		lblLocatie.setFont(new Font("Dialog", Font.BOLD, 26));
		panel_5.add(lblLocatie);
		
		JLabel labelIconLoc = new JLabel("");
		Image img_menuloc=new ImageIcon(this.getClass().getResource("/loc.png")).getImage();
		labelIconLoc.setIcon(new ImageIcon(img_menuloc));
		labelIconLoc.setBounds(12, 0, 56, 49);
		panel_5.add(labelIconLoc);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new java.awt.Color(0, 128, 128));
		panel_6.addMouseListener(new PanelButtonMouseAdapter(panel_6)
		{
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) 
			{
				menuClicked(panelTranzactie);
			}
		});
		panel_6.setBounds(0, 492, 266, 49);
		panelMenu.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblAsigurare = new JLabel("Asigurare");
		lblAsigurare.setBounds(68, 0, 149, 45);
		lblAsigurare.setFont(new Font("Dialog", Font.BOLD, 26));
		panel_6.add(lblAsigurare);
		
		JLabel labelIconAsig = new JLabel("");
		Image img_menuasig=new ImageIcon(this.getClass().getResource("/asig.png")).getImage();
		labelIconAsig.setIcon(new ImageIcon(img_menuasig));
		labelIconAsig.setBounds(12, 0, 56, 49);
		panel_6.add(labelIconAsig);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new java.awt.Color(0, 128, 128));
		panel_7.addMouseListener(new PanelButtonMouseAdapter(panel_7)
		{
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) 
			{
				menuClicked(panelCard);
			}
		});
		panel_7.setBounds(0, 543, 266, 49);
		panelMenu.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblFactura = new JLabel("Factura");
		lblFactura.setBounds(68, 0, 159, 49);
		lblFactura.setFont(new Font("Dialog", Font.BOLD, 26));
		panel_7.add(lblFactura);
		
		JLabel labelIconFac = new JLabel("");
		Image img_menufac=new ImageIcon(this.getClass().getResource("/fac.png")).getImage();
		labelIconFac.setIcon(new ImageIcon(img_menufac));
		labelIconFac.setBounds(12, 0, 56, 49);
		panel_7.add(labelIconFac);
	}
	public void menuClicked(JPanel panel)
	{
		panelCard.setVisible(false);
		panelBanca.setVisible(false);
		panelPosesor.setVisible(false);
		panelTranzactie.setVisible(false);
		panelLegatura.setVisible(false);
		panelCont.setVisible(false);
		
		
		panel.setVisible(true);
	}
	private class PanelButtonMouseAdapter extends MouseAdapter
	{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel)
		{
			this.panel=panel;
		}
		
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) 
		{
			panel.setBackground(new java.awt.Color(112,128,144));
		}
	

		@Override
		public void mouseExited(java.awt.event.MouseEvent e) 
		{
			panel.setBackground(new java.awt.Color(0, 128, 128));
		}
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) 
		{
			panel.setBackground(new java.awt.Color(60,179,113));
		}
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) 
		{
			panel.setBackground(new java.awt.Color(0, 128, 128));
		}
	}
}


