package Hello;

public class Java12_2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i,j,k,arryInt[][][]= {
			{
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34}
			},
			{
				{41,42,43,44},
				{51,52,53,54},
				{61,62,63,64}
			},
			
		};
		System.out.println("3維2*3*4陣列的內容為:");
		for( i=0;i<arryInt.length;i++) {
			System.out.println("第"+(i+1)+"組是:");
			for( j=0;j<arryInt[i].length;j++) {
				System.out.println("   第"+(j+1)+"列是:");
				for( k=0;k<arryInt[i][j].length;k++) {
					System.out.print("     "+arryInt[i][j][k]+",");
				}
				System.out.print("\n");
			}
			
		}
		System.out.println("陣列arryInt第1維的元素個數:"+arryInt.length);
		System.out.println("陣列arryInt第2維的元素個數:"+arryInt[0].length);
		System.out.println("陣列arryInt第3維的元素個數:"+arryInt[0][0].length);
		
		System.out.println("第二種寫法===============================");
		
		int arryInt_1[][][]=new int[2][3][4];
		
		arryInt_1[0][0][0]=11;
		arryInt_1[0][0][1]=21;
		arryInt_1[0][0][2]=31;
		arryInt_1[0][0][3]=41;
		arryInt_1[0][1][0]=51;
		arryInt_1[0][1][1]=61;
		arryInt_1[0][1][2]=12;
		arryInt_1[0][1][3]=21;
		arryInt_1[0][2][0]=41;
		arryInt_1[0][2][1]=54;
		arryInt_1[0][2][2]=13;
		arryInt_1[0][2][3]=23;
		arryInt_1[1][0][0]=11;
		arryInt_1[1][0][1]=21;
		arryInt_1[1][0][2]=31;
		arryInt_1[1][0][3]=41;
		arryInt_1[1][1][0]=51;
		arryInt_1[1][1][1]=61;
		arryInt_1[1][1][2]=12;
		arryInt_1[1][1][3]=21;
		arryInt_1[1][2][0]=41;
		arryInt_1[1][2][1]=54;
		arryInt_1[1][2][2]=13;
		arryInt_1[1][2][3]=23;

		
		
		System.out.println("3維2*3*4陣列的內容為:");
		for( i=0;i<arryInt_1.length;i++) {
			System.out.println("第"+(i+1)+"組是:");
			for( j=0;j<arryInt_1[i].length;j++) {
				System.out.println("   第"+(j+1)+"列是:");
				for( k=0;k<arryInt_1[i][j].length;k++) {
					System.out.print("     "+arryInt_1[i][j][k]+",");
				}
				System.out.print("\n");
			}	
		}
	}
}
