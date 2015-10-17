import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class StartScreen {
	Timer timervar = new Timer();
	public int countervar;
	
	
	public int timer2var = 0;
	public int timer1var = 0;
	
	public int time1 = 0;
	public int time2 = 0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartScreen window = new StartScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		final GridOneFun getValue = new GridOneFun();
		frame = new JFrame();
		frame.setBounds(100, 100, 731, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(10, 430, 89, 23);
		frame.getContentPane().add(btnStart);
		
		/**
		 * Initialize the contents for Grid One.
		 */
		
		final JPanel panelGridOne = new JPanel();
		panelGridOne.setBounds(10, 10, 695, 412);
		frame.getContentPane().add(panelGridOne);
		panelGridOne.setLayout(null);
		panelGridOne.setVisible(false);
		
		GridsFill loadGrid = new GridsFill();

		final JPanel panelGrid1 = new JPanel();
		panelGrid1.setBounds(10, 11, 361, 394);
		panelGridOne.add(panelGrid1);
		panelGrid1.setLayout(new GridLayout(15, 15, 5, 5));
		final JLabel[][] labels = new JLabel[15][15];
		for (int r = 0; r < 15; r++){
			for (int c = 0; c < 15; c++){
				labels[r][c] = new JLabel(loadGrid.CodeGridOne[r][c], SwingConstants.CENTER);
				labels[r][c].setBorder(BorderFactory.createLineBorder(Color.black));
				panelGrid1.add(labels[r][c]);
			}
		}
		JLabel lbl1GTimer = new JLabel("Timer:");
		lbl1GTimer.setBounds(381, 11, 57, 14);
		panelGridOne.add(lbl1GTimer);
		
		JLabel lbl1G1 = new JLabel("1:");
		lbl1G1.setBounds(381, 52, 10, 14);
		panelGridOne.add(lbl1G1);
		
		JLabel lbl1G2 = new JLabel("2:");
		lbl1G2.setBounds(381, 77, 10, 14);
		panelGridOne.add(lbl1G2);

		JLabel lbl1G3 = new JLabel("3:");
		lbl1G3.setBounds(381, 102, 10, 14);
		panelGridOne.add(lbl1G3);

		JLabel lbl1G4 = new JLabel("4:");
		lbl1G4.setBounds(381, 127, 10, 14);
		panelGridOne.add(lbl1G4);

		JLabel lbl1G5 = new JLabel("5:");
		lbl1G5.setBounds(381, 152, 10, 14);
		panelGridOne.add(lbl1G5);
		
		JLabel lbl1G6 = new JLabel("6:");
		lbl1G6.setBounds(381, 177, 10, 14);
		panelGridOne.add(lbl1G6);
		
		JLabel lbl1G7 = new JLabel("7:");
		lbl1G7.setBounds(381, 202, 10, 14);
		panelGridOne.add(lbl1G7);
		
		JLabel lbl1G8 = new JLabel("8:");
		lbl1G8.setBounds(381, 227, 10, 14);
		panelGridOne.add(lbl1G8);
		
		JLabel lbl1G9 = new JLabel("9:");
		lbl1G9.setBounds(381, 252, 10, 14);
		panelGridOne.add(lbl1G9);
		
		JLabel lbl1G10 = new JLabel("10:");
		lbl1G10.setBounds(381, 277, 26, 14);
		panelGridOne.add(lbl1G10);
		
		JLabel lbl1G11 = new JLabel("11:");
		lbl1G11.setBounds(381, 302, 26, 14);
		panelGridOne.add(lbl1G11);
		
		JLabel lbl1G12 = new JLabel("12:");
		lbl1G12.setBounds(381, 327, 26, 14);
		panelGridOne.add(lbl1G12);
		
		JLabel lbl1G13 = new JLabel("13:");
		lbl1G13.setBounds(381, 352, 26, 14);
		panelGridOne.add(lbl1G13);
		
		JLabel lbl1G14 = new JLabel("14:");
		lbl1G14.setBounds(448, 52, 29, 14);
		panelGridOne.add(lbl1G14);
		
		JLabel lbl1G15 = new JLabel("15:");
		lbl1G15.setBounds(448, 77, 29, 14);
		panelGridOne.add(lbl1G15);
		
		JLabel lbl1G16 = new JLabel("16:");
		lbl1G16.setBounds(448, 102, 29, 14);
		panelGridOne.add(lbl1G16);
		
		JLabel lbl1G17 = new JLabel("17:");
		lbl1G17.setBounds(448, 127, 29, 14);
		panelGridOne.add(lbl1G17);
		
		JLabel lbl1G18 = new JLabel("18:");
		lbl1G18.setBounds(448, 152, 29, 14);
		panelGridOne.add(lbl1G18);
		
		JLabel lbl1G19 = new JLabel("19:");
		lbl1G19.setBounds(448, 177, 29, 14);
		panelGridOne.add(lbl1G19);
		
		JLabel lbl1G20 = new JLabel("20:");
		lbl1G20.setBounds(448, 202, 29, 14);
		panelGridOne.add(lbl1G20);
		
		JLabel lbl1G21 = new JLabel("21:");
		lbl1G21.setBounds(448, 227, 29, 14);
		panelGridOne.add(lbl1G21);
		
		JLabel lbl1G22 = new JLabel("22:");
		lbl1G22.setBounds(448, 252, 29, 14);
		panelGridOne.add(lbl1G22);
		
		JLabel lbl1G23 = new JLabel("23:");
		lbl1G23.setBounds(448, 277, 29, 14);
		panelGridOne.add(lbl1G23);
		
		JLabel lbl1G24 = new JLabel("24:");
		lbl1G24.setBounds(448, 302, 29, 14);
		panelGridOne.add(lbl1G24);
		
		JLabel lbl1G25 = new JLabel("25:");
		lbl1G25.setBounds(448, 327, 29, 14);
		panelGridOne.add(lbl1G25);
		
		JLabel lbl1G26 = new JLabel("26:");
		lbl1G26.setBounds(448, 352, 29, 14);
		panelGridOne.add(lbl1G26);
		
		final JTextField txt1G1 = new JTextField();
		txt1G1.setColumns(10);
		txt1G1.setBounds(401, 46, 26, 20);
		panelGridOne.add(txt1G1);
		
		final JTextField txt1G2 = new JTextField();
		txt1G2.setColumns(10);
		txt1G2.setBounds(401, 71, 26, 20);
		panelGridOne.add(txt1G2);
		
		final JTextField txt1G3 = new JTextField();
		txt1G3.setColumns(10);
		txt1G3.setBounds(401, 96, 26, 20);
		panelGridOne.add(txt1G3);
		
		final JTextField txt1G4 = new JTextField();
		txt1G4.setColumns(10);
		txt1G4.setBounds(401, 121, 26, 20);
		panelGridOne.add(txt1G4);
		
		final JTextField txt1G5 = new JTextField();
		txt1G5.setColumns(10);
		txt1G5.setBounds(401, 146, 26, 20);
		panelGridOne.add(txt1G5);
		
		final JTextField txt1G6 = new JTextField();
		txt1G6.setColumns(10);
		txt1G6.setBounds(401, 171, 26, 20);
		panelGridOne.add(txt1G6);
		
		final JTextField txt1G7 = new JTextField();
		txt1G7.setColumns(10);
		txt1G7.setBounds(401, 196, 26, 20);
		panelGridOne.add(txt1G7);
		
		final JTextField txt1G8 = new JTextField();
		txt1G8.setColumns(10);
		txt1G8.setBounds(401, 221, 26, 20);
		panelGridOne.add(txt1G8);
		
		final JTextField txt1G9 = new JTextField();
		txt1G9.setColumns(10);
		txt1G9.setBounds(401, 246, 26, 20);
		panelGridOne.add(txt1G9);
		
		final JTextField txt1G10 = new JTextField();
		txt1G10.setColumns(10);
		txt1G10.setBounds(401, 271, 26, 20);
		panelGridOne.add(txt1G10);
		
		final JTextField txt1G11 = new JTextField();
		txt1G11.setColumns(10);
		txt1G11.setBounds(401, 296, 26, 20);
		panelGridOne.add(txt1G11);
		
		final JTextField txt1G12 = new JTextField();
		txt1G12.setColumns(10);
		txt1G12.setBounds(401, 321, 26, 20);
		panelGridOne.add(txt1G12);
		
		final JTextField txt1G13 = new JTextField();
		txt1G13.setColumns(10);
		txt1G13.setBounds(401, 346, 26, 20);
		panelGridOne.add(txt1G13);
		
		final JTextField txt1G14 = new JTextField();
		txt1G14.setColumns(10);
		txt1G14.setBounds(476, 46, 26, 20);
		panelGridOne.add(txt1G14);
		
		final JTextField txt1G15 = new JTextField();
		txt1G15.setColumns(10);
		txt1G15.setBounds(476, 71, 26, 20);
		panelGridOne.add(txt1G15);
		
		final JTextField txt1G16 = new JTextField();
		txt1G16.setColumns(10);
		txt1G16.setBounds(476, 96, 26, 20);
		panelGridOne.add(txt1G16);
		
		final JTextField txt1G17 = new JTextField();
		txt1G17.setColumns(10);
		txt1G17.setBounds(476, 121, 26, 20);
		panelGridOne.add(txt1G17);
		
		final JTextField txt1G18 = new JTextField();
		txt1G18.setColumns(10);
		txt1G18.setBounds(476, 146, 26, 20);
		panelGridOne.add(txt1G18);
		
		final JTextField txt1G19 = new JTextField();
		txt1G19.setColumns(10);
		txt1G19.setBounds(476, 171, 26, 20);
		panelGridOne.add(txt1G19);
		
		final JTextField txt1G20 = new JTextField();
		txt1G20.setColumns(10);
		txt1G20.setBounds(476, 196, 26, 20);
		panelGridOne.add(txt1G20);
		
		final JTextField txt1G21 = new JTextField();
		txt1G21.setColumns(10);
		txt1G21.setBounds(476, 221, 26, 20);
		panelGridOne.add(txt1G21);
		
		final JTextField txt1G22 = new JTextField();
		txt1G22.setColumns(10);
		txt1G22.setBounds(476, 246, 26, 20);
		panelGridOne.add(txt1G22);
		
		final JTextField txt1G23 = new JTextField();
		txt1G23.setColumns(10);
		txt1G23.setBounds(476, 271, 26, 20);
		panelGridOne.add(txt1G23);
		
		final JTextField txt1G24 = new JTextField();
		txt1G24.setColumns(10);
		txt1G24.setBounds(476, 296, 26, 20);
		panelGridOne.add(txt1G24);
		
		final JTextField txt1G25 = new JTextField();
		txt1G25.setColumns(10);
		txt1G25.setBounds(476, 321, 26, 20);
		panelGridOne.add(txt1G25);
		
		final JTextField txt1G26 = new JTextField();
		txt1G26.setColumns(10);
		txt1G26.setBounds(476, 346, 26, 20);
		panelGridOne.add(txt1G26);
		
		JButton btn1GRestart = new JButton("Restart");
		btn1GRestart.setBounds(512, 136, 89, 23);
		panelGridOne.add(btn1GRestart);
		
		JButton btn1GCheck = new JButton("Check");
		btn1GCheck.setBounds(512, 46, 89, 23);
		panelGridOne.add(btn1GCheck);
	    
		JButton btn1GHint = new JButton("Hint");
		btn1GHint.setBounds(512, 91, 89, 23);
		panelGridOne.add(btn1GHint);
	    
		JButton btn1GFinish = new JButton("Finish");
		btn1GFinish.setBounds(512, 181, 89, 23);
		panelGridOne.add(btn1GFinish);
		
		final JLabel lbl1GTimeValue = new JLabel("00:00");
		lbl1GTimeValue.setBounds(425, 11, 46, 14);
		panelGridOne.add(lbl1GTimeValue);
		
		/**
		 * End of Grid One Initialization.
		 */
		
		/**
		 * Initialize the contents for Grid Two.
		 */
		final JPanel panelGridTwo = new JPanel();
		panelGridTwo.setBounds(10, 10, 695, 412);
		frame.getContentPane().add(panelGridTwo);
		panelGridTwo.setLayout(null);
		panelGridTwo.setVisible(false);
		frame.getContentPane().add(panelGridTwo);
		
		JPanel panelGrid2 = new JPanel();
		panelGrid2.setBounds(10, 11, 361, 394);
		panelGrid2.setLayout(new GridLayout(15, 15, 5, 5));
		panelGridTwo.add(panelGrid2);
		
		final JLabel[][] labelsG2 = new JLabel[15][15];
		for (int r = 0; r < 15; r++){
			for (int c = 0; c < 15; c++){
				labelsG2[r][c] = new JLabel(loadGrid.CodeGridTwo[r][c], SwingConstants.CENTER);
				labelsG2[r][c].setBorder(BorderFactory.createLineBorder(Color.black));
				panelGrid2.add(labelsG2[r][c]);
			}
		}
	
	    JLabel lbl2GTimer = new JLabel("Timer:");
		lbl2GTimer.setBounds(381, 11, 57, 14);
	    panelGridTwo.add(lbl2GTimer);
	    
		JLabel lbl2G1 = new JLabel("1:");
		lbl2G1.setBounds(381, 52, 10, 14);
	    panelGridTwo.add(lbl2G1);
	    
	    JLabel lbl2G2 = new JLabel("2:");
		lbl2G2.setBounds(381, 77, 10, 14);
		panelGridTwo.add(lbl2G2);
	    
	    JLabel lbl2G3 = new JLabel("3:");
		lbl2G3.setBounds(381, 102, 10, 14);
		panelGridTwo.add(lbl2G3);
	    
	    JLabel lbl2G4 = new JLabel("4:");
		lbl2G4.setBounds(381, 127, 10, 14);
	    panelGridTwo.add(lbl2G4);
	    
		JLabel lbl2G5 = new JLabel("5:");
		lbl2G5.setBounds(381, 152, 10, 14);
		panelGridTwo.add(lbl2G5);
	    
	    JLabel lbl2G6 = new JLabel("6:");
		lbl2G6.setBounds(381, 177, 10, 14);
		panelGridTwo.add(lbl2G6);
	    
	    JLabel lbl2G7 = new JLabel("7:");
		lbl2G7.setBounds(381, 202, 10, 14);
		panelGridTwo.add(lbl2G7);
	    
	    JLabel lbl2G8 = new JLabel("8:");
		lbl2G8.setBounds(381, 227, 10, 14);
		panelGridTwo.add(lbl2G8);
	    
	    JLabel lbl2G9 = new JLabel("9:");
		lbl2G9.setBounds(381, 252, 10, 14);
		panelGridTwo.add(lbl2G9);
	    
	    JLabel lbl2G10 = new JLabel("10:");
		lbl2G10.setBounds(381, 277, 26, 14);
		panelGridTwo.add(lbl2G10);
	    
	    JLabel lbl2G11 = new JLabel("11:");
		lbl2G11.setBounds(381, 302, 26, 14);
		panelGridTwo.add(lbl2G11);
	    
	    JLabel lbl2G12 = new JLabel("12:");
		lbl2G12.setBounds(381, 327, 26, 14);
		panelGridTwo.add(lbl2G12);
	    
	    JLabel lbl2G13 = new JLabel("13:");
		lbl2G13.setBounds(381, 352, 26, 14);
		panelGridTwo.add(lbl2G13);
	    
	    JLabel lbl2G14 = new JLabel("14:");
		lbl2G14.setBounds(448, 52, 29, 14);
		panelGridTwo.add(lbl2G14);
	    
	    JLabel lbl2G15 = new JLabel("15:");
		lbl2G15.setBounds(448, 77, 29, 14);
		panelGridTwo.add(lbl2G15);
	    
	    JLabel lbl2G16 = new JLabel("16:");
		lbl2G16.setBounds(448, 102, 29, 14);
		panelGridTwo.add(lbl2G16);
	    
	    JLabel lbl2G17 = new JLabel("17:");
		lbl2G17.setBounds(448, 127, 29, 14);
		panelGridTwo.add(lbl2G17);
	    
	    JLabel lbl2G18 = new JLabel("18:");
		lbl2G18.setBounds(448, 152, 29, 14);
		panelGridTwo.add(lbl2G18);
	    
	    JLabel lbl2G19 = new JLabel("19:");
		lbl2G19.setBounds(448, 177, 29, 14);
		panelGridTwo.add(lbl2G19);
	    
	    JLabel lbl2G20 = new JLabel("20:");
		lbl2G20.setBounds(448, 202, 29, 14);
		panelGridTwo.add(lbl2G20);
	    
	    JLabel lbl2G21 = new JLabel("21:");
		lbl2G21.setBounds(448, 227, 29, 14);
		panelGridTwo.add(lbl2G21);
	    
	    JLabel lbl2G22 = new JLabel("22:");
		lbl2G22.setBounds(448, 252, 29, 14);
		panelGridTwo.add(lbl2G22);
	    
	    JLabel lbl2G23 = new JLabel("23:");
		lbl2G23.setBounds(448, 277, 29, 14);
		panelGridTwo.add(lbl2G23);
	    
	    JLabel lbl2G24 = new JLabel("24:");
		lbl2G24.setBounds(448, 302, 29, 14);
		panelGridTwo.add(lbl2G24);
	    
	    JLabel lbl2G25 = new JLabel("25:");
		lbl2G25.setBounds(448, 327, 29, 14);
		panelGridTwo.add(lbl2G25);
	    
	    JLabel lbl2G26 = new JLabel("26:");
		lbl2G26.setBounds(448, 352, 29, 14);
		panelGridTwo.add(lbl2G26);
	    
		final JTextField txt2G1 = new JTextField();
		txt2G1.setColumns(10);
		txt2G1.setBounds(401, 46, 26, 20);
		panelGridTwo.add(txt2G1);
	    
		final JTextField txt2G2 = new JTextField();
		txt2G2.setColumns(10);
		txt2G2.setBounds(401, 71, 26, 20);
		panelGridTwo.add(txt2G2);
	    
		final JTextField txt2G3 = new JTextField();
		txt2G3.setColumns(10);
		txt2G3.setBounds(401, 96, 26, 20);
		panelGridTwo.add(txt2G3);
	    
		final JTextField txt2G4 = new JTextField();
		txt2G4.setColumns(10);
		txt2G4.setBounds(401, 121, 26, 20);
		panelGridTwo.add(txt2G4);
	    
		final JTextField txt2G5 = new JTextField();
		txt2G5.setColumns(10);
		txt2G5.setBounds(401, 146, 26, 20);
		panelGridTwo.add(txt2G5);
	    
		final JTextField txt2G6 = new JTextField();
		txt2G6.setColumns(10);
		txt2G6.setBounds(401, 171, 26, 20);
		panelGridTwo.add(txt2G6);
	    
		final JTextField txt2G7 = new JTextField();
		txt2G7.setColumns(10);
		txt2G7.setBounds(401, 196, 26, 20);
		panelGridTwo.add(txt2G7);
	    
		final JTextField txt2G8 = new JTextField();
		txt2G8.setColumns(10);
		txt2G8.setBounds(401, 221, 26, 20);
		panelGridTwo.add(txt2G8);
	    
		final JTextField txt2G9 = new JTextField();
		txt2G9.setColumns(10);
		txt2G9.setBounds(401, 246, 26, 20);
		panelGridTwo.add(txt2G9);
	    
		final JTextField txt2G10 = new JTextField();
		txt2G10.setColumns(10);
		txt2G10.setBounds(401, 271, 26, 20);
		panelGridTwo.add(txt2G10);
	    
		final JTextField txt2G11 = new JTextField();
		txt2G11.setColumns(10);
		txt2G11.setBounds(401, 296, 26, 20);
		panelGridTwo.add(txt2G11);
	    
		final JTextField txt2G12 = new JTextField();
		txt2G12.setColumns(10);
		txt2G12.setBounds(401, 321, 26, 20);
		panelGridTwo.add(txt2G12);
	    
		final JTextField txt2G13 = new JTextField();
		txt2G13.setColumns(10);
		txt2G13.setBounds(401, 346, 26, 20);
		panelGridTwo.add(txt2G13);
	    
		final JTextField txt2G14 = new JTextField();
		txt2G14.setColumns(10);
		txt2G14.setBounds(476, 46, 26, 20);
		panelGridTwo.add(txt2G14);
	    
		final JTextField txt2G15 = new JTextField();
		txt2G15.setColumns(10);
		txt2G15.setBounds(476, 71, 26, 20);
		panelGridTwo.add(txt2G15);
	    
		final JTextField txt2G16 = new JTextField();
		txt2G16.setColumns(10);
		txt2G16.setBounds(476, 96, 26, 20);
		panelGridTwo.add(txt2G16);
	    
		final JTextField txt2G17 = new JTextField();
		txt2G17.setColumns(10);
		txt2G17.setBounds(476, 121, 26, 20);
		panelGridTwo.add(txt2G17);
	    
		final JTextField txt2G18 = new JTextField();
		txt2G18.setColumns(10);
		txt2G18.setBounds(476, 146, 26, 20);
		panelGridTwo.add(txt2G18);
	    
		final JTextField txt2G19 = new JTextField();
		txt2G19.setColumns(10);
		txt2G19.setBounds(476, 171, 26, 20);
		panelGridTwo.add(txt2G19);
	    
		final JTextField txt2G20 = new JTextField();
		txt2G20.setColumns(10);
		txt2G20.setBounds(476, 196, 26, 20);
		panelGridTwo.add(txt2G20);
	    
		final JTextField txt2G21 = new JTextField();
		txt2G21.setColumns(10);
		txt2G21.setBounds(476, 221, 26, 20);
		panelGridTwo.add(txt2G21);
	    
		final JTextField txt2G22 = new JTextField();
		txt2G22.setColumns(10);
		txt2G22.setBounds(476, 246, 26, 20);
	    panelGridTwo.add(txt2G22);
	    
	    final JTextField txt2G23 = new JTextField();
		txt2G23.setColumns(10);
		txt2G23.setBounds(476, 271, 26, 20);
	    panelGridTwo.add(txt2G23);
	    
	    final JTextField txt2G24 = new JTextField();
		txt2G24.setColumns(10);
		txt2G24.setBounds(476, 296, 26, 20);
		panelGridTwo.add(txt2G24);
	    
		final JTextField txt2G25 = new JTextField();
		txt2G25.setColumns(10);
		txt2G25.setBounds(476, 321, 26, 20);
		panelGridTwo.add(txt2G25);
	    
		final JTextField txt2G26 = new JTextField();
		txt2G26.setColumns(10);
		txt2G26.setBounds(476, 346, 26, 20);
		panelGridTwo.add(txt2G26);
	    
	    JButton btn2GRestart = new JButton("Restart");
		btn2GRestart.setBounds(512, 136, 89, 23);
		panelGridTwo.add(btn2GRestart);
	    
	    JButton btn2GCheck = new JButton("Check");
		btn2GCheck.setBounds(512, 46, 89, 23);
	    panelGridTwo.add(btn2GCheck);
	    
	    JButton btn2GHint = new JButton("Hint");
		btn2GHint.setBounds(512, 91, 89, 23);
	    panelGridTwo.add(btn2GHint);
	    
	    JButton btn2GFinish = new JButton("Finish");
		btn2GFinish.setBounds(512, 181, 89, 23);
	    panelGridTwo.add(btn2GFinish);
		
	    final JLabel lbl2GTimeValue = new JLabel("00:00");
		lbl2GTimeValue.setBounds(425, 11, 46, 14);
		panelGridTwo.add(lbl2GTimeValue);
		
		/**
		 * End of Grid Two Initialization.
		 */
		/**
		 * Initialize the contents for High Scores.
		 */
		JPanel panelHighScores = new JPanel();
		panelHighScores.setBounds(40, 10, 10, 10);
		panelHighScores.setLayout(null);
		
		/**
		 * End of High Scores Initialization.
		 */
		
		/**
		 * Start Screen Action Listeners.
		 */
	
		final Stopwatch watch = new Stopwatch();
		final TimerTask ttaskvar = new TimerTask(){

		public void run() {
			countervar++;
			lbl1GTimeValue.setText("" + countervar);
				
			if(timer1var == 0){
					
					
			}else time1++;
				lbl1GTimeValue.setText("" + time1);
				
				
			if(timer2var == 0){
					
			}else time2++;
				lbl2GTimeValue.setText("" + time2);		
			}
			
		};
		
		timervar.scheduleAtFixedRate(ttaskvar, 0, 1000);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Random getRandomGrid = new Random();
				int randomGridInt = getRandomGrid.nextInt(2);
				if(randomGridInt == 0){
					if(timer1var == 1){
						timer1var = 99;
					}
					if(timer1var == 0){
						timer1var = 1;
					}
						
					if(timer1var == 99){
						timer1var = 0;
					}
					panelGridOne.setVisible(true);
				}else if (randomGridInt == 1){
					if(timer2var == 1){
						timer2var = 99;
					}
					if(timer2var == 0){
						timer2var = 1;
					}
						
					if(timer2var == 99){
						timer2var = 0;
					}
				
					panelGridTwo.setVisible(true);
				}
				txt1G8.setText("Q");
				txt1G11.setText("X");
				txt1G20.setText("J");
				txt2G1.setText("K");
				txt2G11.setText("X");
				txt2G12.setText("W");
				txt2G17.setText("Q");
				watch.StopwatchStart();
				
			}
		});
		
		/**
		 * End of Start Screen Action Listeners.
		 */
		
		/**
		 * Grid One Action Listeners.
		 */

		txt1G1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G1Val = txt1G1.getText();
				getValue.setTxt1G1(txt1G1Val);
				int[] row = {0, 10, 11, 14, 14};
				int[] col = {14, 9, 8, 3, 6};
				for (int i = 0; i < row.length; i++){
						labels[row[i]][col[i]].setText(getValue.getTxt1G1());
				}
			}
		});
		
		txt1G2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G2Val = txt1G2.getText();
				getValue.setTxt1G2(txt1G2Val);
				int[] row = {3, 4, 12};
				int[] col = {6, 2, 9};
				for (int i = 0; i < row.length; i++){
						labels[row[i]][col[i]].setText(getValue.getTxt1G2());
				}
			}
		});
		
		txt1G3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G3Val = txt1G3.getText();
				getValue.setTxt1G3(txt1G3Val);
				int[] row = {0, 0, 0, 2, 3, 4, 8, 9, 10, 10, 12, 12, 12, 13, 14, 14, 14};
				int[] col = {0, 3, 7, 10, 4, 5, 9, 14, 0, 13, 0, 4, 11, 12, 1, 5, 11};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G3());
				}
			}
		});
		
		txt1G4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G4Val = txt1G4.getText();
				getValue.setTxt1G4(txt1G4Val);
				int[] row = {2, 2, 3, 3, 4, 4, 4, 5, 6, 6, 8, 8, 10, 12, 12, 12, 13, 14, 14};
				int[] col = {4, 13, 0, 12, 3, 13, 14, 4, 0, 2, 8, 12, 7, 7, 10, 13, 14, 10, 13};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G4());
				}
			}
		});
		
		txt1G5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G5Val = txt1G5.getText();
				getValue.setTxt1G5(txt1G5Val);
				int[] row = {0, 4, 6, 6, 9, 9, 11};
				int[] col = {11, 0, 3, 11, 2, 4, 10};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G5());
				}
			}
		});
		
		txt1G6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G6Val = txt1G6.getText();
				getValue.setTxt1G6(txt1G6Val);
				int[] row = {0, 0, 0, 0, 2, 5, 6, 6, 8, 8, 8, 9, 10, 10, 13};
				int[] col = {1, 2, 8, 13, 12, 0, 4, 7, 6, 10, 14, 8, 12, 14, 6};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G6());
				}
			}
		});
		
		txt1G7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G7Val = txt1G7.getText();
				getValue.setTxt1G7(txt1G7Val); 
				int[] row = {2, 2, 7, 8, 9, 10, 12, 14};
				int[] col = {9, 11, 14, 5, 12, 11, 6, 7};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G7());
				}
			}
		});
		
		txt1G8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getValue.getTxt1G8();
			}
		});
		
		txt1G9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G9Val = txt1G9.getText();
				getValue.setTxt1G9(txt1G9Val); 
				int[] row = {3, 4};
				int[] col = {14, 11};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G9());
				}
			}
		});
		
		txt1G10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G10Val = txt1G10.getText();
				getValue.setTxt1G10(txt1G10Val);
				int[] row = {1, 2, 5, 7, 7, 7, 7, 11, 13, 14};
				int[] col = {4, 7, 12, 0, 2, 6, 10, 4, 10, 14};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G10());
				}
			}
		});
		
		txt1G11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getValue.getTxt1G11();
			}
		});
		
		txt1G12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G12Val = txt1G12.getText();
				getValue.setTxt1G12(txt1G12Val);
				int[] row = {3, 4, 11, 11, 12, 13};
				int[] col = {2, 1, 2, 14, 5, 4};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G12());
				}
			}
		});
		
		txt1G13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G13Val = txt1G13.getText();
				getValue.setTxt1G13(txt1G13Val);
				labels[3][8].setText(getValue.getTxt1G13());
			}
		});
		
		txt1G14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G14Val = txt1G14.getText();
				getValue.setTxt1G14(txt1G14Val);
				int[] row = {3, 4, 5, 6, 10, 12, 13, 14};
				int[] col = {10, 6, 2, 1, 3, 3, 0, 12};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G14());
				}
			}
		});
		
		txt1G15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G15Val = txt1G15.getText();
				getValue.setTxt1G15(txt1G15Val);
				int[] row = {7, 9, 9};
				int[] col = {4, 6, 10};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G15());
				}
			}
		});
		
		txt1G16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G16Val = txt1G16.getText();
				getValue.setTxt1G16(txt1G16Val);
				int[] row = {0, 1, 2, 4, 4, 5, 6, 6, 10, 13};
				int[] col = {10, 14, 2, 7, 8, 6, 6, 8, 2, 2};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G16());
				}
			}
		});
		
		txt1G17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G17Val = txt1G17.getText();
				getValue.setTxt1G17(txt1G17Val);
				int[] row = {7, 8, 8, 14};
				int[] col = {8, 3, 11, 0};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G17());
				}
			}
		});
		
		txt1G18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G18Val = txt1G18.getText();
				getValue.setTxt1G18(txt1G18Val);
				int[] row = {0, 1, 1, 2, 2, 5, 6, 8, 10, 11, 12};
				int[] col = {9, 2, 8, 1, 14, 14, 5, 7, 8, 6, 14};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G18());
				}
			}
		});
		
		txt1G19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G19Val = txt1G19.getText();
				getValue.setTxt1G19(txt1G19Val);
				int[] row = {0, 1, 2, 4, 5, 6, 8, 9, 14};
				int[] col = {5, 12, 5, 12, 8, 9, 13, 0, 2};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G19());
				}
			}
		});
		
		txt1G20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getValue.getTxt1G20();
			}
		});
		
		txt1G21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G21Val = txt1G21.getText();
				getValue.setTxt1G21(txt1G21Val);
				int[] row = {2, 14};
				int[] col = {3, 9};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G21());
				}
			}
		});
		
		txt1G22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G22Val = txt1G22.getText();
				getValue.setTxt1G22(txt1G22Val);
				int[] row = {0, 0, 2, 6, 8, 10, 11};
				int[] col = {4, 12, 8, 10, 4, 6, 12};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G22());
				}
			}
		});
		
		txt1G23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G23Val = txt1G23.getText();
				getValue.setTxt1G23(txt1G23Val);
				int[] row = {1, 11, 12, 12};
				int[] col = {10, 0, 1, 2};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G23());
				}
			}
		});
		
		txt1G24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G24Val = txt1G24.getText();
				getValue.setTxt1G24(txt1G24Val);
				int[] row = {1, 2, 4, 7, 10};
				int[] col = {0, 0, 9, 12, 5};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G24());
				}
			}
		});
		
		txt1G25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G25Val = txt1G25.getText();
				getValue.setTxt1G25(txt1G25Val);
				int[] row = {5, 10, 14};
				int[] col = {10, 1, 4};
				for (int i = 0; i < row.length; i++){
					labels[row[i]][col[i]].setText(getValue.getTxt1G25());
				}
			}
		});
		
		txt1G26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1G26Val = txt1G26.getText();
				getValue.setTxt1G26(txt1G26Val);
				labels[12][12].setText(getValue.getTxt1G26());
			}
		});
		
		btn1GCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] row1 = {0, 10, 11, 14, 14};
				int[] col1 = {14, 9, 8, 3, 6};
				int[] row2 = {3, 4, 12};
				int[] col2 = {6, 2, 9};
				int[] row3 = {0, 0, 0, 2, 3, 4, 8, 9, 10, 10, 12, 12, 12, 13, 14, 14, 14};
				int[] col3 = {0, 3, 7, 10, 4, 5, 9, 14, 0, 13, 0, 4, 11, 12, 1, 5, 11};
				int[] row4 = {2, 2, 3, 3, 4, 4, 4, 5, 6, 6, 8, 8, 10, 12, 12, 12, 13, 14, 14};
				int[] col4 = {4, 13, 0, 12, 3, 13, 14, 4, 0, 2, 8, 12, 7, 7, 10, 13, 14, 10, 13};
				int[] row5 = {0, 4, 6, 6, 9, 9, 11};
				int[] col5 = {11, 0, 3, 11, 2, 4, 10};
				int[] row6 = {0, 0, 0, 0, 2, 5, 6, 6, 8, 8, 8, 9, 10, 10, 13};
				int[] col6 = {1, 2, 8, 13, 12, 0, 4, 7, 6, 10, 14, 8, 12, 14, 6};
				int[] row7 = {2, 2, 7, 8, 9, 10, 12, 14};
				int[] col7 = {9, 11, 14, 5, 12, 11, 6, 7};
				int[] row9 = {3, 4};
				int[] col9 = {14, 11};
				int[] row10 = {1, 2, 5, 7, 7, 7, 7, 11, 13, 14};
				int[] col10 = {4, 7, 12, 0, 2, 6, 10, 4, 10, 14};
				int[] row12 = {3, 4, 11, 11, 12, 13};
				int[] col12 = {2, 1, 2, 14, 5, 4};
				int[] row14 = {3, 4, 5, 6, 10, 12, 13, 14};
				int[] col14 = {10, 6, 2, 1, 3, 3, 0, 12};
				int[] row15 = {7, 9, 9};
				int[] col15 = {4, 6, 10};
				int[] row16 = {0, 1, 2, 4, 4, 5, 6, 6, 10, 13};
				int[] col16 = {10, 14, 2, 7, 8, 6, 6, 8, 2, 2};
				int[] row17 = {7, 8, 8, 14};
				int[] col17 = {8, 3, 11, 0};
				int[] row18 = {0, 1, 1, 2, 2, 5, 6, 8, 10, 11, 12};
				int[] col18 = {9, 2, 8, 1, 14, 14, 5, 7, 8, 6, 14};
				int[] row19 = {0, 1, 2, 4, 5, 6, 8, 9, 14};
				int[] col19 = {5, 12, 5, 12, 8, 9, 13, 0, 2};
				int[] row21 = {2, 14};
				int[] col21 = {3, 9};
				int[] row22 = {0, 0, 2, 6, 8, 10, 11};
				int[] col22 = {4, 12, 8, 10, 4, 6, 12};
				int[] row23 = {1, 11, 12, 12};
				int[] col23 = {10, 0, 1, 2};
				int[] row24 = {1, 2, 4, 7, 10};
				int[] col24 = {0, 0, 9, 12, 5};
				int[] row25 = {5, 10, 14};
				int[] col25 = {10, 1, 4};
				
				String currValue1 = getValue.getTxt1G1();
				String currValue2 = getValue.getTxt1G2();
				String currValue3 = getValue.getTxt1G3();
				String currValue4 = getValue.getTxt1G4();
				String currValue5 = getValue.getTxt1G5();
				String currValue6 = getValue.getTxt1G6();
				String currValue7 = getValue.getTxt1G7();
				String currValue9 = getValue.getTxt1G9();
				String currValue10 = getValue.getTxt1G10();
				String currValue12 = getValue.getTxt1G12();
				String currValue13 = getValue.getTxt1G13();
				String currValue14 = getValue.getTxt1G14();
				String currValue15 = getValue.getTxt1G15();
				String currValue16 = getValue.getTxt1G16();
				String currValue17 = getValue.getTxt1G17();
				String currValue18 = getValue.getTxt1G18();
				String currValue19 = getValue.getTxt1G19();
				String currValue21 = getValue.getTxt1G21();
				String currValue22 = getValue.getTxt1G22();
				String currValue23 = getValue.getTxt1G23();
				String currValue24 = getValue.getTxt1G24();
				String currValue25 = getValue.getTxt1G25();
				String currValue26 = getValue.getTxt1G26();
				
				if (currValue1 != null){
					if (currValue1.equalsIgnoreCase("Y")){
						for (int i = 0; i < row1.length; i++){
							labels[row1[i]][col1[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row1.length; i++){
							labels[row1[i]][col1[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue2 != null){
					if (currValue2.equalsIgnoreCase("B")){
						for (int i = 0; i < row2.length; i++){
							labels[row2[i]][col2[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row2.length; i++){
							labels[row2[i]][col2[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue3 != null){
					if (currValue3.equalsIgnoreCase("A")){
						for (int i = 0; i < row3.length; i++){
							labels[row3[i]][col3[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row3.length; i++){
							labels[row3[i]][col3[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if(currValue4 != null){
					if (currValue4.equalsIgnoreCase("E")){
						for (int i = 0; i < row4.length; i++){
							labels[row4[i]][col4[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row4.length; i++){
							labels[row4[i]][col4[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue5 != null){
					if (currValue5.equalsIgnoreCase("C")){
						for (int i = 0; i < row5.length; i++){
							labels[row5[i]][col5[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row5.length; i++){
							labels[row5[i]][col5[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue6 != null){
					if (currValue6.equalsIgnoreCase("T")){
						for (int i = 0; i < row6.length; i++){
							labels[row6[i]][col6[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row6.length; i++){
							labels[row6[i]][col6[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue7 != null){
					if (currValue7.equalsIgnoreCase("S")){
						for (int i = 0; i < row7.length; i++){
							labels[row7[i]][col7[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row7.length; i++){
							labels[row7[i]][col7[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue9 != null){
					if (currValue9.equalsIgnoreCase("K")){
						for (int i = 0; i < row9.length; i++){
							labels[row9[i]][col9[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row9.length; i++){
							labels[row9[i]][col9[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue10 != null){
					if (currValue10.equalsIgnoreCase("D")){
						for (int i = 0; i < row10.length; i++){
							labels[row10[i]][col10[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row10.length; i++){
							labels[row10[i]][col10[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue12 != null){
					if (currValue12.equalsIgnoreCase("U")){
						for (int i = 0; i < row12.length; i++){
							labels[row12[i]][col12[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row12.length; i++){
							labels[row12[i]][col12[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue13 != null){
					if (currValue13.equalsIgnoreCase("G")){
							labels[3][8].setBorder(BorderFactory.createLineBorder(Color.green));
					}else{
							labels[3][8].setBorder(BorderFactory.createLineBorder(Color.red));
					}
				}
				
				if (currValue14 != null){
					if (currValue14.equalsIgnoreCase("L")){
						for (int i = 0; i < row14.length; i++){
							labels[row14[i]][col14[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row14.length; i++){
							labels[row14[i]][col14[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue15 != null){
					if (currValue15.equalsIgnoreCase("H")){
						for (int i = 0; i < row15.length; i++){
							labels[row15[i]][col15[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row15.length; i++){
							labels[row15[i]][col15[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue16 != null){
					if (currValue16.equalsIgnoreCase("O")){
						for (int i = 0; i < row16.length; i++){
							labels[row16[i]][col16[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row16.length; i++){
							labels[row16[i]][col16[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue17 != null){
					if (currValue17.equalsIgnoreCase("M")){
						for (int i = 0; i < row17.length; i++){
							labels[row17[i]][col17[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row17.length; i++){
							labels[row17[i]][col17[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue18 != null){
					if (currValue18.equalsIgnoreCase("R")){
						for (int i = 0; i < row18.length; i++){
							labels[row18[i]][col18[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row18.length; i++){
							labels[row18[i]][col18[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue19 != null){
					if (currValue19.equalsIgnoreCase("N")){
						for (int i = 0; i < row19.length; i++){
							labels[row19[i]][col19[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row19.length; i++){
							labels[row19[i]][col19[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue21 != null){
					if (currValue21.equalsIgnoreCase("Z")){
						for (int i = 0; i < row21.length; i++){
							labels[row21[i]][col21[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row21.length; i++){
							labels[row21[i]][col21[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue22 != null){
					if (currValue22.equalsIgnoreCase("I")){
						for (int i = 0; i < row22.length; i++){
							labels[row22[i]][col22[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row22.length; i++){
							labels[row22[i]][col22[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue23 != null){
					if (currValue23.equalsIgnoreCase("P")){
						for (int i = 0; i < row23.length; i++){
							labels[row23[i]][col23[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row23.length; i++){
							labels[row23[i]][col23[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue24 != null){
					if (currValue24.equalsIgnoreCase("F")){
						for (int i = 0; i < row24.length; i++){
							labels[row24[i]][col24[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row24.length; i++){
							labels[row24[i]][col24[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue25 != null){
					if (currValue25.equalsIgnoreCase("W")){
						for (int i = 0; i < row25.length; i++){
							labels[row25[i]][col25[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row25.length; i++){
							labels[row25[i]][col25[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue26 != null){
					if (currValue26.equalsIgnoreCase("V")){
						labels[12][12].setBorder(BorderFactory.createLineBorder(Color.green));
					}else{
						labels[12][12].setBorder(BorderFactory.createLineBorder(Color.red));
					}
				}
			}
		});
		
		btn1GHint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] allValues = {"Y", "B", "A", "E", "C", "T", "S", "K", "D", "U", "G", "L", "H", "O", "M", "R", "N", "Z", "I", "P", "F", "W", "V"};
				Random getRandomHint = new Random();
				int hintIndex = getRandomHint.nextInt(26);
				int hintValue = hintIndex + 1;
				String currentHint = allValues[hintIndex];
				JOptionPane.showInputDialog("The letter for #" + hintValue + " is " + currentHint);
			}
		});
		
		btn1GFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] currValue = {getValue.getTxt1G1(), getValue.getTxt1G2(), getValue.getTxt1G3(), getValue.getTxt1G4() , getValue.getTxt1G5(), getValue.getTxt1G6(), getValue.getTxt1G7(),  getValue.getTxt1G9(), getValue.getTxt1G10(), getValue.getTxt1G12(), getValue.getTxt1G13(), getValue.getTxt1G14(), getValue.getTxt1G15(), getValue.getTxt1G16(), getValue.getTxt1G17(), getValue.getTxt1G18(), getValue.getTxt1G19(), getValue.getTxt1G21(), getValue.getTxt1G22(), getValue.getTxt1G23(), getValue.getTxt1G24(), getValue.getTxt1G25(), getValue.getTxt1G26()};
				String[] allValues = {"Y", "B", "A", "E", "C", "T", "S", "K", "D", "U", "G", "L", "H", "O", "M", "R", "N", "Z", "I", "P", "F", "W", "V"};
				if (currValue[0].equalsIgnoreCase(allValues[0]) && currValue[1].equalsIgnoreCase(allValues[1]) && currValue[2].equalsIgnoreCase(allValues[2]) && currValue[3].equalsIgnoreCase(allValues[3]) && currValue[4].equalsIgnoreCase(allValues[4]) && currValue[5].equalsIgnoreCase(allValues[5]) && currValue[6].equalsIgnoreCase(allValues[6]) && currValue[7].equalsIgnoreCase(allValues[7]) && currValue[8].equalsIgnoreCase(allValues[8]) && currValue[9].equalsIgnoreCase(allValues[9]) && currValue[10].equalsIgnoreCase(allValues[10]) && currValue[11].equalsIgnoreCase(allValues[11]) && currValue[12].equalsIgnoreCase(allValues[12]) && currValue[13].equalsIgnoreCase(allValues[13]) && currValue[14].equalsIgnoreCase(allValues[14]) && currValue[15].equalsIgnoreCase(allValues[15]) && currValue[16].equalsIgnoreCase(allValues[16]) && currValue[17].equalsIgnoreCase(allValues[17]) && currValue[18].equalsIgnoreCase(allValues[18]) && currValue[19].equalsIgnoreCase(allValues[19]) && currValue[20].equalsIgnoreCase(allValues[20]) && currValue[21].equalsIgnoreCase(allValues[21]) && currValue[22].equalsIgnoreCase(allValues[22])){
					double timeElapsed = watch.elapsedTime();
					ttaskvar.cancel();
					StoreScore saveScore = new StoreScore();
					saveScore.setScore(timeElapsed);
					saveScore.setScore(timeElapsed);
					JOptionPane.showMessageDialog(null, "Finished in " + timeElapsed);
					String userName;
					userName = JOptionPane.showInputDialog("Enter Name:");
					saveScore.setName(userName);
				}else{
					JOptionPane.showMessageDialog(null, "Game not finished");
				}
			}
		});
		
		/**
		 * End of Grid One Action Listeners.
		 */
		
		/**
		 * Grid Two Action Listeners.
		 */
		final GridTwoFun getValue2 = new GridTwoFun();
		txt2G1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getValue2.getTxt2G1();
			}
		});
		
		txt2G2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G2Val = txt2G2.getText();
				getValue2.setTxt2G2(txt2G2Val);
				int[] row = {0, 0, 2, 2, 4, 10, 14};
				int[] col = {12, 13, 11, 12, 5, 11, 8};
				for (int i = 0; i < row.length; i++){
					labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G2());
				}
			}
		});
		
		txt2G3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G3Val = txt2G3.getText();
				getValue2.setTxt2G3(txt2G3Val);
				int[] row = {0, 4, 4, 4, 4, 5, 9, 9, 12, 13, 14, 14};
				int[] col = {3, 0, 2, 11, 14, 6, 2, 4, 11, 10, 0, 14};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G3());
				}
			}
		});
		
		txt2G4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G4Val = txt2G4.getText();
				getValue2.setTxt2G4(txt2G4Val);
				int[] row = {2, 2, 3, 3, 6, 7, 8, 10, 10, 11, 11};
				int[] col = {6, 9, 0, 6, 14, 12, 2, 3, 13, 8, 14};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G4());
				}
			}
		});
		
		txt2G5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G5Val = txt2G5.getText();
				getValue2.setTxt2G5(txt2G5Val);
				int[] row = {2, 3, 3, 4, 5, 5, 6, 8, 8, 14};
				int[] col = {3, 8, 14, 1, 10, 12, 5, 1, 5, 7};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G5());
				}
			}
		});
		
		txt2G6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G6Val = txt2G6.getText();
				getValue2.setTxt2G6(txt2G6Val);
				labelsG2[0][10].setText(getValue2.getTxt2G6());
			}
		});
		
		txt2G7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G7Val = txt2G7.getText();
				getValue2.setTxt2G7(txt2G7Val);
				int[] row = {2, 7, 9};
				int[] col = {2, 4, 14};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G7());
				}
			}
		});
		
		txt2G8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G8Val = txt2G8.getText();
				getValue2.setTxt2G8(txt2G8Val);
				int[] row = {0, 1, 2, 2, 3, 5, 6, 9, 10, 11, 11, 12, 13, 14};
				int[] col = {11, 0, 1, 13, 2, 14, 9, 8, 10, 0, 4, 12, 8, 1};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G8());
				}
			}
		});
		
		txt2G9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G9Val = txt2G9.getText();
				getValue2.setTxt2G9(txt2G9Val);
				int[] row = {0, 0, 1, 1, 1, 2, 4, 4, 5, 5, 6, 10, 11, 12, 13, 13, 14};
				int[] col = {1, 7, 6, 10, 14, 7, 6, 13, 2, 8, 4, 14, 6, 14, 0, 4, 13};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G9());
				}
			}
		});
		
		txt2G10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G10Val = txt2G10.getText();
				getValue2.setTxt2G10(txt2G10Val);
				int[] row = {3, 7, 8, 14, 14};
				int[] col = {4, 14, 10, 2, 10};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G10());
				}
			}
		});
		
		txt2G11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getValue2.getTxt2G11();
			}
		});
		
		txt2G12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getValue2.getTxt2G12();
			}
		});
		
		txt2G13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G13Val = txt2G13.getText();
				getValue2.setTxt2G13(txt2G13Val);
				int[] row = {0, 2, 4, 4, 6, 6, 7, 8, 8, 10};
				int[] col = {14, 0, 7, 8, 6, 10, 2, 6, 11, 8};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G13());
				}
			}
		});
		
		txt2G14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G14Val = txt2G14.getText();
				getValue2.setTxt2G14(txt2G14Val);
				int[] row = {0, 1, 4, 6, 8, 12, 14};
				int[] col = {9, 2, 12, 8, 8, 4, 4};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G14());
				}
			}
		});
		
		txt2G15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G15Val = txt2G15.getText();
				getValue2.setTxt2G15(txt2G15Val);
				int[] row = {1, 4, 5, 8, 10, 12, 12, 13};
				int[] col = {12, 10, 0, 3, 4, 3, 10, 14};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G15());
				}
			}
		});
		
		txt2G16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G16Val = txt2G16.getText();
				getValue2.setTxt2G16(txt2G16Val);
				int[] row = {2, 9, 10, 14};
				int[] col = {14, 12, 9, 9};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G16());
				}
			}
		});
		
		txt2G17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getValue2.getTxt2G17();
			}
		});
		
		txt2G18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G18Val = txt2G18.getText();
				getValue2.setTxt2G18(txt2G18Val);
				int[] row = {0, 0, 7, 8};
				int[] col = {0, 5, 0, 4};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G18());
				}
			}
		});
		
		txt2G19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G19Val = txt2G19.getText();
				getValue2.setTxt2G19(txt2G19Val);
				int[] row = {6, 12};
				int[] col = {3, 13};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G19());
				}
			}
		});
		
		txt2G20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G20Val = txt2G20.getText();
				getValue2.setTxt2G20(txt2G20Val);
				int[] row = {0, 0, 2, 2, 3, 4, 6, 8, 8, 9, 10, 10, 10, 12, 12, 12, 14};
				int[] col = {2, 4, 5, 10, 12, 3, 13, 0, 9, 6, 2, 7, 12, 1, 5, 8, 3};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G20());
				}
			}
		});
		
		txt2G21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G21Val = txt2G21.getText();
				getValue2.setTxt2G21(txt2G21Val);
				int[] row = {14, 14};
				int[] col = {5, 12};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G21());
				}
			}
		});
		
		txt2G22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G22Val = txt2G22.getText();
				getValue2.setTxt2G22(txt2G22Val);
				int[] row = {6, 10, 12, 12, 13, 14};
				int[] col = {11, 0, 0, 9, 12, 11};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G22());
				}
			}
		});
		
		txt2G23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G23Val = txt2G23.getText();
				getValue2.setTxt2G23(txt2G23Val);
				int[] row = {9, 11, 12};
				int[] col = {0, 2, 2};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G23());
				}
			}
		});
		
		txt2G24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G24Val = txt2G24.getText();
				getValue2.setTxt2G24(txt2G24Val);
				int[] row = {11, 12};
				int[] col = {10, 7};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G24());
				}
			}
		});
		
		txt2G25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G25Val = txt2G25.getText();
				getValue2.setTxt2G25(txt2G25Val);
				int[] row = {0, 1, 2, 3, 4, 6, 7, 10, 11, 13};
				int[] col = {6, 4, 4, 10, 4, 12, 10, 1, 12, 2};
				for (int i = 0; i < row.length; i++){
				  labelsG2[row[i]][col[i]].setText(getValue2.getTxt2G25());
				}
			}
		});
		
		txt2G26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2G26Val = txt2G26.getText();
				getValue2.setTxt2G26(txt2G26Val);
				labelsG2[10][6].setText(getValue2.getTxt2G26());
			}
		});
		
		btn2GCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] row2 = {0, 0, 2, 2, 4, 10, 14};
				int[] col2 = {12, 13, 11, 12, 5, 11, 8};
				int[] row3 = {0, 4, 4, 4, 4, 5, 9, 9, 12, 13, 14, 14};
				int[] col3 = {3, 0, 2, 11, 14, 6, 2, 4, 11, 10, 0, 14};
				int[] row4 = {2, 2, 3, 3, 6, 7, 8, 10, 10, 11, 11};
				int[] col4 = {6, 9, 0, 6, 14, 12, 2, 3, 13, 8, 14};
				int[] row5 = {2, 3, 3, 4, 5, 5, 6, 8, 8, 14};
				int[] col5 = {3, 8, 14, 1, 10, 12, 5, 1, 5, 7};
				int[] row7 = {2, 7, 9};
				int[] col7 = {2, 4, 14};
				int[] row8 = {0, 1, 2, 2, 3, 5, 6, 9, 10, 11, 11, 12, 13, 14};
				int[] col8 = {11, 0, 1, 13, 2, 14, 9, 8, 10, 0, 4, 12, 8, 1};
				int[] row9 = {0, 0, 1, 1, 1, 2, 4, 4, 5, 5, 6, 10, 11, 12, 13, 13, 14};
				int[] col9 = {1, 7, 6, 10, 14, 7, 6, 13, 2, 8, 4, 14, 6, 14, 0, 4, 13};
				int[] row10 = {3, 7, 8, 14, 14};
				int[] col10 = {4, 14, 10, 2, 10};
				int[] row13 = {0, 2, 4, 4, 6, 6, 7, 8, 8, 10};
				int[] col13 = {14, 0, 7, 8, 6, 10, 2, 6, 11, 8};
				int[] row14 = {0, 1, 4, 6, 8, 12, 14};
				int[] col14 = {9, 2, 12, 8, 8, 4, 4};
				int[] row15 = {1, 4, 5, 8, 10, 12, 12, 13};
				int[] col15 = {12, 10, 0, 3, 4, 3, 10, 14};
				int[] row16 = {2, 9, 10, 14};
				int[] col16 = {14, 12, 9, 9};
				int[] row18 = {0, 0, 7, 8};
				int[] col18 = {0, 5, 0, 4};
				int[] row19 = {6, 12};
				int[] col19 = {3, 13};
				int[] row20 = {0, 0, 2, 2, 3, 4, 6, 8, 8, 9, 10, 10, 10, 12, 12, 12, 14};
				int[] col20 = {2, 4, 5, 10, 12, 3, 13, 0, 9, 6, 2, 7, 12, 1, 5, 8, 3};
				int[] row21 = {14, 14};
				int[] col21 = {5, 12};
				int[] row22 = {6, 10, 12, 12, 13, 14};
				int[] col22 = {11, 0, 0, 9, 12, 11};
				int[] row23 = {9, 11, 12};
				int[] col23 = {0, 2, 2};
				int[] row24 = {11, 12};
				int[] col24 = {10, 7};
				int[] row25 = {0, 1, 2, 3, 4, 6, 7, 10, 11, 13};
				int[] col25 = {6, 4, 4, 10, 4, 12, 10, 1, 12, 2};
				
				String currValue2 = getValue2.getTxt2G2();
				String currValue3 = getValue2.getTxt2G3();
				String currValue4 = getValue2.getTxt2G4();
				String currValue5 = getValue2.getTxt2G5();
				String currValue6 = getValue2.getTxt2G6();
				String currValue7 = getValue2.getTxt2G7();
				String currValue8 = getValue2.getTxt2G8();
				String currValue9 = getValue2.getTxt2G9();
				String currValue10 = getValue2.getTxt2G10();
				String currValue13 = getValue2.getTxt2G13();
				String currValue14 = getValue2.getTxt2G14();
				String currValue15 = getValue2.getTxt2G15();
				String currValue16 = getValue2.getTxt2G16();
				String currValue18 = getValue2.getTxt2G18();
				String currValue19 = getValue2.getTxt2G19();
				String currValue20 = getValue2.getTxt2G20();
				String currValue21 = getValue2.getTxt2G21();
				String currValue22 = getValue2.getTxt2G22();
				String currValue23 = getValue2.getTxt2G23();
				String currValue24 = getValue2.getTxt2G24();
				String currValue25 = getValue2.getTxt2G25();
				String currValue26 = getValue2.getTxt2G26();
				
				if (currValue2 != null){
					if (currValue2.equalsIgnoreCase("N")){
						for (int i = 0; i < row2.length; i++){
							labelsG2[row2[i]][col2[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row2.length; i++){
							labelsG2[row2[i]][col2[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue3 != null){
					if (currValue3.equalsIgnoreCase("R")){
						for (int i = 0; i < row3.length; i++){
							labelsG2[row3[i]][col3[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row3.length; i++){
							labelsG2[row3[i]][col3[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if(currValue4 != null){
					if (currValue4.equalsIgnoreCase("T")){
						for (int i = 0; i < row4.length; i++){
							labelsG2[row4[i]][col4[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row4.length; i++){
							labelsG2[row4[i]][col4[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue5 != null){
					if (currValue5.equalsIgnoreCase("U")){
						for (int i = 0; i < row5.length; i++){
							labelsG2[row5[i]][col5[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row5.length; i++){
							labelsG2[row5[i]][col5[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue6 != null){
					if (currValue6.equalsIgnoreCase("J")){
						labelsG2[0][10].setBorder(BorderFactory.createLineBorder(Color.green));
					}else{
						labelsG2[0][10].setBorder(BorderFactory.createLineBorder(Color.red));
					}
				}
				
				if (currValue7 != null){
					if (currValue7.equalsIgnoreCase("M")){
						for (int i = 0; i < row7.length; i++){
							labelsG2[row7[i]][col7[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row7.length; i++){
							labelsG2[row7[i]][col7[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				

				if (currValue8 != null){
					if (currValue8.equalsIgnoreCase("I")){
						for (int i = 0; i < row8.length; i++){
							labelsG2[row8[i]][col8[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row8.length; i++){
							labelsG2[row8[i]][col8[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue9 != null){
					if (currValue9.equalsIgnoreCase("E")){
						for (int i = 0; i < row9.length; i++){
							labelsG2[row9[i]][col9[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row9.length; i++){
							labelsG2[row9[i]][col9[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue10 != null){
					if (currValue10.equalsIgnoreCase("Y")){
						for (int i = 0; i < row10.length; i++){
							labelsG2[row10[i]][col10[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row10.length; i++){
							labelsG2[row10[i]][col10[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue13 != null){
					if (currValue13.equalsIgnoreCase("S")){
						for (int i = 0; i < row13.length; i++){
							labelsG2[row13[i]][col13[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row13.length; i++){
							labelsG2[row13[i]][col13[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue14 != null){
					if (currValue14.equalsIgnoreCase("D")){
						for (int i = 0; i < row14.length; i++){
							labelsG2[row14[i]][col14[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row14.length; i++){
							labelsG2[row14[i]][col14[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue15 != null){
					if (currValue15.equalsIgnoreCase("O")){
						for (int i = 0; i < row15.length; i++){
							labelsG2[row15[i]][col15[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row15.length; i++){
							labelsG2[row15[i]][col15[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue16 != null){
					if (currValue16.equalsIgnoreCase("C")){
						for (int i = 0; i < row16.length; i++){
							labelsG2[row16[i]][col16[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row16.length; i++){
							labelsG2[row16[i]][col16[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue18 != null){
					if (currValue18.equalsIgnoreCase("B")){
						for (int i = 0; i < row18.length; i++){
							labelsG2[row18[i]][col18[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row18.length; i++){
							labelsG2[row18[i]][col18[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue19 != null){
					if (currValue19.equalsIgnoreCase("Z")){
						for (int i = 0; i < row19.length; i++){
							labelsG2[row19[i]][col19[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row19.length; i++){
							labelsG2[row19[i]][col19[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				

				if (currValue20 != null){
					if (currValue20.equalsIgnoreCase("A")){
						for (int i = 0; i < row20.length; i++){
							labelsG2[row20[i]][col20[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row20.length; i++){
							labelsG2[row20[i]][col20[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue21 != null){
					if (currValue21.equalsIgnoreCase("H")){
						for (int i = 0; i < row21.length; i++){
							labelsG2[row21[i]][col21[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row21.length; i++){
							labelsG2[row21[i]][col21[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue22 != null){
					if (currValue22.equalsIgnoreCase("P")){
						for (int i = 0; i < row22.length; i++){
							labelsG2[row22[i]][col22[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row22.length; i++){
							labelsG2[row22[i]][col22[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue23 != null){
					if (currValue23.equalsIgnoreCase("G")){
						for (int i = 0; i < row23.length; i++){
							labelsG2[row23[i]][col23[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row23.length; i++){
							labelsG2[row23[i]][col23[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue24 != null){
					if (currValue24.equalsIgnoreCase("V")){
						for (int i = 0; i < row24.length; i++){
							labelsG2[row24[i]][col24[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row24.length; i++){
							labelsG2[row24[i]][col24[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue25 != null){
					if (currValue25.equalsIgnoreCase("L")){
						for (int i = 0; i < row25.length; i++){
							labelsG2[row25[i]][col25[i]].setBorder(BorderFactory.createLineBorder(Color.green));
						}
					}else{
						for (int i = 0; i < row25.length; i++){
							labelsG2[row25[i]][col25[i]].setBorder(BorderFactory.createLineBorder(Color.red));
						}
					}
				}
				
				if (currValue26 != null){
					if (currValue26.equalsIgnoreCase("F")){
						labelsG2[10][6].setBorder(BorderFactory.createLineBorder(Color.green));
					}else{
						labelsG2[10][6].setBorder(BorderFactory.createLineBorder(Color.red));
					}
				}
			}
		});
		
		btn2GHint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] allValues = {"K", "N", "R", "T", "U", "J", "M", "I", "E", "Y", "X", "W", "S", "D", "O", "C", "B", "Q", "Z", "A", "H", "P", "G", "V", "L", "F"};
				Random getRandomHint = new Random();
				int hintIndex = getRandomHint.nextInt(26);
				int hintValue = hintIndex + 1;
				String currentHint = allValues[hintIndex];
				JOptionPane.showInputDialog("The letter for #" + hintValue + " is " + currentHint);
			}
		});
		
		btn2GFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] currValue = {getValue2.getTxt2G2(), getValue2.getTxt2G3(), getValue2.getTxt2G4(), getValue2.getTxt2G5() , getValue2.getTxt2G6(), getValue2.getTxt2G7(), getValue2.getTxt2G8(),  getValue2.getTxt2G9(), getValue2.getTxt2G10(), getValue2.getTxt2G13(), getValue2.getTxt2G14(), getValue2.getTxt2G15(), getValue2.getTxt2G16(), getValue2.getTxt2G18(), getValue2.getTxt2G19(), getValue2.getTxt2G20(), getValue2.getTxt2G21(), getValue2.getTxt2G22(), getValue2.getTxt2G23(), getValue2.getTxt2G24(), getValue2.getTxt2G25(), getValue2.getTxt2G26()};
				String[] allValues = {"N", "R", "T", "U", "J", "M", "I", "E", "Y", "S", "D", "O", "C", "B", "Z", "A", "H", "P", "G", "V", "L", "F"};
				if (currValue[0].equalsIgnoreCase(allValues[0]) && currValue[1].equalsIgnoreCase(allValues[1]) && currValue[2].equalsIgnoreCase(allValues[2]) && currValue[3].equalsIgnoreCase(allValues[3]) && currValue[4].equalsIgnoreCase(allValues[4]) && currValue[5].equalsIgnoreCase(allValues[5]) && currValue[6].equalsIgnoreCase(allValues[6]) && currValue[7].equalsIgnoreCase(allValues[7]) && currValue[8].equalsIgnoreCase(allValues[8]) && currValue[9].equalsIgnoreCase(allValues[9]) && currValue[10].equalsIgnoreCase(allValues[10]) && currValue[11].equalsIgnoreCase(allValues[11]) && currValue[12].equalsIgnoreCase(allValues[12]) && currValue[13].equalsIgnoreCase(allValues[13]) && currValue[14].equalsIgnoreCase(allValues[14]) && currValue[15].equalsIgnoreCase(allValues[15]) && currValue[16].equalsIgnoreCase(allValues[16]) && currValue[17].equalsIgnoreCase(allValues[17]) && currValue[18].equalsIgnoreCase(allValues[18]) && currValue[19].equalsIgnoreCase(allValues[19]) && currValue[20].equalsIgnoreCase(allValues[20]) && currValue[21].equalsIgnoreCase(allValues[21])){
					double timeElapsed = watch.elapsedTime();
					ttaskvar.cancel();
					StoreScore saveScore = new StoreScore();
					saveScore.setScore(timeElapsed);
					JOptionPane.showMessageDialog(null, "Finished in " + timeElapsed);
					String userName;
					userName = JOptionPane.showInputDialog("Enter Name:");
					saveScore.setName(userName);
				}else{
					JOptionPane.showMessageDialog(null, "Game not finished");
				}
			}
		});
		/**
		 * End of Grid Two Action Listeners.
		 */
		
		/**
		 * High Scores Action Listeners.
		 */
		
		/**
		 * End of High Score Action Listeners
		 */
	}
}