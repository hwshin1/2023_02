package com.KoreaIT.java.AM;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("명령어 ) ");
			String cmd = sc.nextLine();
			
			if (cmd.equals("system exit")) {
				break;
			}
		}
		
		System.out.println("== 프로그램 끝 ==");
		sc.close();
	}
}