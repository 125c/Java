package Hello;

public class Java03_1 {

	public static void main(String[] args) {
		int i=java.lang.Integer.MAX_VALUE;
		long j=java.lang.Integer.MAX_VALUE;/*j的範圍比i大一倍*/
		
		int num;
		System.out.println("i="+i);
		num =i+1;/*發生溢位*/
		System.out.println("整數i+1="+num);
		System.out.println("i+1="+(i+1));
		long numL;
		numL=i+1L;/*long的型態的1*/
		System.out.println("長整數i+1="+numL);
		System.out.println("長整數j+2="+(j+2));

	}

}
