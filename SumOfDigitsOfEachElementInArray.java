class  SumOfDigitsOfEachElementInArray
{
	public static void main(String[] args) 
	{
		int [] a = {213,436,784,354};
		for (int i=0; i<=a.length-1;i++ )
		{
			System.out.println(a[i]+"-->"+sumOfDigits(a[i]));
		}
	}
	
	
	public static int sumOfDigits(int num) 
	{
			int sum=0;
			while(num!=0)
		{
				int ld=num%10;
				sum=sum+ld;
				num=num/10;
		}
		return sum;

	}
}
