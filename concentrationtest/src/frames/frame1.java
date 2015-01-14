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
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class frame1 extends JFrame {

	private JPanel contentPane;
	JTextField[] ergebnisse = new JTextField[7];
	JLabel[][] labels = new JLabel[7][6];
	int time = 20;
	int blogs = 9; //	= (Maximale Anzahl and Rechenblöcken) - 1
	private JTextField textField;

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
		setType(Type.UTILITY);
		setTitle("Konzentrationstest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		for (int i = 0; i <= 6; i++) {

			numbers.clear();
			ergebnisse[i] = new JTextField();
			ergebnisse[i].setColumns(10);
			ergebnisse[i].setBounds(380, 20 + (60 * i), 140, 30);
			ergebnisse[i].setFont(new Font("Tahoma", Font.PLAIN, 20));
			ergebnisse[i].setHorizontalAlignment(SwingConstants.CENTER);
			contentPane.add(ergebnisse[i]);
			for (int j = 0; j < 6; j++) {
				if (j == 5) {
					labels[i][j] = new JLabel(numbers.check(i, j) + "   =");
					labels[i][j].setBounds(20 + (60 * j), 20 + (60 * i), 60, 20);
					labels[i][j].setFont(new Font("Tahoma", Font.PLAIN, 20));
					contentPane.add(labels[i][j]);
				} else {
					labels[i][j] = new JLabel(numbers.check(i, j) + "   +");
					labels[i][j].setBounds(20 + (60 * j), 20 + (60 * i), 60, 20);
					labels[i][j].setFont(new Font("Tahoma", Font.PLAIN, 20));
					contentPane.add(labels[i][j]);
				}
			}
		}

		JButton button_next = new JButton("weiter");
		button_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newblog();
			}
		});
		button_next.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_next.setBounds(362, 423, 172, 47);
		contentPane.add(button_next);

		JLabel timelabel = new JLabel();
		timelabel.setHorizontalAlignment(SwingConstants.CENTER);
		timelabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		timelabel.setBounds(10, 423, 342, 47);
		contentPane.add(timelabel);

		final Timer timer = new Timer();	//der legendäre timer O.O
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				timelabel.setText("noch " + String.valueOf(time) + " Sekunden!");
				if (time == 0) {
					if (blogs==10)
					timer.cancel();
					else
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
		numbers.clear();
		for (int i = 0; i <= 6; i++) {
			
			ergebnisse[i].setText("");
			for (int j = 0; j < 6; j++) {
				if (j == 5) {
					labels[i][j].setText(numbers.check(i, j) + "    =");
				} else {
					labels[i][j].setText(numbers.check(i, j) + "    +");
				}
			}
		}
		time=20;
		blogs--;
	}
}