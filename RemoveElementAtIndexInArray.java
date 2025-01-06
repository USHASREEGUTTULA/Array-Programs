import java.util.Arrays;
class  RemoveElementAtIndexInArray
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5,6};
		int [] b = new int [a.length-1];
		
		int index=2;

		for (int i=0; i<=b.length-1;i++ )
		{
			if (i<index)
			{
				b[i]=a[i];
			}
			
			else 
			{
				b[i]=a[i+1];
			}
		}

		System.out.println(Arrays.toString(b));
		
	}
}
