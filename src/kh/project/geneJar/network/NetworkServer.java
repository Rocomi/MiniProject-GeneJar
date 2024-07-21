package kh.project.geneJar.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class NetworkServer {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int port = 8080;

			PrintWriter pw = null;
			BufferedReader stream = null;
			ServerSocket server = null;

			try {
				server = new ServerSocket(port);

				System.out.println("...고객 요청 대기중...");

				Socket socket = server.accept();
				System.out.println("고객님의 연결");

				stream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());

				while (true) {

					String message = stream.readLine(); // 한줄씩 입력 받기
					
					if (message == null) {
						System.out.println("상대가 채팅을 종료하였습니다.");
						System.out.println();
						break;
					}
					System.out.println("고객 :" + message);

					// 클라이언트에게 출력하기
					System.out.print("메세지 입력 : ");
					String sendMessage = sc.nextLine();

					pw.println(sendMessage);
					pw.flush();

				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (pw != null)
						pw.close();
					if (stream != null)
						stream.close();
					if (server != null)
						server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
