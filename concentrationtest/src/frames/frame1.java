package frames;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame1 extends JFrame {

	private JPanel contentPane;

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

		JTextField[] ergebnisse = new JTextField[7];
		JLabel[] labels = new JLabel[42];
		for (int i = 0; i <= 6; i++) {

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
						ergebnisse[i].setText("falsch");
				}
			}
		});
		button_next.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_next.setBounds(231, 232, 99, 28);
		contentPane.add(button_next);

		JLabel timelabel = new JLabel("Noch: xx Sekunden");
		timelabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		timelabel.setBounds(20, 232, 201, 26);
		contentPane.add(timelabel);

		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		int counterValue = 42;
		Timer timer;
		// JLabel label;

		// Timer erzeugen, jede 1000 Millisekunden (= 1 Sekunde)
		// Methode actionPerformed aufrufen.
		timer = new Timer(1000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JLabel label;
				// 1 Sekunde abziehen
				counterValue--;

				// Zahl in Label darstellen
				timelabel.setText(String.valueOf(counterValue));

				// Falls Zähler = 0, Countdown abgelaufen!
				if (counterValue == 0) {
					System.out.println("Counterdown ausgelaufen!");
					// Timer stoppen
					timer.stop();
				}
			}
		});
		timer.start();
	}
}