package Hello;

import java.util.Scanner;

public class HW3_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int z=20,i,j=0,x;
//		Scanner sc=new Scanner(System.in);	
//		System.out.print("請輸入int:");
//		z=sc.nextInt();
//		sc.close();

		for(x=0;x<7;x+=3) {
//			for(int q=1;q<z;q++) {
				for(j=1;j<10;j++) {
					for(i=1;i<4;i++) {
						System.out.print((i+x)+"×"+j+"＝"+(i+x)*j+",\t\t");
					}System.out.println();
				}System.out.println("^ↀᴥↀ^");
//			}
		}
				
	}

}
