package Hello;
//import java.util.Scanner;
public class HW2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int c,t = 0,i=0;
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		for(c=1;c<10;c++) 
		{
			for(t=i;t<10;t++) {
			System.out.print(c+"x"+t+"="+c*t+"|");
			if(c%3==0) {break;}
			}
			
			System.out.println();

			if((c%3==0)&&(t==9)) 
			{
				System.out.println("xxxx");
				c=1;
				i=t+1;
			}
		}
	}
}