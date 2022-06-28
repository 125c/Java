package Hello;

public class Java03 {

	public static void main(String[] args) {
		long lmax=java.lang.Long.MAX_VALUE;
		int imax=java.lang.Integer.MAX_VALUE;
		short smax=java.lang.Short.MAX_VALUE;
		byte bmax=java.lang.Byte.MAX_VALUE;

		long lmin=java.lang.Long.MIN_VALUE;
		int imin=java.lang.Integer.MIN_VALUE;
		short smin=java.lang.Short.MIN_VALUE;
		byte bmin=java.lang.Byte.MIN_VALUE;
		System.out.println("Long可標示最大值："+lmax);
		System.out.println("Long可標示最小值："+lmin+"\n------------");
		System.out.println("Int可標示最大值："+imax);
		System.out.println("Int可標示最小值："+imin+"\n------------");
		System.out.println("Short可標示最大值："+smax);
		System.out.println("Short可標示最小值："+smin+"\n------------");
		System.out.println("Byte可標示最大值："+bmax);
		System.out.println("Byte可標示最小值："+bmin+"\n------------");
		
	}

}
