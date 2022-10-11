package com.greatlearning.iitr.lab.driver;
import java.util.Scanner;
import com.greatlearning.iitr.lab2.BubbleSorting.*;
import org.greatlearning.iitr.lab.services.count.*;
public class Main {

	public static void main(String[] args) {
		BubbleSortImplementation obj1= new BubbleSortImplementation();
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
		obj1.bubblesort(notes);
		Count.notesCount(notes,amount);


	}

}
