
import java.util.Arrays;
class RemoveElementAtIndexInArray2
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5};
		int [] b = new int [a.length-1];
		
		int index=2;
		boolean isindexPresent=false;
		for (int i=0; i<=2;i++ )
		{
			b[i]=a[i];
			

		if (index==2)
		{
			isindexPresent=true;
			break;
		}
		}
		
		for (int i=index; i<=a.length-1;i++ )
		{
			b[i]=a[i+1];
		}


		System.out.println(Arrays.toString(b));
		
	}
}
