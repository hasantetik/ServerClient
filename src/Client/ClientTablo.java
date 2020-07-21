package Client;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JTextField;
import java.awt.Font;

public class ClientTablo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static ClientTablo singleton;
	private static Object k=new Object();
	


	
	static Socket socket;
	static DataInputStream din;
	static DataOutputStream dout;
	private JLabel lblNewLabel;
	private static JTextField textField;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	private static JTextField textField_12;
	private static JTextField textField_13;
	
	public static ClientTablo instance() {
		if(singleton==null) {
			synchronized (k) {
				if(singleton==null) {
					singleton=new ClientTablo();
				}
				
			}
			
		}
		return singleton;
		
		
	}
	
	
    public static void sconnect() {
    	try {
    		socket=new Socket("localhost",6066);
    		System.out.println("baðlandý");
    		din =new DataInputStream(socket.getInputStream());
    	
    		
    		String gun="";
    		String ay="";
    		String testSayisi="";
    		String vakaSayisi="";
    		String vefatSayisi="";
    		String iyileþenSayisi="";
    		String toptest="";
    		String topVaka="";
    		String topVefat="";
    		String topYogunBakim="";
    		String topEntube="";
    		String topiyilesen="";
    		while(!testSayisi.contentEquals("exit")) {
    			testSayisi=din.readUTF();
    			vakaSayisi=din.readUTF();
    			vefatSayisi=din.readUTF();
    			iyileþenSayisi=din.readUTF();
    			gun=din.readUTF();
    			ay=din.readUTF();
    			toptest=din.readUTF();
    			topVaka=din.readUTF();
    			topVefat=din.readUTF();
    			topYogunBakim=din.readUTF();
    			topEntube=din.readUTF();
    			topiyilesen=din.readUTF();
    			
    			textField_8 = new JTextField();
    			textField_8.setColumns(10);
    			textField_8.setBounds(428, 119, 157, 43);
    			contentPane.add(textField_8);
    			textField_8.setText(testSayisi);
    			textField_8.setEnabled(false);
    			
    			
    			textField_9 = new JTextField();
    			textField_9.setColumns(10);
    			textField_9.setBounds(428, 179, 157, 43);
    			contentPane.add(textField_9);
    			textField_9.setText(vakaSayisi);
    			
    			
    			textField_10 = new JTextField();
    			textField_10.setColumns(10);
    			textField_10.setBounds(428, 236, 157, 43);
    			contentPane.add(textField_10);
    			textField_10.setText(vefatSayisi);
    			
    			
    			textField_11 = new JTextField();
    			textField_11.setColumns(10);
    			textField_11.setBounds(428, 285, 157, 51);
    			contentPane.add(textField_11);
    			textField_11.setText(iyileþenSayisi);
    			
    			textField_12 = new JTextField();
    			textField_12.setBounds(190, 109, 99, 113);
    			textField_12.setFont(new Font("DFMincho-SU", Font.PLAIN, 50));
    			contentPane.add(textField_12);
    			textField_12.setColumns(10);
    			textField_12.setText(gun);
    			
    			textField_13 = new JTextField();
    			textField_13.setFont(new Font("DFMincho-SU", Font.PLAIN, 33));
    			textField_13.setBounds(167, 236, 146, 59);
    			contentPane.add(textField_13);
    			textField_13.setColumns(10);
    			textField_13.setText(ay);
    			
    			textField = new JTextField();
    			textField.setBounds(66, 109, 99, 27);
    			contentPane.add(textField);
    			textField.setColumns(10);
    			textField.setText(toptest);
    			
    			textField_3 = new JTextField();
    			textField_3.setColumns(10);
    			textField_3.setBounds(66, 157, 99, 27);
    			contentPane.add(textField_3);
    			textField_3.setText(topVaka);
    			
    			textField_4 = new JTextField();
    			textField_4.setColumns(10);
    			textField_4.setBounds(66, 195, 99, 27);
    			contentPane.add(textField_4);
    			textField_4.setText(topVefat);
    			
    			textField_5 = new JTextField();
    			textField_5.setColumns(10);
    			textField_5.setBounds(90, 233, 75, 27);
    			contentPane.add(textField_5);
    			textField_5.setText(topYogunBakim);
  		
    			
    			textField_6 = new JTextField();
    			textField_6.setColumns(10);
    			textField_6.setBounds(90, 282, 75, 27);
    			contentPane.add(textField_6);
    			textField_6.setText(topEntube);
    			
    			textField_7 = new JTextField();
    			textField_7.setColumns(10);
    			textField_7.setBounds(90, 320, 75, 27);
    			contentPane.add(textField_7);
    			textField_7.setText(topiyilesen);
    		
    			
    			
    			
    		}
    		
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
    	
	
}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientTablo frame = new ClientTablo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		sconnect();
	}

	
	public ClientTablo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Image img=new ImageIcon(this.getClass().getResource("/resim.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 11, 628, 380);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(66, 109, 99, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(66, 157, 99, 27);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(66, 195, 99, 27);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(90, 233, 75, 27);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(90, 282, 75, 27);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(90, 320, 75, 27);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(428, 119, 157, 43);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(428, 179, 157, 43);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(428, 236, 157, 43);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(428, 285, 157, 51);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("DFMincho-SU", Font.PLAIN, 33));
		textField_12.setBounds(190, 109, 99, 113);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("DFMincho-SU", Font.PLAIN, 33));
		textField_13.setBounds(167, 236, 146, 59);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		
		
	}
	public void TabloExe() {
		setVisible(true);
		sconnect();
	}
}
