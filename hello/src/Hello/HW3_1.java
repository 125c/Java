package Hello;

import java.util.Scanner;

public class HW3_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int z,n;//s起始e結束i增加量
		Scanner sc=new Scanner(System.in);	
		System.out.print("請輸入1-9:");
		z=sc.nextInt();
		sc.close();

		switch(z) {
		case 1:
			for(n=1;n<10;n++) {
				System.out.println(n+"×1＝"+n);
			}
			System.out.println("^ↀᴥↀ^");
			break;
		case 2:
			for(n=1;n<10;n++) {
				System.out.println(n+"×1＝"+n+"\t\t"+n+"×2＝"+(n*2));
			}
			System.out.println("^ↀᴥↀ^");
			break;
		case 3:
			for(n=1;n<10;n++) {
				System.out.println(n+"×1＝"+n+"\t\t"+n+"×2＝"+(n*2)+"\t\t"+n+"×3＝"+(n*3));
			}
			System.out.println("^ↀᴥↀ^");
			break;
		case 4:
			for(n=1;n<10;n++) {
				System.out.println(n+"×1＝"+n+"\t\t"+n+"×2＝"+(n*2)+"\t\t"+n+"×3＝"+(n*3));
			}
			System.out.println("^ↀᴥↀ^");
			for(n=1;n<10;n++) {
				System.out.println(n+"×4＝"+(n*4));
			}
			System.out.println("^ↀᴥↀ^");
			break;
		case 5:
			for(n=1;n<10;n++) {
				System.out.println(n+"×1＝"+n+"\t\t"+n+"×2＝"+(n*2)+"\t\t"+n+"×3＝"+(n*3));
			}
			System.out.println("^ↀᴥↀ^");
			for(n=1;n<10;n++) {
				System.out.println(n+"×4＝"+(n*4)+"\t\t"+n+"×5＝"+(n*5));
			}
			System.out.println("^ↀᴥↀ^");
			break;
		case 6:
			for(n=1;n<10;n++) {
				System.out.println(n+"×1＝"+n+"\t\t"+n+"×2＝"+(n*2)+"\t\t"+n+"×3＝"+(n*3));
			}
			System.out.println("^ↀᴥↀ^");
			for(n=1;n<10;n++) {
				System.out.println(n+"×4＝"+(n*4)+"\t\t"+n+"×5＝"+(n*5)+"\t\t"+n+"×6＝"+(n*6));
			}
			System.out.println("^ↀᴥↀ^");
			break;
		case 7:
			for(n=1;n<10;n++) {
				System.out.println(n+"×1＝"+n+"\t\t"+n+"×2＝"+(n*2)+"\t\t"+n+"×3＝"+(n*3));
			}
			System.out.println("^ↀᴥↀ^");
			for(n=1;n<10;n++) {
				System.out.println(n+"×4＝"+(n*4)+"\t\t"+n+"×5＝"+(n*5)+"\t\t"+n+"×6＝"+(n*6));
			}
			System.out.println("^ↀᴥↀ^");
			for(n=1;n<10;n++) {
				System.out.println(n+"×7＝"+n);
			}
			System.out.println("^ↀᴥↀ^");
			break;
		case 8:
			for(n=1;n<10;n++) {
				System.out.println(n+"×1＝"+n+"\t\t"+n+"×2＝"+(n*2)+"\t\t"+n+"×3＝"+(n*3));
			}
			System.out.println("^ↀᴥↀ^");
			for(n=1;n<10;n++) {
				System.out.println(n+"×4＝"+(n*4)+"\t\t"+n+"×5＝"+(n*5)+"\t\t"+n+"×6＝"+(n*6));
			}
			System.out.println("^ↀᴥↀ^");
			for(n=1;n<10;n++) {
				System.out.println(n+"×7＝"+(n*7)+"\t\t"+n+"×8＝"+(n*8));
			}
			System.out.println("^ↀᴥↀ^");
			break;
		case 9:
			for(n=1;n<10;n++) {
				System.out.println(n+"×1＝"+n+"\t\t"+n+"×2＝"+(n*2)+"\t\t"+n+"×3＝"+(n*3));
			}
			System.out.println("^ↀᴥↀ^");
			for(n=1;n<10;n++) {
				System.out.println(n+"×4＝"+(n*4)+"\t\t"+n+"×5＝"+(n*5)+"\t\t"+n+"×6＝"+(n*6));
			}
			System.out.println("^ↀᴥↀ^");
			for(n=1;n<10;n++) {
				System.out.println(n+"×7＝"+(n*7)+"\t\t"+n+"×8＝"+(n*8)+"\t\t"+n+"×9＝"+(n*6));
			}
			System.out.println("^ↀᴥↀ^");
			break;
		default:
			System.out.println("不要亂按！(／‵Д′)／~ ╧╧");
		}

	}

}
