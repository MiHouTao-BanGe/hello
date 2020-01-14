package sort;



public class InserSort {
public void inSort(int[] a) {
	for(int i=1;i<a.length;i++) {
		int k=a[i];
		int j=i-1;
		while(j>=0&&k<a[j]) {
			a[j+1]=a[j];
			j--;
			
		}
		a[j+1]=k;
	}
	for(int aa:a) {
		System.out.println(aa);
	}
}
public static void main(String[] args) {
	int a[]= {3,2,1};
	InserSort in=new InserSort();
	in.inSort(a);
}
}
