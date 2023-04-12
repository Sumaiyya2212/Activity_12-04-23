package arrays;
import java.util.Scanner;
public class MinMaxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int Size = sc.nextInt();//taking Size of an array
		int arr[] = new int[Size];
		System.out.println("Enter "+Size+" elements of an Array");
	    for(int i=0;i<Size;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    sc.close();
	    for(int i=0;i<Size;i++)
	    {
	    	System.out.println("arr["+i+"] = "+arr[i]);
	    }
	    int max = arr[0];
	    int min = arr[0];
	    
	    for(int i=0;i<Size;i++)
	    {
	    	if(arr[i]>max)
	    		max=arr[i];
	    	else if(arr[i]<min)
	    		min=arr[i];
	    }
	    System.out.println("Maximum Number in an Array is : "+max);
	    System.out.println("Minimun Number in an Array is : "+min);
	    
	}
	

}
