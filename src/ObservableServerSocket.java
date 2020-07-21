import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;




public class ObservableServerSocket extends Thread implements ServrSocket,DataOutputStrem {
	private static ServerSocket ss;
	private Socket socket;
	private DataInputStream din;
	private DataOutputStream dout;
	private boolean serverRun =true;
	
	public ObservableServerSocket() {
		try {
			ss=new ServerSocket(6066);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public ObservableServerSocket(Socket socket) {
		
		super("ServerConnectionThread");
		this.socket=socket;
		
	}
	public void sendToClient(String text) {
		try {
			
			dout.writeUTF(text);
			dout.flush();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	
	
	
	public void sendToAllClient(String text) {
		for(int i=0;i<ServerMain.connections.size();i++) {
			ObservableServerSocket sc=ServerMain.connections.get(i);
			sc.sendToClient(text);
			
		
			
			
		}
		
	}



	public void run() {
	
		try {
			
			din=new DataInputStream(socket.getInputStream());
			dout=new DataOutputStream(socket.getOutputStream());
			while(serverRun) {
				while(din.available()==0) {
					try {
						Thread.sleep(1);
					}
					catch(Exception e){
						System.out.println(e);
					}
				}
				String text=din.readUTF();
			
				sendToAllClient(text);
				
			}
			
			din.close();
			
			close(socket);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	private static void close(Socket socket) {
        try {
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
       } 
	}
	
	 public void close(ServerSocket ss) {
         try {
             ss.close();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }

	public ServerSocket ss() {
		
		return ss;
	}



	
	public DataOutputStream call() {

		try {
			return  (DataOutputStream) socket.getOutputStream();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return dout;

	}

	
	

	@Override
	public void call(ServerSocket ss) {
		
		 try {
             ss.close();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
	}

	

	
} 
