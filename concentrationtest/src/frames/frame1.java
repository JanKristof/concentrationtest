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
	private JTextField textField;

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
		setTitle("frame1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_0 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_0.setBounds(10, 11, 46, 14);
		contentPane.add(label_0);
		
		JLabel label_1 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_1.setBounds(45, 11, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_2.setBounds(81, 11, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_3.setBounds(120, 11, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_4.setBounds(163, 11, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_5.setBounds(10, 58, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_6.setBounds(45, 58, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_7.setBounds(81, 58, 46, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_8.setBounds(120, 58, 46, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_9.setBounds(163, 58, 46, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_10.setBounds(10, 112, 46, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_11.setBounds(45, 112, 46, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_12.setBounds(81, 112, 46, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_13.setBounds(120, 112, 46, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_14.setBounds(163, 112, 46, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_15.setBounds(10, 166, 46, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_16.setBounds(45, 166, 46, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_17.setBounds(81, 166, 46, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_18.setBounds(120, 166, 46, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_19.setBounds(163, 166, 46, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_20.setBounds(10, 221, 46, 14);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_21.setBounds(45, 221, 46, 14);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_22.setBounds(81, 221, 46, 14);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_23.setBounds(120, 221, 46, 14);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_24.setBounds(163, 221, 46, 14);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_25.setBounds(10, 276, 46, 14);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_26.setBounds(45, 276, 46, 14);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_27.setBounds(81, 276, 46, 14);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_28.setBounds(120, 276, 46, 14);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel(numbers.getRandom(1,9) +"    =");
		label_29.setBounds(163, 276, 46, 14);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel(numbers.getRandom(1,9) +"    =");
		label_30.setBounds(241, 11, 46, 14);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel(numbers.getRandom(1,9) +"    =");
		label_31.setBounds(241, 58, 46, 14);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel(numbers.getRandom(1,9) +"    =");
		label_32.setBounds(241, 112, 46, 14);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel(numbers.getRandom(1,9) +"    =");
		label_33.setBounds(241, 166, 46, 14);
		contentPane.add(label_33);
		
		JLabel label_34 = new JLabel(numbers.getRandom(1,9) +"    =");
		label_34.setBounds(241, 221, 46, 14);
		contentPane.add(label_34);
		
		JLabel label_35 = new JLabel("6   =");
		label_35.setBounds(241, 276, 46, 14);
		contentPane.add(label_35);
		
		JLabel label_36 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_36.setBounds(10, 318, 46, 14);
		contentPane.add(label_36);
		
		JLabel label_37 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_37.setBounds(45, 318, 46, 14);
		contentPane.add(label_37);
		
		JLabel label_38 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_38.setBounds(81, 318, 46, 14);
		contentPane.add(label_38);
		
		JLabel label_39 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_39.setBounds(120, 318, 46, 14);
		contentPane.add(label_39);
		
		JLabel label_40 = new JLabel(numbers.getRandom(1,9) +"    +");
		label_40.setBounds(163, 318, 46, 14);
		contentPane.add(label_40);
		
		JLabel label_41 = new JLabel("6   =");
		label_41.setBounds(241, 318, 46, 14);
		contentPane.add(label_41);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(280, 11, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(280, 58, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(280, 112, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(280, 166, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(280, 218, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(280, 276, 86, 20);
		contentPane.add(textField_6);
		
		JButton btnWeiter = new JButton("weiter");
		btnWeiter.setBounds(280, 350, 89, 23);
		contentPane.add(btnWeiter);
		
		JLabel Zeit = new JLabel("Noch: xx Sekunden");
		Zeit.setFont(new Font("Tahoma", Font.BOLD, 18));
		Zeit.setBounds(10, 345, 201, 26);
		contentPane.add(Zeit);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(280, 318, 86, 20);
		contentPane.add(textField);
		
	}
}
