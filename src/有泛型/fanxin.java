package �з���;

public class fanxin<T> {
		T b;
	public void pri(T t)
	{
		b=t;
		System.out.println(b instanceof Student);
	}
	public static void main(String args[])
	{
		Student a=new Student("����","��",18);
		fanxin b=new fanxin();
		b.pri(a);
//		Object d=(Object)a;
//		System.out.println(d.getClass().getName() );


	}
}
