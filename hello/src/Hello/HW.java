package Hello;
import java.util.Scanner;
public class HW {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		System.out.print("請輸入??:");
		Scanner scanner = new  Scanner(System.in);
		// 獲取輸入的數值
		int num = scanner.nextInt();
		// 遍歷 2 ~~ input 之間 所有數，有=包括input
		for (int i = 2; i <= num; i++) {
			// flag = true是代表質數，flag = false不是代表質數
			boolean flag = true;
			// 判斷 i 是不是質數，只要在 2 ~~ i 之間不能被 input 整除
			for (int j = 2; j <= Math.sqrt(i); j++) {
				// 如果i能整除j說明 i不是質數，flag設定為 false
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			// 如果 flag = true 說明是質數
			if (flag) {
				a++;
				System.out.println(i);
			}
		}System.out.println("共"+a+"個");
	
	}
}
