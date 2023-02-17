package com.KoreaIT.java.AM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		int ArticleId = 0;
		List<Article> articles = new ArrayList<>();
		
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
				if (articles.size() == 0) {
					System.out.println("게시글이 없습니다");
					continue;
				}
				else {
					System.out.println("게시글 있음");
				}
			} 
			else if (cmd.equals("article write")) {
				int id = ArticleId + 1;
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				
//				System.out.printf("%s / %s\n", title, body);
				
				Article article = new Article(id, title, body);
				articles.add(article);
				
				System.out.println(id + "번 글이 생성되었습니다");
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

class Article {
	int id;
	String title;
	String body;
	
	Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
}