package com.kh.serverEx;

import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) {
		
		int port = 3000; // ���� ��Ʈ �ѹ��� �����ؾ� �Ѵ�.
		String serverIp; // ���� ip
		
		try {
			
			serverIp = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIp, port);
			System.out.println("������ ����ƽ��ϴ�.");
			
			// BufferedReader�� ���ڿ� �о����
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// PrintWriter�� ����ϱ�
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			// �������� �޽��� �����ϱ�
			out.print("Hello, Server!");
			
			// �����κ��� �� �޽��� ���� �� ����ϱ�
			String m = in.readLine();
			System.out.println("send success : " + m);
			
			// close
			out.close();    // Ŭ���̾�Ʈ
			in.close();     // ����
			socket.close(); // ����
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
