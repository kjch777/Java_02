package com.kh.serverEx;

import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) {
		
		int port = 3000; // 서버 포트 넘버와 동일해야 한다.
		String serverIp; // 서버 ip
		
		try {
			
			serverIp = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIp, port);
			System.out.println("서버에 연결됐습니다.");
			
			// BufferedReader로 문자열 읽어오기
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// PrintWriter로 출력하기
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			// 서버에게 메시지 전송하기
			out.print("Hello, Server!");
			
			// 서버로부터 온 메시지 수신 후 출력하기
			String m = in.readLine();
			System.out.println("send success : " + m);
			
			// close
			out.close();    // 클라이언트
			in.close();     // 서버
			socket.close(); // 소켓
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
