package day05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
//		
//		for(int i=0; i<5;i++) {
//			
//			if(i==3) {
//				System.out.println("if����");
//				//continue;
//				break;
//			}
//			System.out.println("i : "+i);
//			
//		}
//		
//		int n1=10,n2=10;
//		if(n1==n2) {
//			System.out.println("�� ���� ����");
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
//			System.out.println("�� ���ڴ� ����");
//		}else {
//			System.out.println("�� ������ ���� �ٸ���");
//		}
//		System.out.println(s1.equals(s2));
		
//		String userId=null;
//		String userPw=null;
//		String userID=null;
//		String userPW=null;
//		int num=1;
//		
//		while(num==1) {
//			System.out.println("1.�α���");
//			System.out.println("2.ȸ������");
//			System.out.println("3.������");
//			System.out.println(">>>>>");
//			int user=scan.nextInt();
//			switch(user) {
//			case 1:
//				System.out.println("���̵� �Է� >>");
//				userId=scan.next();
//				System.out.println("��й�ȣ �Է� >>");
//				userPw=scan.next();
//				if(userId.equals(userID) && userPw.equals(userPW)) {
//					System.out.println("���� ����!!");
//					System.out.println("ȯ���մϴ� "+userId+"��");
//				}else {
//					System.out.println("���� ����!!");
//				}
//				break;
//				
//			case 2:
//				System.out.println("���̵� �Է� >>");
//				userID=scan.next();
//				System.out.println("��й�ȣ �Է� >>");
//				userPW=scan.next();
//				System.out.println("ȸ������ �Ϸ�!");
//				break;
//			case 3:
//				System.out.println("���α׷��� �����մϴ�!");
//				num=0;
//				break;
//			default :
//				System.out.println("�߸��Է�, �ٽ�.");
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
				System.out.println("����� �����ϼ���>>>>");
				money=scan.nextInt();
			}
			
			System.out.println("===========Ŀ�� ���Ǳ�===========");
			System.out.println("1.������� �Ƹ޸�ī��(2500)\t2.���ھ�(3000)\t3.��ȯ\t4.����");
			System.out.println("�޴��� �����ϼ���>>>");
			int user=scan.nextInt();
			switch(user) {
			case 1:
				if(money>=coffee) {
					System.out.println("�ް������� �ֹ��Ͻ� ������� ���Խ��ϴ�~");
					money-=coffee;
					break;
				}else {
					System.out.println("�ܾ��� �����մϴ�!");
					break;
				}
			case 2:
				if(money>=koko) {
					System.out.println("���ھ� �����ǿ� �ѿ�~");
					money-=koko;
					break;
				}else {
					System.out.println("�ܾ��� �����մϴ�!");
					break;
				}
			case 3:
				System.out.println("��~ "+money+"�� ��ȯ �ص�Ƚ��ϴ�^^");
				System.out.println("�� �ֹ� �Ͻ� �ǰ���??(1) ���� (2) ����(�ƹ� ���� �Է�)");
				int userChoice=scan.nextInt();
				if(userChoice==1) {
					System.out.println("������ �� ���ð�~");
					num=0;
				}else {
					money=0;
				}
				break;
			case 4:
				System.out.println("������ �� ������~");
				num=0;
				break;
			default:
				System.out.println("�ٽ��غ�. �װ� �¾�?");
			}
		}
		
	}
}
	
	
	
	





















	
	
