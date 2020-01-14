package sort;

public class PaoSort {
public void pSort(int[] a) {
	
	for(int i=0;i<a.length-1;i++) {
		boolean flag=false;
		for(int j=0;j<a.length-i-1;j++) {
//			System.out.println(j);
			if(a[j]>a[j+1]) {
				int k=a[j];
				a[j]=a[j+1];
				a[j+1]=k;
				flag=true;
			}
		}
		if(!flag) {
			break;
		}
	}
	for(int aa:a) {
		System.out.println(aa);
	}
}
public static void main(String[] args) {
	int a[]= {3,2,1,6,4,11,2,4,6,2};
	PaoSort in=new PaoSort();
	in.pSort(a);
	
}
}
