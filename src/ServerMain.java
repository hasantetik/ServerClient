
import java.io.DataOutputStream;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;





public class ServerMain {
	
	
	
	//static ServerSocket ss;
	static Socket s;
	
	static DataOutputStream dout;
	
	static List<ObservableServerSocket> connections =new ArrayList<ObservableServerSocket>();
	static boolean serverRun=true;

	public static void main(String[] args) {
		
		try {
			ObservableServerSocket sc1=new ObservableServerSocket();
			frm1 fr=new frm1();
			fr.setVisible(true);
			sc1.start();
			System.out.println("server run");
			while(serverRun) {
				s=sc1.ss().accept();
				System.out.println("client connected");
				ObservableServerSocket sc=new ObservableServerSocket(s);
				sc.start();
				connections.add(sc);
				
			}
		
			dout=sc1.call();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		

	}
	
	

	
	

}
