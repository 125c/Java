package Hello;

import java.util.Scanner;

public class Java09_3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int i,a;
		Scanner sc=new Scanner(System.in);	
		System.out.print("請輸入int:");
		i=sc.nextInt();
		sc.close();
		for(a=1;a<10;a++) {
			System.out.println(a+"x"+i+"="+a*i);
		}
	}

}
