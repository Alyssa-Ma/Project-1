
public class AMaProject1 
{
	public static String dateStrstring()
	{
		String date = "mm/dd/yyyy";
		String mmString = date.substring(0, 2);
		String ddString = date.substring(3, 5);
		String yyyyString = date.substring(6, 10);
		{
			return ddString + "-" + mmString + "-" + yyyyString;
		}
	}
	public static void multiplicationtable(int r)
	{
		int count = 0;
		for(int n = 0; count >= 0; n++)
		{
			System.out.println(n * r);
		}
		count ++;
	}
}
