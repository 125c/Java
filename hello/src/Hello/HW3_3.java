package Hello;

import java.util.Scanner;
//用for列出到指定變數n的99乘法 3組一排 中間夾分隔號

public class HW3_3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int z,a = 0 ;
		Scanner sc=new Scanner(System.in);	
		System.out.print("請輸入正整數（´-`）.｡oO（）");
		z=sc.nextInt();
		sc.close();
		while(z>=0&&z<=z) {
			for (int i = 2; i <= z; i++) {
				boolean flag = true;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					a++;
					System.out.println(i);
				}
			}System.out.println("共"+a+"個");
			z--;
			break;
		}
	}
}
