public class AMaProject1 
{
	//Alyssa Ma edit 10/26/17
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
		//test code attempts felt like I could make it work, but only returns ne
			//int a = mainStr.indexOf(subStr);
			//mainStr.substring(a);
			//String finalStr = mainStr.substring(a, subStr.length() + 1);
			//{
				//return finalStr;
			//}
		String finalStr = (mainStr.replaceAll(subStr,""));
		{
			return finalStr;
		}
	}
}