import java.util.Arrays;
class  RemoveVowelsFromArrayAnotherMethod
{
	public static void main(String[] args) 
	{
		char [] a = {'A','B','H','I','S','H','E','K'};
		int count=0;
		
		for (int i=0; i<=a.length-1;i++)
		{
			if (a[i]!='A'&& a[i]!='E'&& a[i]!='I'&& a[i]!='O'&& a[i]!='U')
			{
				count++;
			}
		}
		char[] b = new char[count];
		int indexB=0;
        for (int i = 0; i<=a.length-1; i++) 
		{
			if (a[i]!='A'&& a[i]!='E'&& a[i]!='I'&& a[i]!='O'&& a[i]!='U')
			{
           b[indexB] = b[i];
		   indexB++;
			}
        }

		System.out.println(Arrays.toString(b));
		
	}
}
