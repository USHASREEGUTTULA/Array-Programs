import java.util.Scanner;
import java.util.Arrays;
class  ArrayExample
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();

		int [] a=new int [size];
		System.out.println("Enter"+size+" array elements one by one");
		for (int i=0;i<=a.length-1 ;i++ )
		{
			a[i]=sc.nextInt();
		}
		//Method 1 (in -built)
		System.out.println("Array is : "+Arrays.toString(a));

		//Method 2
		System.out.print("[");
		for (int i=0;i<=a.length-1;i++ )
		{
			if (i==a.length-1)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.printp(a[i]+",");
			}
		}
		System.out.println("]");
		
		

	}
}
