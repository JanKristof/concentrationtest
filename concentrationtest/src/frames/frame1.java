package frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame1 extends JFrame {

	private JPanel contentPane;
	JTextField[] ergebnisse = new JTextField[7];
	JLabel[] labels = new JLabel[42];
	int time = 20;

	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 frame = new frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frame1() {
		setTitle("frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		for (int i = 0; i <= 6; i++) {

			numbers.clear();
			ergebnisse[i] = new JTextField();
			ergebnisse[i].setColumns(10);
			ergebnisse[i].setBounds(240, 10 + (32 * i), 86, 20);
			contentPane.add(ergebnisse[i]);
			for (int j = 0; j < 6; j++) {
				if (j == 5) {
					labels[i] = new JLabel(numbers.check(i, j) + "    =");
					labels[i].setBounds(15 + (35 * j), 11 + (32 * i), 46, 14);
					contentPane.add(labels[i]);
				} else {
					labels[i] = new JLabel(numbers.check(i, j) + "    +");
					labels[i].setBounds(15 + (35 * j), 11 + (32 * i), 46, 14);
					contentPane.add(labels[i]);
				}
			}
		}

		JButton button_next = new JButton("weiter");
		button_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newblog();
			}
		});
		button_next.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_next.setBounds(231, 232, 99, 28);
		contentPane.add(button_next);

		JLabel timelabel = new JLabel(); // kp man
		timelabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		timelabel.setBounds(12, 232, 201, 26);
		contentPane.add(timelabel);

		final Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				timelabel.setText("noch " + String.valueOf(time) + " Sekunden!");
				if (time == 0) {
					timer.cancel();
					newblog();
				}
				time--;
			}
		}, 0, 1000);
	}

	public void newblog() {
		
		int[] result = new int[7];
		int col;
		int row;
		for (col = 0; col <= 6; col++) {
			for (row = 0; row <= 5; row++)
				result[col] += numbers.readarray(col, row);
		}
		for (int i = 0; i <= 6; i++) {

			if (ergebnisse[i].getText().equals(
					String.valueOf(result[i])))
				ergebnisse[i].setBackground(Color.green);
			else
				ergebnisse[i].setBackground(Color.red);
		}
		try { 										//
            Thread.sleep(1000); 					// Verbesserungsbedarf!
        } catch (InterruptedException e) { 			// Hier soll eine Sekunde gewartet werden,
            e.printStackTrace(); 					// damit man (für eine Sekunde farbig markiert,) sieht was falsch/richtig war!
        }  											// Anstelle davon hält aber alles (auch das davor) an und wartet.
		numbers.clear();
		for (int i = 0; i <= 6; i++) {
			
			ergebnisse[i].setText("");
			ergebnisse[i].setBackground(Color.white);
			for (int j = 0; j < 6; j++) {
				if (j == 5) {
					labels[i].setText(numbers.check(i, j) + "    =");
				} else {
					labels[i].setText(numbers.check(i, j) + "    +"); //Warum aktualisiert sich nur die letzte Reihe?
				}
			}
		}

	}
}