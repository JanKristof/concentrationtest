package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public frame1() {
		setTitle("Konzentrationstest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_0 = new JLabel("6   +");
		label_0.setBounds(10, 28, 46, 14);
		contentPane.add(label_0);
		
		JLabel label_1 = new JLabel("6   +");
		label_1.setBounds(45, 28, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("6   +");
		label_2.setBounds(81, 28, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("6   +");
		label_3.setBounds(120, 28, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("6   +");
		label_4.setBounds(163, 28, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("6   +");
		label_5.setBounds(10, 75, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("6   +");
		label_6.setBounds(45, 75, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("6   +");
		label_7.setBounds(81, 75, 46, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("6   +");
		label_8.setBounds(120, 75, 46, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("6   +");
		label_9.setBounds(163, 75, 46, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("6   +");
		label_10.setBounds(10, 129, 46, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("6   +");
		label_11.setBounds(45, 129, 46, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("6   +");
		label_12.setBounds(81, 129, 46, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("6   +");
		label_13.setBounds(120, 129, 46, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("6   +");
		label_14.setBounds(163, 129, 46, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("6   +");
		label_15.setBounds(10, 183, 46, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("6   +");
		label_16.setBounds(45, 183, 46, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("6   +");
		label_17.setBounds(81, 183, 46, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("6   +");
		label_18.setBounds(120, 183, 46, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("6   +");
		label_19.setBounds(163, 183, 46, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("6   +");
		label_20.setBounds(10, 238, 46, 14);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("6   +");
		label_21.setBounds(45, 238, 46, 14);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("6   +");
		label_22.setBounds(81, 238, 46, 14);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("6   +");
		label_23.setBounds(120, 238, 46, 14);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("6   +");
		label_24.setBounds(163, 238, 46, 14);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("6   +");
		label_25.setBounds(10, 293, 46, 14);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("6   +");
		label_26.setBounds(45, 293, 46, 14);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("6   +");
		label_27.setBounds(81, 293, 46, 14);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("6   +");
		label_28.setBounds(120, 293, 46, 14);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("6   +");
		label_29.setBounds(163, 293, 46, 14);
		contentPane.add(label_29);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(280, 28, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(280, 75, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(280, 129, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(280, 183, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(280, 235, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(280, 293, 86, 20);
		contentPane.add(textField_6);
		
		JButton btnWeiter = new JButton("weiter");
		btnWeiter.setBounds(277, 329, 89, 23);
		contentPane.add(btnWeiter);
		
		JLabel Zeit = new JLabel("Noch: xx Sekunden");
		Zeit.setFont(new Font("Tahoma", Font.BOLD, 18));
		Zeit.setBounds(10, 324, 201, 26);
		contentPane.add(Zeit);
		
		JLabel label_30 = new JLabel("6   +");
		label_30.setBounds(202, 28, 46, 14);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("6   +");
		label_31.setBounds(202, 75, 46, 14);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel("6   +");
		label_32.setBounds(202, 129, 46, 14);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel("6   +");
		label_33.setBounds(202, 183, 46, 14);
		contentPane.add(label_33);
		
		JLabel label_34 = new JLabel("6   +");
		label_34.setBounds(202, 238, 46, 14);
		contentPane.add(label_34);
		
		JLabel label_35 = new JLabel("6   +");
		label_35.setBounds(202, 293, 46, 14);
		contentPane.add(label_35);
		
		JLabel label_36 = new JLabel("6   =");
		label_36.setBounds(241, 28, 46, 14);
		contentPane.add(label_36);
		
		JLabel label_37 = new JLabel("6   =");
		label_37.setBounds(241, 75, 46, 14);
		contentPane.add(label_37);
		
		JLabel label_38 = new JLabel("6   =");
		label_38.setBounds(241, 129, 46, 14);
		contentPane.add(label_38);
		
		JLabel label_39 = new JLabel("6   =");
		label_39.setBounds(241, 183, 46, 14);
		contentPane.add(label_39);
		
		JLabel label_40 = new JLabel("6   =");
		label_40.setBounds(241, 238, 46, 14);
		contentPane.add(label_40);
		
		JLabel label_41 = new JLabel("6   =");
		label_41.setBounds(241, 293, 46, 14);
		contentPane.add(label_41);
		
	}
}
