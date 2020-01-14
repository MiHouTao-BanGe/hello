package sort;

public class QuickSort {
public int quSort(int a[],int low,int hight) {
	int k=a[low];
	while(low<hight) {
		while(a[hight]>=k&&low<hight)
			hight--;
			a[low]=a[hight];
		while(a[low]<=k&&low<hight)
			low++;
		a[hight]=a[low];
	}
	a[low]=k;
	return low;
}

public void qu(int a[],int low,int hight) {
	int i;
	if(low<hight) {
		i=quSort(a,low,hight);
		qu(a,low,i-1);
		qu(a,i+1,hight);
	}
	
}
public static void main(String[] args) {
	int a[]= {3,2,1,8,11,6,2,3};
	QuickSort in=new QuickSort();
	in.qu(a, 0, 7);
	for(int aa:a) {
		System.out.println(aa);
	}
}
}
