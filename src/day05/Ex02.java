package day05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
//		
//		for(int i=0; i<5;i++) {
//			
//			if(i==3) {
//				System.out.println("if실행");
//				//continue;
//				break;
//			}
//			System.out.println("i : "+i);
//			
//		}
//		
//		int n1=10,n2=10;
//		if(n1==n2) {
//			System.out.println("두 수는 같다");
//		}
//		
//		//String s1="test", s2="test";
//		String s1,s2;
//		System.out.println(" 1 >>>");
//		s1=scan.next();
//		System.out.println(" 2 >>>");
//		s2=scan.next();
//		//if(s1==s2)
//		if(s1.equals(s2)) {
//			System.out.println("두 문자는 같다");
//		}else {
//			System.out.println("두 문자의 값이 다르다");
//		}
//		System.out.println(s1.equals(s2));
		
//		String userId=null;
//		String userPw=null;
//		String userID=null;
//		String userPW=null;
//		int num=1;
//		
//		while(num==1) {
//			System.out.println("1.로그인");
//			System.out.println("2.회원가입");
//			System.out.println("3.나가기");
//			System.out.println(">>>>>");
//			int user=scan.nextInt();
//			switch(user) {
//			case 1:
//				System.out.println("아이디 입력 >>");
//				userId=scan.next();
//				System.out.println("비밀번호 입력 >>");
//				userPw=scan.next();
//				if(userId.equals(userID) && userPw.equals(userPW)) {
//					System.out.println("인증 성공!!");
//					System.out.println("환영합니다 "+userId+"님");
//				}else {
//					System.out.println("인증 실패!!");
//				}
//				break;
//				
//			case 2:
//				System.out.println("아이디 입력 >>");
//				userID=scan.next();
//				System.out.println("비밀번호 입력 >>");
//				userPW=scan.next();
//				System.out.println("회원가입 완료!");
//				break;
//			case 3:
//				System.out.println("프로그램을 종료합니다!");
//				num=0;
//				break;
//			default :
//				System.out.println("잘못입력, 다시.");
//			}
//			
//			
//		}
	
		
		
		
		int num=1;
		int money=0;
		int coffee=2500;
		int koko=3000;
		
		while(num==1) {
			
			if(money==0) {
				System.out.println("요금을 투입하세요>>>>");
				money=scan.nextInt();
			}
			
			System.out.println("===========커피 자판기===========");
			System.out.println("1.헤이즐넛 아메리카노(2500)\t2.코코아(3000)\t3.반환\t4.종료");
			System.out.println("메뉴를 선택하세요>>>");
			int user=scan.nextInt();
			switch(user) {
			case 1:
				if(money>=coffee) {
					System.out.println("메가오더로 주문하신 헤이즐넛 나왔습니다~");
					money-=coffee;
					break;
				}else {
					System.out.println("잔액이 부족합니다!");
					break;
				}
			case 2:
				if(money>=koko) {
					System.out.println("코코아 나왔쪄염 뿌우~");
					money-=koko;
					break;
				}else {
					System.out.println("잔액이 부족합니다!");
					break;
				}
			case 3:
				System.out.println("네~ "+money+"원 반환 해드렸습니다^^");
				System.out.println("또 주문 하실 건가요??(1) ㄴㄴ (2) ㅇㅇ(아무 숫자 입력)");
				int userChoice=scan.nextInt();
				if(userChoice==1) {
					System.out.println("다음에 또 오시고~");
					num=0;
				}else {
					money=0;
				}
				break;
			case 4:
				System.out.println("다음에 또 오세요~");
				num=0;
				break;
			default:
				System.out.println("다시해봐. 그거 맞아?");
			}
		}
		
	}
}
	
	
	
	





















	
	
