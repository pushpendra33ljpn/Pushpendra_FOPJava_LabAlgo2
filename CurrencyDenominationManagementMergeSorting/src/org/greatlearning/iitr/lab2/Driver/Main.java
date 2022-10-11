package org.greatlearning.iitr.lab2.Driver;
import java.util.Scanner;

import org.greatlearning.iitr.lab2.MergeSorting.MergeSortImplementation;
import org.greatlearning.iitr.lab2.NotesCount.NotesCount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeSortImplementation obj1 = new MergeSortImplementation();
		NotesCount Count= new NotesCount();
		System.out.println(" Enter the size of currency denomination ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] notes =new int[size];
		System.out.println("Enter the currency denomination value");
		for(int i=0;i<size;i++) {
			notes[i]=sc.nextInt();
		}
		System.out.println(" Enter the amount you want to pay ");
		int amount= sc.nextInt();
		obj1.mergeSort(notes,0,notes.length-1);
		Count.notesCount(notes,amount);

	}

}


