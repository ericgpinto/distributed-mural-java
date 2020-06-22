package Client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 6074);
			System.out.println("Conectado com servidor");
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Informe seu nome: ");
				String nome = sc.nextLine();
				
				while(true) {
					System.out.print("Digite sua mensagem: ");
					String msg = sc.nextLine();
					out.writeObject(nome);
					out.writeObject(msg);
					out.flush();
				}
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
