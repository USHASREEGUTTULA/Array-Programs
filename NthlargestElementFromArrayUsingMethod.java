class NthlargestElementFromArrayUsingMethod
{
	public static int nthLargestElement(int [] a,int n)
	{
		int x=0;
		
		for (int i=0;i<=a.length-1 ;i++ )
		{	
			int count=0;
			for (int j=0;j<=a.length-1 ;j++ )
		{
			if (a[j]>a[i])
			{
				count++;
			}
		}
			if (count==(n-1))
			{
				x=a[i];
				break;
			}
		}
		return x;
		}
	

	
	public static void main(String[] args) 
	{

		int [] a={45,52,63,85,72};
		
		System.out.println(" N th Largest Element :"+nthLargestElement(a,3));
	}
}
