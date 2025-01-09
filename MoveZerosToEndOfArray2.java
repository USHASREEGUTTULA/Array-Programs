import java.util.Arrays;
class MoveZerosToEndOfArray2
{
	public static void main(String[] args) 
	{
		int [] a = {1, 0, 2, 0, 3, 0, 4, 0};
		
		for (int i = 0; i <=a.length-1; i++) 
		{
			if (a[i]== 0) 
			{
			for (int j = i+1; j<=a.length-1; j++) 
			{
			if (a[j]!= 0) 
			{
				int temp=a[i];
				a[i]=a[j];2
				a[j]=temp;
				break;
			}
			}
				
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
