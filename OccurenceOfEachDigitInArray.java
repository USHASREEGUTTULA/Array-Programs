class OccurenceOfEachDigitInArray
{
	public static void main(String[] args) 
	{

		int [] a={2,3,2,5,3,2,5};
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
				int count=0;
				for (int j=0;j<=a.length-1 ;j++ )
				{
					if (a[j]==a[i])
					{
						count++;
					}
				}
				System.out.println(a[i]+" is repeated "+count+" times");
			}
		}
	}
}
