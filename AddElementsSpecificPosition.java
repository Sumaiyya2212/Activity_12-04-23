package arrays;
import java.util.Scanner;
public class AddElementsSpecificPosition {

	public static void main(String[] args) {
          int arr[] = new int[20];
          Scanner sc = new Scanner(System.in);
          int s;
          System.out.println("Enter size of array upto 20 elements : ");
    	  s = sc.nextInt();
          if(s<arr.length)
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
          System.out.println("Array Before Insertion : ");
          for(int i=0;i<s;i++)
          {
        	  System.out.println("arr["+i+"] = "+arr[i]);
          }
          System.out.println("Enter Elements that you want to Insert in Array : ");
          int num = sc.nextInt();
          System.out.println("Enter the Position at which you want to insert : ");
          int pos = sc.nextInt();
          sc.close();
          if(pos<s+1 && pos>0)
          {
        	  //Making room for new element : Shifting
        	  for(int i=s;i>=pos;i--)
              {
            	  arr[i] = arr[i-1];
              }
        	  //inserting new element at given Position
              arr[pos-1]=num;
          }
          else
               System.out.println("Invalid Input");
          System.out.println("Array after Insertion : ");
          for(int i=0;i<=s;i++)
          {
        	  System.out.println("arr["+i+"] = "+arr[i]);
          }   
          

	}

}
