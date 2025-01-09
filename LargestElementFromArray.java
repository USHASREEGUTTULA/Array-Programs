class LargestElementFromArray
{
	public static void main(String[] args) 
	{

		int [] a={20,54,89,56,80,34};
		int largest=a[0];
		for (int i=0;i<=a.length-1 ;i++ )
		{	
			if (a[i]>largest)
			{
				largest=a[i];
			}
		}
			System.out.println("Largest Element :"+largest);
	}
}
