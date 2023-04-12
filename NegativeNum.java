package arrays;
import java.util.Scanner;
public class NegativeNum {

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
	    System.out.println("Array elements are : ");
	    for(int i=0;i<Size;i++)
	    {
	    	System.out.println("arr["+i+"] = "+arr[i]);
	    }
	    int cnt=0;
	    for(int i=0;i<Size;i++)
	    {
	    	if(arr[i]<0)
	    	{
	    	   cnt++;	
	    	   System.out.println(arr[i]+" is a Negative Number from Array at position "+(i+1));
	    	}
	    }
	    System.out.println("Total Number of Negative Numbers are : "+cnt);
	}

}
