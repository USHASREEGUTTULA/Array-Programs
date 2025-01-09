class LargestElementFromArrayUsingMethod
{
	public static int largestElement(int [] a)
	{
		int largest=a[0];
		for (int i=0;i<=a.length-1 ;i++ )
		{	
			if (a[i]>largest)
			{
				largest=a[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) 
	{

		int [] a={20,54,89,56,80,34};
		
		System.out.println("Largest Element :"+largestElement(a));
	}
}
