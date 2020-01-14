package ÓÐ·ºÐÍ;

import java.util.Arrays;

public class IntegerDemo {
	public static void main(String agrs[])
	{
//		for(int i=9,a=0;i>=1;i--,a++)
//		{
//			for(int j=(9-a);j<=i&&j>0;j--)
//			{
//				System.out.print((i)+"*"+(j)+"="+(i*j)+"\t");
//			}
		System.out.println("\n");
		String b="123.3";
		int a=1;
		double c=Double.parseDouble(b);
		double f=Double.valueOf(a);
		
		System.out.println(c+f);
		String g[]= {"a","b","c","d"};
		String h[]= {"a","b","c","d"};
		String k[]=g;
		
		
		if(g[0]==h[0])
		{
			System.out.println(111);	
		}
		if(Arrays.equals(g, h))
		{
			System.out.println(2322);
		}
		if(g==h)
		{
			System.out.println(3333);
		}
		if(g.equals(k))
		{
			System.out.println(4444);
		}
	}
}

