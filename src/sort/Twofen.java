package sort;

public class Twofen {
public boolean find(int []a,int b) {
	int low=0;
	int hight=a.length-1;
	while(low<=hight) {
		if(a[(low+hight)/2]==b) {
			return true;
		}else if(a[(low+hight)/2]>b) {
			hight=(low+hight)/2-1;
		}else {
			low=(low+hight)/2+1;
		}
	}
	return false;
}

public static void main(String[] args) {
	Twofen aa=new Twofen();
	int[] a= {1,4,5,9,11};
	
	System.out.println(aa.find(a, 11));
}
}
