package Hello;

import java.util.Scanner;
//用for列出到指定變數n的99乘法 3組一排 中間夾分隔號

public class HW3_3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int z;
		Scanner sc=new Scanner(System.in);	
		System.out.print("請輸入1-9:");
		z=sc.nextInt();
		sc.close();
		while(z>=0 && z<=10) {
			System.out.println ("while的"+z);
			z++;
		}
	}

}
