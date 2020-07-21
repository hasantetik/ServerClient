


import java.awt.EventQueue;


import java.net.Socket;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;



public class frm1  extends JFrame  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Socket s;
	private JPanel contentPane;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	
	
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm1 frame = new frm1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	
	public frm1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Verileri G\u00F6nder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display();
				update();
				dosyayaYaz();
			    			
				
			}
		});
		btnNewButton.setBounds(281, 165, 143, 59);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(174, 49, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 80, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(174, 111, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 142, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(174, 173, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(174, 204, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel = new JLabel(" Test Say\u0131s\u0131 :");
		lblNewLabel.setBounds(87, 52, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vaka Say\u0131s\u0131 :");
		lblNewLabel_1.setBounds(87, 80, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Vefat Say\u0131s\u0131 :");
		lblNewLabel_2.setBounds(87, 114, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Yo\u011Fun Bak\u0131m Hasta Say\u0131s\u0131 :");
		lblNewLabel_3.setBounds(10, 142, 164, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ent\u00FCbe Hasta Say\u0131s\u0131 :");
		lblNewLabel_4.setBounds(46, 176, 118, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u0130yile\u015Fen Hasta Say\u0131s\u0131 :");
		lblNewLabel_5.setBounds(34, 204, 143, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(338, 49, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(338, 80, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("G\u00FCn :");
		lblNewLabel_6.setBounds(292, 52, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ay :");
		lblNewLabel_7.setBounds(297, 83, 31, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Server");
		lblNewLabel_8.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_8.setBackground(new Color(255, 0, 0));
		lblNewLabel_8.setBounds(10, 11, 86, 30);
		contentPane.add(lblNewLabel_8);
	}
	
public int getTest() {
		
	return Integer.parseInt(textField.getText());
	}
public int getVaka() {
		
	return Integer.parseInt(textField_1.getText());
	}
public int getVefat() {
	
	return Integer.parseInt(textField_2.getText());
}
public int getYogunBakým() {
	
	return Integer.parseInt(textField_3.getText());
}
public int getEntube() {
	
	return Integer.parseInt(textField_4.getText());
}
public int getÝyilesenHasta() {
	
	return Integer.parseInt(textField_5.getText());
}
public int getGun() {
	
	return Integer.parseInt(textField_6.getText());
}
public String getAy() {
	
	return textField_7.getText();
}
public void setTest(int test) {
	textField.setText(test+"");
	
}
public void setVaka(int vaka) {
	textField_1.setText(vaka+"");
	
}
public void setVefat(int vefat) {
	textField_2.setText(vefat+"");
	
}
public void setYogunBakim(int yogunBakim) {
	textField_3.setText(yogunBakim+"");
	
}
public void setEntube(int entube) {
	textField_4.setText(entube+"");
	
}
public void setÝyilesen(int iyilesen) {
	textField_5.setText(iyilesen+"");
	
}
public void setGun(int gun) {
	textField_6.setText(gun+"");
	
}
public void setAy(int ay) {
	textField_7.setText(ay+"");
	
}
public void Display() {
	
	ObservableServerSocket sc1= new ObservableServerSocket(s);
 	sc1.sendToAllClient(textField.getText());
	sc1.sendToAllClient(textField_1.getText());
	sc1.sendToAllClient(textField_2.getText());
	sc1.sendToAllClient(textField_5.getText());
	sc1.sendToAllClient(textField_6.getText());
	sc1.sendToAllClient(textField_7.getText());
	
	
}

public void dosyayaYaz() {
	
	File file = new File("data.txt");
	
	 FileWriter fileWriter = null;
     try {
         fileWriter = new FileWriter(file, true);
     } catch (IOException ex) {
         
     }
     BufferedWriter bWriter = new BufferedWriter(fileWriter);
     try {
         bWriter.write(" Test Sayýsý  : "+getTest()+" Vaka sayýsý  :"+getVaka()+"   Vefat Sayýsý : "+getVefat()+" Yoðun Bakým sayýsý :"+getYogunBakým()+"   Entübe sayýsý :"+getEntube()+" Ýyileþen Hasta sayýsý :"+getÝyilesenHasta()+"  Gün  :"+getGun()+"  Ay : "+getAy());
     } catch (IOException ex) {
         
     }
             try {
         bWriter.newLine();
     } catch (IOException ex) {
         
     }
     try {
         bWriter.close();
     } catch (IOException ex) {
         
     }
	
	
	
	
	
}



int toptest=0;
int topVaka=0;
int topVefat=0;
int topYogunBakim=0;
int topEntube=0;
int topiyilesen=0;


public void update() {
	ObservableServerSocket sc1= new ObservableServerSocket(s);
	 toptest+=getTest();
	 topVaka+=getVaka();
	 topVefat+=getVefat();
	 topYogunBakim+=getYogunBakým();
	 topEntube+=getEntube();
	 topiyilesen+=getÝyilesenHasta();
	 
	 sc1.sendToAllClient(toptest+"");
	 sc1.sendToAllClient(topVaka+"");
	 sc1.sendToAllClient(topVefat+"");
	 sc1.sendToAllClient(topYogunBakim+"");
	 sc1.sendToAllClient(topEntube+"");
	 sc1.sendToAllClient(topiyilesen+"");
	
	
}


}

