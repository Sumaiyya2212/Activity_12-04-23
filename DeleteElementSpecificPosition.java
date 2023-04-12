package arrays;

import java.util.Scanner;

public class DeleteElementSpecificPosition {

	public static void main(String[] args) {
		 int arr[] = new int[20];
         Scanner sc = new Scanner(System.in);
         int s;
         System.out.println("Enter size of array upto 20 elements : ");
   	      s = sc.nextInt();
         if(s<arr.length)//check if the size is within 20 or not
         {
             System.out.println("Enter Array Elements : ");
             for(int i=0;i<s;i++)
             {
           	  arr[i]=sc.nextInt();
             }
         }
         else
         {
       	  System.out.println("Invalid Input");
         }
         System.out.println("Array Before Deleting an element : ");
         for(int i=0;i<s;i++)
         {
       	  System.out.println("arr["+i+"] = Position "+(i+1)+" : "+arr[i]);
         }
         System.out.println("Enter the Position from which you want to delete an element : ");
         int pos = sc.nextInt();
         sc.close();
         if(pos<=s && pos>0)
         {
        	 for(int i=pos-1;i<s;i++)
        	 {
        		arr[i] = arr[i+1];
        	 }
         }
         else
         {
        	 System.out.println("Invalid position");
         }
         System.out.println("Array After Deleting element : ");
         for(int i=0;i<s-1;i++)
         {
       	  System.out.println("arr["+i+"] = Position "+(i+1)+" : "+arr[i]);
         }
	}

}
