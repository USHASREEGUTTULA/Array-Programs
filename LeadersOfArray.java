class  LeadersOfArray
{
	public static void main(String[] args) 
	{
		int [] a={16,17,4,3,5,2};
		int x=a[a.length-1];
		
		System.out.println(x);
		for (int i=a.length-2;i>=0 ;i-- )
		{
				if (a[i]>x)
				{
					System.out.println(a[i]);
					x=a[i];

				}
				
			
			
		}
		
	}
}
