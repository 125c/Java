package Hello;

import java.util.Scanner;

public class HW3_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int z;
		Scanner sc=new Scanner(System.in);	
		System.out.print("請輸入int:");
		z=sc.nextInt();
		sc.close();
		for ( int k = 0 ; k < z ; k += 3 )
		{
		  for ( int j = 1 ; j < 11 ; j++ )
		  {
		    for ( int i = 1 ; i < 4 ; i++ )
		    {
		        System.out.printf ( "%d * %d = %d \t" , i + k , j , j * ( i + k ) );
		    }
		    System.out.println();
		  }
		  System.out.println();
		  System.out.println("====");
		}
		
		
		
		
	}

}
//System.out.println(a+"x"+i+"="+a*i+",  "+a+"x"+(i+1)+"="+a*(i+1));