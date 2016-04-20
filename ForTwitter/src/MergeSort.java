
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,55,1,2,9,88,66,11};
		int op[] = mergeSort(0,arr.length-1, arr);
		for(int i:op){
			System.out.print(" " + i);
		}
	}

	private static int[] mergeSort(int low, int high,int []arr) {
		int op[] ={};
		if(low<high){
			int mid = low + (high-low)/2;
			mergeSort(low, mid,arr);
			mergeSort(mid+1, high,arr);
			op= merge(low,mid,high,arr);
		}
		return op;
		
	}

	private static int[] merge(int low, int mid, int high, int []arr) {

		int [] tmp = new int[arr.length];
		for (int i = low; i <= high; i++) {
            tmp[i] = arr[i];
        }
		
		int i=low;
		int j=mid+1;
		int k=low;
		
		while(i<=mid  && j<=high){
			if(tmp[i]<=tmp[j]){
				arr[k] = tmp[i];
				i++;
			}
			else{
				arr[k] = tmp[j];
				j++;
			}
			k++;
		}
		while(i<=mid){
			arr[k] = tmp[i];
			k++;
			i++;
		}
		return arr;
	}

}
