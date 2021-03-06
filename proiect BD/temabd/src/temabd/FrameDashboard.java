package temabd;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FrameDashboard extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private PanelCard panelCard;
	private PanelBanca panelBanca;
	private PanelPosesor panelPosesor;
	private PanelTranzactie panelTranzactie;
	private PanelCont panelCont;
	private PanelLegatura panelLegatura;
	private PanelHome panelHome;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDashboard frame = new FrameDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameDashboard() {
		setForeground(new Color(47, 79, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 558);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 153, 153));
		contentPane.setBackground(new Color(51, 102, 153));
		contentPane.setBorder(new LineBorder(new Color(51, 153, 153), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelCard = new PanelCard();
		panelBanca = new PanelBanca();
		panelPosesor = new PanelPosesor();
		panelTranzactie = new PanelTranzactie();
		panelLegatura = new PanelLegatura();
		panelCont =new PanelCont();
		panelHome = new PanelHome();

		
		JPanel Meniu = new JPanel();
		Meniu.setBackground(new Color(51, 153, 153));
		Meniu.setBounds(0, 0, 300, 558);
		contentPane.add(Meniu);
		Meniu.setLayout(null);
		
		JLabel l1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/fil.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);;
		l1.setIcon(new ImageIcon(img));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(10, 10, 280, 106);
		Meniu.add(l1);
		
		final JPanel paneCard = new JPanel();
		paneCard.addMouseListener(new PanelButtonMouseAdapter(paneCard) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelCard);
			}
		});
		paneCard.setBackground(new Color(51, 153, 204));
		paneCard.setBounds(0, 139, 300, 43);
		Meniu.add(paneCard);
		paneCard.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CARD");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(121, 10, 169, 23);
		paneCard.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img1 = new ImageIcon(this.getClass().getResource("/card.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(66, 0, 45, 43);
		paneCard.add(lblNewLabel_1);
		
		final JPanel panePosesor = new JPanel();
		panePosesor.addMouseListener(new PanelButtonMouseAdapter(panePosesor) {
				@Override
				public void mouseClicked(MouseEvent e) {
					menuClicked(panelPosesor);
				}
		});
		panePosesor.setBackground(new Color(51, 153, 204));
		panePosesor.setBounds(0, 182, 300, 43);
		Meniu.add(panePosesor);
		panePosesor.setLayout(null);
		
		JLabel lblPsesor = new JLabel("POSESOR");
		lblPsesor.setHorizontalAlignment(SwingConstants.LEFT);
		lblPsesor.setForeground(Color.WHITE);
		lblPsesor.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPsesor.setBackground(Color.WHITE);
		lblPsesor.setBounds(121, 10, 169, 23);
		panePosesor.add(lblPsesor);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/person.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblNewLabel_1_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(66, 0, 45, 43);
		panePosesor.add(lblNewLabel_1_1);
		
		final JPanel paneBanca = new JPanel();
		paneBanca.addMouseListener(new PanelButtonMouseAdapter(paneBanca){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelBanca);
			}
		});
		paneBanca.setBackground(new Color(51, 153, 204));
		paneBanca.setBounds(0, 223, 300, 43);
		Meniu.add(paneBanca);
		paneBanca.setLayout(null);
		
		JLabel lblBanca = new JLabel("BANCA");
		lblBanca.setHorizontalAlignment(SwingConstants.LEFT);
		lblBanca.setForeground(Color.WHITE);
		lblBanca.setFont(new Font("Dialog", Font.BOLD, 14));
		lblBanca.setBackground(Color.WHITE);
		lblBanca.setBounds(121, 10, 169, 23);
		paneBanca.add(lblBanca);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/b.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblNewLabel_1_2.setIcon(new ImageIcon(img3));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(66, 0, 45, 43);
		paneBanca.add(lblNewLabel_1_2);
		
		final JPanel paneLegatura = new JPanel();
		paneLegatura.addMouseListener(new PanelButtonMouseAdapter(paneLegatura) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelLegatura);
			}
		});
		paneLegatura.setBackground(new Color(51, 153, 204));
		paneLegatura.setBounds(0, 307, 300, 43);
		Meniu.add(paneLegatura);
		paneLegatura.setLayout(null);
		
		JLabel lblTransfer = new JLabel("LEGATURA");
		lblTransfer.setHorizontalAlignment(SwingConstants.LEFT);
		lblTransfer.setForeground(Color.WHITE);
		lblTransfer.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTransfer.setBackground(Color.WHITE);
		lblTransfer.setBounds(121, 10, 169, 23);
		paneLegatura.add(lblTransfer);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		Image img5 = new ImageIcon(this.getClass().getResource("/transfer.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblNewLabel_1_4.setIcon(new ImageIcon(img5));
		lblNewLabel_1_4.setBounds(66, 0, 45, 43);
		paneLegatura.add(lblNewLabel_1_4);
		
		final JPanel paneCont = new JPanel();
		paneCont.addMouseListener(new PanelButtonMouseAdapter(paneCont){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelCont);
			}
		});
		paneCont.setBackground(new Color(51, 153, 204));
		paneCont.setBounds(0, 266, 300, 43);
		Meniu.add(paneCont);
		paneCont.setLayout(null);
		
		JLabel lblCont = new JLabel("CONT");
		lblCont.setHorizontalAlignment(SwingConstants.LEFT);
		lblCont.setForeground(Color.WHITE);
		lblCont.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCont.setBackground(Color.WHITE);
		lblCont.setBounds(121, 10, 169, 23);
		paneCont.add(lblCont);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		Image img4 = new ImageIcon(this.getClass().getResource("/contract.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblNewLabel_1_3.setIcon(new ImageIcon(img4));
		lblNewLabel_1_3.setBounds(66, 0, 45, 43);
		paneCont.add(lblNewLabel_1_3);
		
		final JPanel paneTranzactie = new JPanel();
		paneTranzactie.addMouseListener(new PanelButtonMouseAdapter(paneTranzactie){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelTranzactie);
			}
		});
		paneTranzactie.setBackground(new Color(51, 153, 204));
		paneTranzactie.setBounds(0, 350, 300, 43);
		Meniu.add(paneTranzactie);
		paneTranzactie.setLayout(null);
		
		JLabel lblTranzactie = new JLabel("TRANZACTIE");
		lblTranzactie.setHorizontalAlignment(SwingConstants.LEFT);
		lblTranzactie.setForeground(Color.WHITE);
		lblTranzactie.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTranzactie.setBackground(Color.WHITE);
		lblTranzactie.setBounds(121, 10, 169, 23);
		paneTranzactie.add(lblTranzactie);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		Image img6 = new ImageIcon(this.getClass().getResource("/t.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblNewLabel_1_5.setIcon(new ImageIcon(img6));
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(66, 0, 45, 43);
		paneTranzactie.add(lblNewLabel_1_5);
		
		JPanel paneLogOut = new JPanel();
		paneLogOut.addMouseListener(new PanelButtonMouseAdapter(paneLogOut){
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Sigur vrei sa te deloghezi?") == 0) {
					FrameLogin frameLogin = new FrameLogin();
					frameLogin.setVisible(true);
					FrameDashboard.this.dispose();
				}
			}
		});
		paneLogOut.setBackground(new Color(51, 153, 204));
		paneLogOut.setBounds(10, 468, 280, 43);
		Meniu.add(paneLogOut);
		paneLogOut.setLayout(null);
		
		JLabel lblIesire = new JLabel("EXIT");
		lblIesire.setHorizontalAlignment(SwingConstants.LEFT);
		lblIesire.setForeground(Color.WHITE);
		lblIesire.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIesire.setBackground(Color.WHITE);
		lblIesire.setBounds(111, 10, 169, 23);
		paneLogOut.add(lblIesire);
		
		JPanel paneHome = new JPanel();
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
		});
		paneHome.setLayout(null);
		paneHome.setBackground(new Color(51, 153, 204));
		paneHome.setBounds(0, 390, 300, 43);
		Meniu.add(paneHome);
		JLabel lblHome = new JLabel("HOME");
		lblHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHome.setBackground(Color.WHITE);
		lblHome.setBounds(121, 10, 169, 23);
		paneHome.add(lblHome);
		
		JLabel lblNewLabel_1_6 = new JLabel("");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setBounds(66, 0, 45, 43);
		paneHome.add(lblNewLabel_1_6);
		
		
		final JLabel lblExit = new JLabel("X");
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblExit.setBounds(891, 0, 20, 20);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Sigur vrei sa inchizi aceasta aplicatie?", "Confrim", JOptionPane.YES_NO_OPTION) == 0) { 
					FrameDashboard.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(Color.WHITE);
			}
		});
		contentPane.add(lblExit);
		
		JPanel paneMainContent = new JPanel();
		paneMainContent.setBounds(310, 10, 580, 538);
		contentPane.add(paneMainContent);
		paneMainContent.setLayout(null);
		
		paneMainContent.add(panelCard);
		paneMainContent.add(panelBanca);
		paneMainContent.add(panelPosesor);
		paneMainContent.add(panelTranzactie);
		paneMainContent.add(panelLegatura);
		paneMainContent.add(panelCont);
		paneMainContent.add(panelHome);

		
		menuClicked(panelCard);
	}
	
	public void menuClicked(JPanel panel) {
		panelCard.setVisible(false);
		panelBanca.setVisible(false);
		panelPosesor.setVisible(false);
		panelTranzactie.setVisible(false);
		panelLegatura.setVisible(false);
		panelCont.setVisible(false);		
		panelHome.setVisible(false);

		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter implements MouseListener{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 15, 204));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(51, 153, 204));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60, 179, 113));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(51, 153, 204));
		}

	}
	
}
