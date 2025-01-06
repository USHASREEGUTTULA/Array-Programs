import java.util.Arrays;
class  RemoveVowelsFromArray
{
	public static void main(String[] args) 
	{
		char [] a = {'A','B','H','I','S','H','E','K'};
		char [] b = new char [a.length];
		int index=0;
		
		for (int i=0; i<=a.length-1;i++)
		{
			if (a[i]!='A'&& a[i]!='E'&& a[i]!='I'&& a[i]!='O'&& a[i]!='U')
			{
				b[index++]=a[i];
			}
		}
		char[] result = new char[index];
        for (int i = 0; i < index; i++) 
		{
            result[i] = b[i];
        }

		System.out.println(Arrays.toString(result));
		
	}
}
