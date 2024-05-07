package com.kh.serverEx;

import java.io.*;
import java.net.*;

public class Server {
	
	public static void main(String[] args) {
		
		int port = 3000;
		String serverIp = "192.00.3.58"; // ���� IP�ּ� ����
		ServerSocket server;
		
		try {
			
			// server = new ServerSocket(port); // ���� IP�ּ� ������ ���� �ʾ��� �� ���
			// server = new ServerSocket(port, InetAddress.getByName(serverIp)); �� ���� ���
			server = new ServerSocket(port, 50, InetAddress.getByName(serverIp)); 
			//                               �� ���ÿ� �ټ��� �������� ��, ����� �� �ִ� �ִ� �ο� ��
			// �� IP�ּ�(�� ��) ���� �����ڸ� �ۼ����� �ʾƵ� ������,
			// ���� IP�ּ�(���� ��) ���� ������ ������ ����� �Ѵ�.
			// ���� ������� �ʴ��� ���� �ּ�.getByName // ��⿭ (50) // ���� ��� (3000)
			
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			
			// BufferedReader : ���ڿ��� �ǽð����� �о����
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			// PrintWriter : �о�� ���ڿ��� ����ϱ�
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			
			// Client�κ��� ���� �޽��� �����ϱ�
			String m;
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
				out.println("c h e c k");
			}
			
			client.close(); // Ŭ���̾�Ʈ ���� �ݾ��ְ�
			server.close(); // ���߿� ���� �ݾ��ֱ�
			
		} catch (IOException e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
	}
}
