package Hello;

import java.util.Scanner;

public class Java09_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		String str;
		double i;
		double d;
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入字串:");
		str=sc.nextLine();
		System.out.print("請輸入int:");
		i=sc.nextInt();
		System.out.print("請輸入double:");
		d=sc.nextDouble();
		
		System.out.println("輸入的字串是:"+str);
		System.out.println("輸入的int是:"+i);
		System.out.println("輸入的double是:"+d);
		sc.close();
	}

}
