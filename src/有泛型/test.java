package 有泛型;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a=new Student("张三","男",18);
		Student b=new Student("李四","男",5);
		Student c=new Student("王五","男",13); 
		Student d=new Student("赵六","男",2);
		Student e=new Student("赵六","男",2);
		
//		Student arr[]= {a,b,c,d};
//		System.out.println(Arrays.deepToString(arr));
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.deepToString(arr));
		
		
		HashSet<Student> ha=new HashSet<>();
		LinkedList<Student> l=new LinkedList<>();
		l.add(a);
		ha.add(a);
		ha.add(a);
		ha.add(b);
		ha.add(c);
		ha.add(d);
		ha.add(e);
		ha.add(e);
		System.out.println(ha.size());
//		System.out.println(ha);
//		System.out.println(d.hashCode());
//		System.out.println(e.hashCode());
//		System.out.println(l.get(0));
//		Student stu=l.get(0);
//		stu.age=19;
//		
//		System.out.println(d.equals(e));
//		System.out.println(1/0.0);
//		
//		String sq="123com";
//		sq=sq+sq.substring(sq.lastIndexOf('.'));
//		System.out.println(sq);
//		
//		List<? super Cat> li=new ArrayList<Cat>();
//		li.add(new Cat());
//		li.add(new WhiteCat());
//		Cat ca=(Cat) li.get(0);
//		
//		List<? extends Aniaml> li2=new ArrayList<Cat>();
//		
//		List<Aniaml> li3=new ArrayList<Aniaml>();
//		li3.add(new Cat());
//		Aniaml cat2=li3.get(0);
		
	}
	


}
class WhiteCat extends Cat {}
