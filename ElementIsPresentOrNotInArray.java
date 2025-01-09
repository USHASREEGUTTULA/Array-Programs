class  ElementIsPresentOrNotInArray
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5};
		int target=8;
		boolean isPresent=false;
		for (int i=0; i<=a.length-1;i++ )
		{
			if (a[i]==target)
			{
				isPresent=true;
				break;
			}
			
		}
		if (isPresent)
		{
			System.out.println("Target element is present in the Array");
		}
		else
		{
			System.out.println("Target element is not present in the Array");
		
		}
	}
}