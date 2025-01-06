import java.util.Arrays;
class  ReverseOfDigitsOfEachElementInArray
{
	public static void main(String[] args) 
	{
		int [] a = {213,436,784,354};
		for (int i=0; i<=a.length-1;i++ )
		{
			a[i]=reverse(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}
	
	
	public static int reverse(int num) 
	{
			int rev=0;
			while(num!=0)
		{
				int ld=num%10;
				rev=rev*10+ld;
				num=num/10;
		}
		return rev;

	}
}
