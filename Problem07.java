package ch04.sec08.practice;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		while(true) {
			System.out.println("===============================");
			System.out.println("    [숫자 맞추기 게임 시작]");
			System.out.println("===============================");
			
			int randomNumber = (int)(Math.random()*100+1);
			
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				System.out.print(">> ");
				int inputNumber = sc.nextInt();
				
				if (inputNumber < randomNumber) {
					System.out.println("더 높게");
				} else if (inputNumber > randomNumber) {
					System.out.println("더 낮게");
				} else {
					System.out.println("맞았습니다.");
					break;
				}
			} 
			System.out.print("게임을 종료하시겠습니까? (y/n) ");
			String goStop = sc.next();
			if ("y".equals(goStop)) {
				System.out.println("===============================");
				System.out.println("    [숫자 맞추기 게임 종료]");
				System.out.println("===============================");
				break;
			} else;
		}
	}
}
