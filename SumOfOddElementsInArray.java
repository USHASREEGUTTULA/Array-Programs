class SumOfOddElementsInArray 
{
	public static void main(String[] args) 
	{
		int [] a={11,21,38,40,51};
		int sum=0;
		for (int i=0 ;i<=a.length-1 ;i++ )
		{
			if (a[i]%2==1)
			{
				sum=sum+a[i];
			}
			
		}
		System.out.println("Sum of the odd elements in an array is :"+sum);
		
	}
}
