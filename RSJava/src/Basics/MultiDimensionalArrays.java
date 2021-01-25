package Basics;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		//
		int a[][]=new int[3][3];
		a[0][0]=0;
		a[0][1]=1;
		a[0][2]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=5;
		a[2][0]=6;
		a[2][1]=7;
		a[2][2]=8;
		System.out.println(a[1][1]);
		
	//int b[][]= {{9,8,7},{6,5,4},{3,2,1}};
	//System.out.println(b[2][1]);
for (int i=0;i<2;i++)//row 
	{
	for (int j=0;j<3;j++)//column
		{
		System.out.println(a[i][j]);
		
	}
	

	}
}
}

