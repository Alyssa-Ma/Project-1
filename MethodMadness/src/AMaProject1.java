public class AMaProject1 
{
	public static String dateStrstring(String date)
	{
		String mmString = date.substring(0, 2);
		String ddString = date.substring(3, 5);
		String yyyyString = date.substring(6, 10);
		{
			return ddString + " - " + mmString + " - " + yyyyString;
		}
	}
	public static void multiplicationtable(int b, int r)
	{
		for(int i = 0; i <= r; i++)
		{
			System.out.println(b + "*" + i + "=" + (b*i));
		}
	}
	//fixed base multiplied by range to i
	public static String cutOut(String mainStr, String subStr)
	{
		for(int i = 0; i < mainStr.length();)
		{
			if(subStr.charAt(i) == mainStr.charAt(i));
			{
				return mainStr;
			}
		}
		System.out.println(mainStr);
	}
}