package arrays;
import java.util.Scanner;
public class DuplicateNum {

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of an Array : ");
            int s = sc.nextInt();
            int array[] = new int[s];
            System.out.println("Enter "+s+" Size of Array : ");
            for(int i=0;i<s;i++)
            {
            	array[i] = sc.nextInt();
            }
            System.out.println("Elements of Array : ");
            for(int i=0;i<s;i++)
            {
            	System.out.println(array[i]);
            }
            int cnt=0;
            for(int i=0;i<s;i++)
            {
            	for(int j=i+1;j<s;j++)
            	{
            		if(array[i]==array[j])
            		{
            			cnt++;
            			System.out.println(cnt+" Duplicate element is :"+array[i]);
            			break;
            		}
            	}
            }
            System.out.println("Total Number of Duplicate Elements : "+cnt);
	}

}
