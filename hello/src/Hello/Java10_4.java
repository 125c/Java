package Hello;

import java.util.Scanner;

public class Java10_4 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入0-100之間的整數:");
		i=sc.nextInt();
		if((i<0)||(i>100)) {
			
			System.out.println("母丟喔");
		}
		else {
			if((i>=0)&&(i<=40)) {
				System.out.println("i在0-40");
			}
			else if((i>=41)&&(i<=80)) {
				System.out.println("i在41-80");
			}
			else {
				System.out.println("i在81-100");
			}
			
		}
		sc.close();
	}
}
