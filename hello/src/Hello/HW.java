package Hello;

public class HW {

	public static void main(String[] args) {
		
		// TODO 自動產生的方法 Stub
	
		for ( int k = 0 ; k < 15 ; k += 3 )
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
