import java.util.Arrays;
class AscendingOrderOfArray 
{
	public static int[] acsendingOrder(int [] a)
	{
		for (int i=0;i<=a.length-1 ;i++ )
		{
			for (int j=i+1;j<=a.length-1 ;j++ )
			{
				if (a[j]<a[i])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int [] a= {21,32,18,15,7,20};
		System.out.println("Ascending order of the array is :"+Arrays.toString(acsendingOrder(a)));
	}
}
