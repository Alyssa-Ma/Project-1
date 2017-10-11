
public class AMaProject1 
{
	public static String dateStrstring()
	{
		String date = "mm/dd/yyyy";
		String mmString = date.substring(0, 2);
		String ddString = date.substring(3, 5);
		String yyString = date.substring(6, 8);
		{
			return ddString + "-" + mmString + "-" + yyString;
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
