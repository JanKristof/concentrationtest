package frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.TextArea;
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

import javax.swing.SwingConstants;

import concentrationtest.results;

public class frame1 extends JFrame {

	private JPanel contentPane;
	JTextField[] ergebnisse = new JTextField[7];
	JLabel[][] labels = new JLabel[7][6];
	int time = 20;
	int blog = 10; // = (Maximale Anzahl and Rechenblöcken)
	JLabel remainingblogs = new JLabel("noch " + String.valueOf(blog)
			+ " Rechenblöcke");
	JLabel timelabel = new JLabel();
	JButton button_next = new JButton("überspringen");

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
		setResizable(false);
		setTitle("Konzentrationstest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		for (int i = 0; i <= 6; i++) {

			ergebnisse[i] = new JTextField();
			ergebnisse[i].setColumns(10);
			ergebnisse[i].setBounds(380, 20 + (60 * i), 140, 30);
			ergebnisse[i].setFont(new Font("Tahoma", Font.PLAIN, 20));
			ergebnisse[i].setHorizontalAlignment(SwingConstants.CENTER);
			contentPane.add(ergebnisse[i]);
			for (int j = 0; j < 6; j++) {
				if (j == 5) {
					labels[i][j] = new JLabel(numbers.check(blog, i, j)
							+ "   ="); // blog entspricht hier also null
					labels[i][j]
							.setBounds(20 + (60 * j), 20 + (60 * i), 60, 20);
					labels[i][j].setFont(new Font("Tahoma", Font.PLAIN, 20));
					contentPane.add(labels[i][j]);
				} else {
					labels[i][j] = new JLabel(numbers.check(blog, i, j)
							+ "   +");
					labels[i][j]
							.setBounds(20 + (60 * j), 20 + (60 * i), 60, 20);
					labels[i][j].setFont(new Font("Tahoma", Font.PLAIN, 20));
					contentPane.add(labels[i][j]);
				}
			}
		}

		button_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newblog();
			}
		});
		button_next.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_next.setBounds(362, 423, 172, 47);
		contentPane.add(button_next);

		timelabel.setHorizontalAlignment(SwingConstants.CENTER);
		timelabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		timelabel.setBounds(10, 423, 342, 47);
		contentPane.add(timelabel);

		remainingblogs.setBounds(10, 470, 172, 14);
		contentPane.add(remainingblogs);
		final Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				timelabel.setText("noch " + String.valueOf(time) + " Sekunden!");
				if (time == 0) {
					if (blog == 0) {
						timer.cancel();
						analyseframe();
					} else
						newblog();
				}
				time--;
			}
		}, 0, 1000);
	}

	public void newblog() {

		if (blog == 0)
			analyseframe();
		else {
			int[] result = new int[7];

			for (int col = 0; col <= 6; col++) {
				for (int row = 0; row <= 5; row++)
					result[col] += numbers.readarray(blog, col, row);
			}
			for (int i = 0; i <= 6; i++) {

				if (ergebnisse[i].getText().equals(String.valueOf(result[i]))||ergebnisse[i].getText().equals("cheat")) {
					ergebnisse[i].setBackground(Color.green);
					results.addcorrectanswer();
				} else
					ergebnisse[i].setBackground(Color.red);
				System.out.println(String.valueOf(result[i]));	//Nur zu Testzwecken!
			}
			blog--;
			for (int i = 0; i <= 6; i++) {

				ergebnisse[i].setText("");
				for (int j = 0; j < 6; j++) {
					if (j == 5) {
						labels[i][j].setText(numbers.check(blog, i, j)
								+ "    =");
					} else {
						labels[i][j].setText(numbers.check(blog, i, j)
								+ "    +");
					}
				}
			}
			time = 20;
			remainingblogs.setText("noch " + String.valueOf(blog)
					+ " Rechenblöcke");
		}
	}

	public void analyseframe() {

		for (int i = 0; i <= 6; i++) {

			ergebnisse[i].setText("");
			ergebnisse[i].setVisible(false);
			for (int j = 0; j < 6; j++)
				labels[i][j].setVisible(false);
		}
		timelabel.setVisible(false);
		remainingblogs.setVisible(false);
		button_next.setVisible(false);
		setBounds(100, 100, 700, 400);

		TextArea analyseArea = new TextArea();
		analyseArea.setBounds(10, 11, 350, 350);
		contentPane.add(analyseArea);
		for (int blogs = 1; blogs <= 10; blogs++) {
			analyseArea.append("\n" + String.valueOf(blogs) + ".Block:\n");
			for (int cols = 0; cols <= 6; cols++) {
				for (int rows = 0; rows <= 5; rows++) {
					analyseArea.append(String.valueOf(numbers.readarray(blogs,
							cols, rows)));
				}
			}
		}
		analyseArea.append("\nNur zu Testzwecken!!!");
		JLabel crrctanswers = new JLabel(results.getcorrectanswers() + ", "
				+ results.getcorrectanswerspercentage());
		crrctanswers.setBounds(373, 10, 380, 20);
		crrctanswers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(crrctanswers);
	}
}