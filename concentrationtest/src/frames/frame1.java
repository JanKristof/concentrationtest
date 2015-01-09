package frames;

import java.awt.Color;
import java.awt.EventQueue;

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
	private JTextField ergebnis1;
	private JTextField ergebnis2;
	private JTextField ergebnis3;
	private JTextField ergebnis4;
	private JTextField ergebnis5;
	private JTextField ergebnis6;
	private JTextField ergebnis7;

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
		
		JLabel label_0 = new JLabel(numbers.check(0,0) +"    +");
		label_0.setBounds(10, 11, 46, 14);
		contentPane.add(label_0);
		
		JLabel label_1 = new JLabel(numbers.check(0,1) +"    +");
		label_1.setBounds(45, 11, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel(numbers.check(0,2) +"    +");
		label_2.setBounds(81, 11, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel(numbers.check(0,3) +"    +");
		label_3.setBounds(120, 11, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel(numbers.check(0,4) +"    +");
		label_4.setBounds(163, 11, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel(numbers.check(1,0) +"    +");
		label_5.setBounds(10, 41, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel(numbers.check(1,1) +"    +");
		label_6.setBounds(45, 41, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel(numbers.check(1,2) +"    +");
		label_7.setBounds(81, 41, 46, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel(numbers.check(1,3) +"    +");
		label_8.setBounds(120, 41, 46, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel(numbers.check(1,4) +"    +");
		label_9.setBounds(163, 41, 46, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel(numbers.check(2,0) +"    +");
		label_10.setBounds(10, 72, 46, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel(numbers.check(2,1) +"    +");
		label_11.setBounds(45, 72, 46, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel(numbers.check(2,2) +"    +");
		label_12.setBounds(81, 72, 46, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel(numbers.check(2,3) +"    +");
		label_13.setBounds(120, 72, 46, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel(numbers.check(2,4) +"    +");
		label_14.setBounds(163, 72, 46, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel(numbers.check(3,0) +"    +");
		label_15.setBounds(10, 103, 46, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel(numbers.check(3,1) +"    +");
		label_16.setBounds(45, 103, 46, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel(numbers.check(3,2) +"    +");
		label_17.setBounds(81, 103, 46, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel(numbers.check(3,3) +"    +");
		label_18.setBounds(120, 103, 46, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel(numbers.check(3,4) +"    +");
		label_19.setBounds(163, 103, 46, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel(numbers.check(4,0) +"    +");
		label_20.setBounds(10, 137, 46, 14);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel(numbers.check(4,1) +"    +");
		label_21.setBounds(45, 137, 46, 14);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel(numbers.check(4,2) +"    +");
		label_22.setBounds(81, 137, 46, 14);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel(numbers.check(4,3) +"    +");
		label_23.setBounds(120, 137, 46, 14);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel(numbers.check(4,4) +"    +");
		label_24.setBounds(163, 137, 46, 14);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel(numbers.check(5,0) +"    +");
		label_25.setBounds(10, 168, 46, 14);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel(numbers.check(5,1) +"    +");
		label_26.setBounds(45, 168, 46, 14);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel(numbers.check(5,2) +"    +");
		label_27.setBounds(81, 168, 46, 14);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel(numbers.check(5,3) +"    +");
		label_28.setBounds(120, 168, 46, 14);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel(numbers.check(5,4) +"    +");
		label_29.setBounds(163, 168, 46, 14);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel(numbers.check(0,5) +"    =");
		label_30.setBounds(205, 11, 46, 14);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel(numbers.check(1,5) +"    =");
		label_31.setBounds(205, 41, 46, 14);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel(numbers.check(2,5) +"    =");
		label_32.setBounds(205, 72, 46, 14);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel(numbers.check(3,5) +"    =");
		label_33.setBounds(205, 103, 46, 14);
		contentPane.add(label_33);
		
		JLabel label_34 = new JLabel(numbers.check(4,5) +"    =");
		label_34.setBounds(205, 137, 46, 14);
		contentPane.add(label_34);
		
		JLabel label_35 = new JLabel(numbers.check(5,5) +"    =");
		label_35.setBounds(205, 168, 46, 14);
		contentPane.add(label_35);
		
		JLabel label_36 = new JLabel(numbers.check(6,0) +"    +");
		label_36.setBounds(10, 199, 46, 14);
		contentPane.add(label_36);
		
		JLabel label_37 = new JLabel(numbers.check(6,1) +"    +");
		label_37.setBounds(45, 199, 46, 14);
		contentPane.add(label_37);
		
		JLabel label_38 = new JLabel(numbers.check(6,2) +"    +");
		label_38.setBounds(81, 199, 46, 14);
		contentPane.add(label_38);
		
		JLabel label_39 = new JLabel(numbers.check(6,3) +"    +");
		label_39.setBounds(120, 199, 46, 14);
		contentPane.add(label_39);
		
		JLabel label_40 = new JLabel(numbers.check(6,4) +"    +");
		label_40.setBounds(163, 199, 46, 14);
		contentPane.add(label_40);
		
		JLabel label_41 = new JLabel(numbers.check(6,5) +"    =");
		label_41.setBounds(205, 199, 46, 14);
		contentPane.add(label_41);
		
		ergebnis1 = new JTextField();
		ergebnis1.setColumns(10);
		ergebnis1.setBounds(244, 11, 86, 20);
		contentPane.add(ergebnis1);
		
		ergebnis2 = new JTextField();
		ergebnis2.setColumns(10);
		ergebnis2.setBounds(244, 41, 86, 20);
		contentPane.add(ergebnis2);
		
		ergebnis3 = new JTextField();
		ergebnis3.setColumns(10);
		ergebnis3.setBounds(244, 72, 86, 20);
		contentPane.add(ergebnis3);
		
		ergebnis4 = new JTextField();
		ergebnis4.setColumns(10);
		ergebnis4.setBounds(244, 103, 86, 20);
		contentPane.add(ergebnis4);
		
		ergebnis5 = new JTextField();
		ergebnis5.setColumns(10);
		ergebnis5.setBounds(244, 134, 86, 20);
		contentPane.add(ergebnis5);
		
		ergebnis6 = new JTextField();
		ergebnis6.setColumns(10);
		ergebnis6.setBounds(244, 168, 86, 20);
		contentPane.add(ergebnis6);
		
		JButton button_next = new JButton("weiter");
		button_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[] result =new int[7];
				int col;
				int row;
				for (col=0; col<=6; col++){
					for (row=0; row<=5; row++)
						result[col]+=numbers.readarray(col ,row);	
					}
				if (ergebnis1.getText()==String.valueOf(result[0]))
						ergebnis1.setBackground(Color.green);
				else
					ergebnis1.setText("falsch");
				if (ergebnis2.getText()==String.valueOf(result[1]))
						ergebnis2.setBackground(Color.green);
				else
					ergebnis2.setText("falsch");
				if (ergebnis3.getText()==String.valueOf(result[2]))
						ergebnis3.setBackground(Color.green);
				else
					ergebnis3.setText("falsch");
				if (ergebnis4.getText()==String.valueOf(result[3]))
						ergebnis4.setBackground(Color.green);
				else
					ergebnis4.setText("falsch");
				if (ergebnis5.getText()==String.valueOf(result[4]))
						ergebnis5.setBackground(Color.green);
				else
					ergebnis5.setText("falsch");
				if (ergebnis6.getText()==String.valueOf(result[5]))
						ergebnis6.setBackground(Color.green);
				else
					ergebnis6.setText("falsch");
				if (ergebnis7.getText()==String.valueOf(result[6]))
						ergebnis7.setBackground(Color.green);
				else
					ergebnis7.setText("falsch");
			}
		});
		button_next.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_next.setBounds(231, 232, 99, 28);
		contentPane.add(button_next);
		
		JLabel timelabel = new JLabel("Noch: xx Sekunden");
		timelabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		timelabel.setBounds(20, 232, 201, 26);
		contentPane.add(timelabel);
		
		ergebnis7 = new JTextField();
		ergebnis7.setColumns(10);
		ergebnis7.setBounds(244, 199, 86, 20);
		contentPane.add(ergebnis7);
		
	}
}
