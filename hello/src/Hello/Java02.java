package Hello;

public class Java02 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int num;
		double d,D;
		char input='a';
		num=9;
		d=2.3;
		D=1.8;
		System.out.print("1.我有"+num+"個桌遊"); /*不會換行*/
		System.out.println("2.我有"+d+"個桌遊");
		System.out.println("3."+d+num+D);/*int+double會變成字串相加。大小寫視為不同變數*/
		System.out.println("4."+input);
	}

}
