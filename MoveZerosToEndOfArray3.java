import java.util.Arrays;
class MoveZerosToEndOfArray3
{
	public static void main(String[] args) 
	{
		int [] a = {1, 0, 2, 0, 3, 0, 4, 0};
		int j=0;
		for (int i = 0; i <=a.length-1; i++) 
		{
			if (a[i]!= 0) 
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i=j;
				j++;
				
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
A,m/. 