package Hello;

public class Java11_4 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i = 1,sum=0,stopNumber=10,answer=1;
		while(i<=stopNumber) {
			answer=2*answer;
			System.out.println("2的"+i+"次方="+answer);
			i++;
		}
		i=1;//i=0的話會做11次 包含0
		answer=1;
		System.out.println("==answer=answer<<1的寫法================");
		while(i<=stopNumber) {
			answer=answer<<1;
			System.out.println("answer="+answer);
			i++;
		}
	}

}
