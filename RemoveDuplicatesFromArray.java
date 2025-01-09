import java.util.Arrays;
class RemoveDuplicatesFromArray
{
	public static void main(String[] args) 
	{

		int [] a={2,3,2,5,3,2,5};
		int count=0;
		for (int i=0;i<=a.length-1 ;i++ )
		{
			boolean isPreviouslyPresent=false;
			for (int j=0;j<=i-1 ;j++ )
			{
				if (a[j]==a[i])
				{
					isPreviouslyPresent=true;
					break;
				}
			}

			if (isPreviouslyPresent==false)
			{
				count++;
			}
		}
		System.out.println(count);
		int [] b= new int [count];
		int indexB=0;
		for (int i=0;i<=a.length-1 ;i++ )
		{
			boolean isPreviouslyPresent=false;
			for (int j=0;j<=i-1 ;j++ )
			{
				if (a[j]==a[i])
				{
					isPreviouslyPresent=true;
					break;
				}
			}

			if (isPreviouslyPresent==false)
			{
				b[indexB]=a[i];
				indexB++;
			}
		}
		System.out.println(Arrays.toString(b));

				
	}
}
