package com.kh.serverEx;

import java.io.*;
import java.net.*;

public class Server {
	
	public static void main(String[] args) {
		
		int port = 3000;
		String serverIp = "192.00.3.58"; // 서버 IP주소 변경
		ServerSocket server;
		
		try {
			
			// server = new ServerSocket(port); // 서버 IP주소 변경을 하지 않았을 때 사용
			// server = new ServerSocket(port, InetAddress.getByName(serverIp)); ▶ 옛날 방법
			server = new ServerSocket(port, 50, InetAddress.getByName(serverIp)); 
			//                               ▲ 동시에 다수가 접속했을 때, 대기할 수 있는 최대 인원 수
			// 내 IP주소(내 집) 에는 대기숫자를 작성하지 않아도 되지만,
			// 남의 IP주소(남의 집) 에는 대기숫자 제한을 해줘야 한다.
			// 내가 사람들을 초대할 곳의 주소.getByName // 대기열 (50) // 오는 방법 (3000)
			
			Socket client = server.accept();
			System.out.println("클라이언트가 접속했습니다.");
			
			// BufferedReader : 문자열을 실시간으로 읽어오기
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			// PrintWriter : 읽어온 문자열을 출력하기
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			
			// Client로부터 받은 메시지 수신하기
			String m;
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
				out.println("c h e c k");
			}
			
			client.close(); // 클라이언트 먼저 닫아주고
			server.close(); // 나중에 서버 닫아주기
			
		} catch (IOException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
}
