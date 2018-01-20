public class Project64
{
	private static boolean isSquare(int a)
	{
		int b = (int) Math.sqrt(a);
		return b * b == a;
	}

	public static void main(String[] args)
	{
		int ans = 0;
		for (int i = 1; i <= 10000; i++)
		{
			int period = 0;
			int m = 0;
			int d = 1;
			int a = (int) Math.floor(Math.sqrt(i));
			if (isSquare(i))
				continue;
			while (a != 2 * (int) Math.floor(Math.sqrt(i)))
			{
				m = d * a - m;
				d = (i - m * m) / d;
				a = (int) Math.floor(((int) Math.floor(Math.sqrt(i)) + m)/d);
				period++;
			}
			if (period % 2 == 1)
				ans++;
		}
		System.out.println(ans);
	}
}
