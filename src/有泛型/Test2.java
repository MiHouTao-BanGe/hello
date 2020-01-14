package ÓÐ·ºÐÍ;

public class Test2 extends DD{
public static void main(String[] args) {

//	D cc=new D();
//	cc.set(new Cat());
//	cc.set(new Aniaml());
//	
//	DD dd=new DD();
//	dd.set(new DD());
//	dd.set(new Test2());
	final int[] a= {1,2};
	a[0]=2;
	int c=0;
	for(int aa:a) {
		System.out.println(aa);
	}
	Thread t=new Thread(){
		@Override
		public void run() {
			// TODO Auto-generated method stub
		
		
		}
	};
}
}
