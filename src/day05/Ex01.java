package day05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
//		int sum=0;
//		
//		for(int i=1; i<=10;i++) {
//			sum+=i;
//		}
//		
//		System.out.println(sum);
		
		//입력받은 수 까지의 짝,홀의 총합 구하기
		
//		int su2=0;
//		int su3=0;
//		int sum=0;
//		System.out.println("숫자 입력 >>>");
//		int user=scan.nextInt();
//		
//		for(int i=1;i<=user;i++) {
//			
//			if(i%2==0) {
//				su2+=i;
//			}else {
//				su3+=i;
//			}
//			sum+=i;
//			
//		}
//		System.out.println("짝수의 총합 :"+su2);
//		System.out.println("홀수의 총합 :"+su3);
//		System.out.println("짝수와 홀수의 총합 :"+sum);
//		
		
		
//		for(int i=1; i<5; i++) {
//			System.out.println(i+".hello");
//		}
//		
//		int sum=0;
//		int su=0;
//		for(int i=1; i<=100;i++) {
//			sum+=i;
//			if(sum==528) {
//				System.out.println("마지막i:"+i);
//			}
//		}
		
//		for(int i=1; i<=32; i++) {
//			su+=i;
//		}
//		System.out.println(su);
		
//		
//		for(int i=1;i<=25;i++) {
//			System.out.print(i+"\t");
//			if(i%5==0) {
//				System.out.println("\n");
//			}
//		}
//		int sum=0;
//		
//		while(true) {
//			System.out.println("1~10사이의 숫자만 입력해라.");
//			int user=scan.nextInt();
//			if(user>=1 && user<=10) {
//				for(int i=1;i<=user;i++) {
//					sum+=i;
//				}
//				System.out.println("총합:"+sum);
//				break;
//			}
//			System.out.println("잘못입력 다시.");
//		}
		
//		int sum=0;
//		
//		while(true) {
//			System.out.println("10~20사이의 숫자만 입력해라.");
//			int user=scan.nextInt();
//			if(user>=10 && user<=20) {
//				for(int i=1;i<=user;i++) {
//					sum+=i;
//				}
//				System.out.println("총합:"+sum);
//				break;
//			}
//			System.out.println("잘못입력 다시.");
//		}
		
		System.out.println("숫자 1 입력 >>>>");
		System.out.println("숫자 2 입력 >>>>");
		int sum=0;
		int user1=scan.nextInt();
		int user2=scan.nextInt();
		if(user1<=user2) {
			user1=user2;
		}
		
		for(int i=1;i<=user1;i++) {
			sum+=i;
		}
		System.out.println("총합 :"+sum);
		
//		System.out.println("숫자 1 입력 >>>>");
//		System.out.println("숫자 2 입력 >>>>");
//		int sum1=0;
//		
//		int user3=scan.nextInt();
//		int user4=scan.nextInt();
//		int max=0;
//		int min=0;
//		
//		
//		if(user3<=user4) {
//			max=user4;
//			min=user3;
//		}else {
//			max=user3;
//			min=user4;
//		}
//		while(min<=max) {
//			sum1+=min;
//			min++;
//		}
//		System.out.println(sum1);
		
		
		
		
	}
	
}




