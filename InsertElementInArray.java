import java.util.Arrays;
class InsertElementInArray
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5,6,7};
		int target=8;
		int [] b= new int [a.length+1];
		for (int i =0;i<=a.length-1 ;i++ )
		{
			b[i]=a[i];
		}
		b[b.length-1]=target;
		System.out.println(Arrays.toString(b));
	}
}
