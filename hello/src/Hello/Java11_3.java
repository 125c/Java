package Hello;

public class Java11_3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i,sum=0,accumulateNumber=10,aa,z;
		for (i=1;i<=accumulateNumber;i++) {
			sum+=i;
			System.out.println("sum="+sum);
		}
		sum=0;
		System.out.println("1-10的總和為"+sum);
		for (i=1;i<=accumulateNumber;i+=2) {
			sum+=i;
			System.out.println("i是:"+i);
		}
		System.out.println("i+=2的sum="+sum);
		System.out.println("=====");
		
		
		sum=0;
		for (i=1;i<=accumulateNumber;i++) {
			if(i%2!=0) {
				sum+=i;
				System.out.println("i是:"+i);
			}
		}
		
		System.out.println("sum%2!=0的sum=  "+sum);
		
		
		System.out.println("=====");
		sum=0;
		for (i=1;i<=accumulateNumber;i++) {
			if((i%2)==1) {
				sum+=i;
				System.out.println("i="+i);
			}
		}System.out.println("i+=2的sum="+sum);
	}

}
