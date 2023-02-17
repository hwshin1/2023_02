package com.KoreaIT.java.AM;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		int ArticleId = 0;
		
		while (true) {
			System.out.println("명령어 ) ");
			String cmd = sc.nextLine();
			
			if (cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}
			
			if (cmd.equals("system exit")) {
				break;
			}
			
			if (cmd.equals("article list")) {
				System.out.println("게시글이 없습니다");
			} 
			else if (cmd.equals("article write")) {
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				
				System.out.printf("%s / %s\n", title, body);
				
				System.out.println((ArticleId + 1) + "번 글이 생성되었습니다");
				ArticleId++;
			} 
			else {
				System.out.println("존재하지 않습니다");
			}
		}
		
		System.out.println("== 프로그램 끝 ==");
		sc.close();
	}
}