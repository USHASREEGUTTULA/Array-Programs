import java.util.Arrays;
class  ReverseOfEachElementInArray
{
	public static void main(String[] args) 
	{
		int [] a = {213,436,784,354};
		int x=0;
		int y=a.length-1;
		while(x<y)
		{
			int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			x++;
			y--;
		}
		System.out.println(Arrays.toString(a));
	
	}
	
	
}