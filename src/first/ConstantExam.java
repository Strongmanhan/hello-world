package first;

import java.util.Scanner;

public class ConstantExam {
	public static void main(String[] args) {
		int value = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			
			value = in.nextInt();
			System.out.println("�Է� ���� ���� :"+value);
		}while(value != 10);
		
		System.out.println("�ݺ��� ����!!");
		

}
}