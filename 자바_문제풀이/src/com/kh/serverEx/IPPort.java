package com.kh.serverEx;

import java.net.*;

public class IPPort {
	public static void main(String[] args) {
		try {
			
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println(serverIP);
			//                         serverIP == 내 컴퓨터의 IP 주소
			Socket socket = new Socket(serverIP, 3000);
			System.out.println(socket);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
