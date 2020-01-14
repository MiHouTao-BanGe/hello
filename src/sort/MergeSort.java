package sort;

import java.util.Arrays;

public class MergeSort {
public int[] merge(int[] left,int[] right) {
	int cen[]=new int[left.length+right.length];
	
	for(int i=0,j=0,k=0;i<cen.length;i++) {
		if(j>=left.length) {
			
			cen[i]=right[k++];
			
		}else if(k>=right.length) {
			
			cen[i]=left[j++];
			
		}else if(left[j]<=right[k]) {
			cen[i]=left[j++];
			
		}else{
			cen[i]=right[k++];
			
		}
	}
	return cen;
}

public int[] meSort(int []a) {
	if(a.length<2)
		return a;
	int mid=a.length/2;
	int[] left=Arrays.copyOfRange(a, 0, mid);
	int[] right=Arrays.copyOfRange(a, mid, a.length);
	return merge(meSort(left),meSort(right));
}
public static void main(String[] args) {
	int a[]= {5,3,6,4,8,99,11,2,3,6};
	MergeSort in=new MergeSort();
	int[] c=in.meSort(a);
	for(int aa:c) {
		System.out.println(aa);
	}
}
}
