package �з���;

import java.util.Random;

public class Helloworld{
	public static void main (String ags[])
	{
//		System.out.print("��ã�����\n");
//		System.out.printf("%12s\n","��ã�����");
//		System.out.printf("%1s","���");
//		System.out.printf("%12s\n","��ã�����");
//		{
//			int a=0;
//			System.out.println(a);
//		}
//		int a=1;
//		System.out.println(a);
		int c=0;
		double d=new Random().nextInt(2);
			System.out.println(d);
		for(int a=101;a<=200;a++)
		{
			int b=(int)Math.sqrt(a);
			for(int i=2;i<=b;i++)
			{	
				if((a%i)!=0)
				{
					if(i==b)
					{
						c++;
					System.out.println(a);
					}
					continue;
				}
				else
				{
					break;
				}
			}
		}
		System.out.println(c);
		
	}
	
}
