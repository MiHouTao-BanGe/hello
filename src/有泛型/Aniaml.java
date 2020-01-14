package ÓÐ·ºÐÍ;

import java.util.Arrays;
import java.util.Comparator;

public class Aniaml<T>{
	T a;
	void set(T arg) {
		
		a=arg;
		try {
			T c=(T) a.getClass().newInstance();
			System.out.println(c.getClass());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Object an=(Object)new Aniaml<Cat>();
		
		Aniaml a=new Cat();
		System.out.println(an.getClass());
		System.out.println(a.getClass());
		Cc c=new Cc();
		c.set(new Aniaml());
		c.set(new A());
		
	}
}
class Cc extends Aniaml<A>{

	void set(Aniaml arg) {}
}
