package Hello;

public class Java12_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i,j,arryInt[][]= {
			{11,21,31,41,51,61,12},
			{21,31,41,54,56,78,64},
			{43,23,45,67,89,67,45},
			{87,54,33,24,56,78,90},
			{12,34,56,78,95,34,34},
			{23,45,67,89,53,23,45},
		};
		System.out.println("5組陣列的內容為");
		for( i=0;i<arryInt.length;i++) {
			System.out.println("第"+(i+1)+"組是");
			for( j=0;j<arryInt[i].length;j++) {
				System.out.print(arryInt[i][j]+",");
			}
			System.out.print("\n");
		}
		System.out.println("陣列arryInt第一維的元素個數:"+arryInt.length);
		System.out.println("第二種寫法===============================");
		
		int arryInt_1[][]=new int[6][7];
		
		arryInt_1[0][0]=11;
		arryInt_1[0][1]=21;
		arryInt_1[0][2]=31;
		arryInt_1[0][3]=41;
		arryInt_1[0][4]=51;
		arryInt_1[0][5]=61;
		arryInt_1[0][6]=12;
		arryInt_1[1][0]=21;
		arryInt_1[1][1]=31;
		arryInt_1[1][2]=41;
		arryInt_1[1][3]=54;
		arryInt_1[1][4]=13;
		arryInt_1[1][5]=23;
		arryInt_1[1][6]=34;
		arryInt_1[2][0]=45;
		arryInt_1[2][1]=2;
		arryInt_1[2][2]=22;
		arryInt_1[2][3]=23;
		arryInt_1[2][4]=16;
		arryInt_1[2][5]=23;
		arryInt_1[2][6]=54;
		arryInt_1[3][0]=45;
		arryInt_1[3][1]=2;
		arryInt_1[3][2]=22;
		arryInt_1[3][3]=13;
		arryInt_1[3][4]=13;
		arryInt_1[3][5]=43;
		arryInt_1[3][6]=34;
		arryInt_1[4][0]=45;
		arryInt_1[4][1]=2;
		arryInt_1[4][2]=22;
		arryInt_1[4][3]=33;
		arryInt_1[4][4]=13;
		arryInt_1[4][5]=23;
		arryInt_1[4][6]=34;
		arryInt_1[5][0]=23;
		arryInt_1[5][1]=45;
		arryInt_1[5][2]=67;
		arryInt_1[5][3]=89;
		arryInt_1[5][4]=53;
		arryInt_1[5][5]=23;
		arryInt_1[5][6]=45;
		
		System.out.println("5組陣列的內容為");
		for( i=0;i<arryInt_1.length;i++) {
			System.out.println("第"+(i+1)+"組是");
			for( j=0;j<arryInt_1[i].length;j++) {
				System.out.print(arryInt_1[i][j]+",");
			}
			System.out.print("\n");
		}
		System.out.println("陣列arryInt_1第一維的元素個數:"+arryInt_1.length);
		
		
		
	}

}
