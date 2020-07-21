package Client;

import java.awt.BorderLayout;



import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.jfree.data.category.DefaultCategoryDataset;
import java.io.DataInputStream;
import java.net.Socket;
import java.awt.Color;

public class ClientGrafik extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static ClientGrafik singleton;
	private static Object k=new Object();
	
	
	public static ClientGrafik instance() {
		if(singleton==null) {
			synchronized (k) {
				if(singleton==null) {
					singleton=new ClientGrafik();
				}
				
			}
			
		}
		return singleton;
		
		
	}
	
	
	public static void sconnect() {
    	try {
    		Socket socket = new Socket("localhost",6066);
    		System.out.println("ba�land�");
    		DataInputStream din = new DataInputStream(socket.getInputStream());
    	
    		
    																	//HOCAM GRAF�K KISMINI YAPARKEN JFREECHART K�T�PHANES�NDEN YARARLANDIM.
    		String gun="";
    		String ay="";
    		String testSayisi="";
    		String vakaSayisi="";
    		String vefatSayisi="";
    		String iyile�enSayisi="";
    		String toptest="";											
    		String topVaka="";
    		String topVefat="";
    		String topYogunBakim="";
    		String topEntube="";
    		String topiyilesen="";
    		
    		while(!vakaSayisi.contentEquals("�IK")) {
    			testSayisi=din.readUTF();
    			vakaSayisi=din.readUTF();
    			vefatSayisi=din.readUTF();
    			iyile�enSayisi=din.readUTF();
    			gun=din.readUTF();
    			ay=din.readUTF();
    			toptest=din.readUTF();
    			topVaka=din.readUTF();
    			topVefat=din.readUTF();
    			topYogunBakim=din.readUTF();
    			topEntube=din.readUTF();
    			topiyilesen=din.readUTF();
    		
    			JPanel panel = new JPanel();
    			panel.setBounds(10, 11, 687, 419);
    			contentPane.add(panel);
    			
    			DefaultCategoryDataset barChartData=new DefaultCategoryDataset();
				barChartData.setValue(Integer.parseInt(topVaka), "", "VAKA");
				barChartData.setValue(Integer.parseInt(topVefat), "", "VEFAT");
				barChartData.setValue(Integer.parseInt(toptest), "", "TEST");
				barChartData.setValue(Integer.parseInt(topiyilesen), "", "�Y�LE�EN");
				barChartData.setValue(Integer.parseInt(topYogunBakim), "", "YO�UN BAKIM");
				barChartData.setValue(Integer.parseInt(topEntube), "", "ENT�BE");
				
				
				JFreeChart barchart =ChartFactory.createBarChart("T�RK�YE G�NL�K KORONA V�R�S TABLOSU", "TOPLAM HASTA SAYILARI", gun+" "+ay+ " G�NCEL VER�LER", barChartData,PlotOrientation.VERTICAL,false,true,false);
				CategoryPlot barchrt=barchart.getCategoryPlot();
				barchrt.setRangeGridlinePaint(Color.ORANGE);
				ChartPanel barPanel=new ChartPanel(barchart);
				panel.removeAll();
				panel.add(barPanel, BorderLayout.CENTER);
				panel.validate();

    			
    			
    			
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
					ClientGrafik frame = new ClientGrafik();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		sconnect();
		
		
	}

	/**
	 * Create the frame.
	 */
	private ClientGrafik() {
		
		
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		   
		
	}
	
	public void grafikExe() {
		setVisible(true);
		sconnect();
	}
	 
}
