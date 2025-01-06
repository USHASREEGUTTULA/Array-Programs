import java.util.Arrays;
class  InsertElementAtIndexInArray
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5};
		int [] b = new int [a.length+1];
		int target=6;
		int index=3;

		for (int i=0; i<=2;i++ )
		{
			b[i]=a[i];
			
		}
		b[index]=target;
		
		for (int i=index; i<=a.length-1;i++ )
		{
			b[i+1]=a[i];
		}


		System.out.println(Arrays.toString(b));
		
	}
}
