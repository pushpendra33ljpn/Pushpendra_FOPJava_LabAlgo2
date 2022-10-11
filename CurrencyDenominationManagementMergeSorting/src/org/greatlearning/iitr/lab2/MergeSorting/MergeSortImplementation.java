package org.greatlearning.iitr.lab2.MergeSorting;

public class MergeSortImplementation {
	void merge(int arr[],int left,int mid,int right){
		int l1=mid-left+1;
		int l2=right-mid;
		int leftArr[]=new int[l1];
		int rightArr[]=new int[l2];
		for(int i=0;i<l1;i++) {
			leftArr[i]=arr[left+i];
		}
		for(int j=0;j<l2;j++) {
			rightArr[j]=arr[mid+1+j];
		}
		int i,j,k;
		i=0;
		j=0;
		k=left;
		while(i<l1 && j<l2) {
			if(leftArr[i]>rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}
			else {
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<l1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<l2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	public void mergeSort(int arr[],int left, int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
}
