class SmallestElementFromArrayUsingMethod
{
	public static int smallestElement(int [] a)
	{
		int smallest=a[0];
		for (int i=0;i<=a.length-1 ;i++ )
		{	
			if (a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		return smallest;
	}
	public static void main(String[] args) 
	{

		int [] a={20,54,89,56,80,34};
		
		System.out.println("Smallest Element :"+smallestElement(a));
	}
}

