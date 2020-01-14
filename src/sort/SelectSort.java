package sort;

public class SelectSort {
public void seSort(int a[]) {
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[i]) {
				int k=a[j];
				a[j]=a[i];
				a[i]=k;
			}
		}
	}
	for(int aa:a) {
		System.out.println(aa);
	}
}
public static void main(String[] args) {
	int a[]= {3,2,1};
	SelectSort in=new SelectSort();
	in.seSort(a);
}
}
