package Hello;
import java.util.Scanner;
public class HW {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		System.out.print("請輸入??:");
		Scanner scanner = new  Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 2; i <= num; i++) {
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
	
	}
}
