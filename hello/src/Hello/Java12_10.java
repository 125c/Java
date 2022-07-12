package Hello;

public class Java12_10 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int a=5,b=10;
		String s1="learing";
		String s2="Java";
		System.out.println("s1="+s1+",s2="+s2+",s1+s2="+Add(s1,s2));
		System.out.println("a="+a+",b="+b+",a+b="+Add(a,b));
	}
	public static int Add(int x,int y) {
		return x+y;
	}
	
	public static String Add(String x,String y) {
		return (x.concat(y));
		
	}

}
