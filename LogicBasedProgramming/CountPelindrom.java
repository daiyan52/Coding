class CountPelindrom
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int count=0;
		for(int i=a;i<=b;i++)
		{
			int temp = i;
			int rev=0;
			while(temp!=0)
			{
				int rem = temp%10;
				rev = 10*rev + rem;
				temp=temp/10;
			}
			temp=i;
			if(i==rev)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}
}