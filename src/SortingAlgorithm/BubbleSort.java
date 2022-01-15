package SortingAlgorithm;
import java.util.Scanner;
public class BubbleSort 
{
 public static void main(String args[])
 {
	 
	 System.out.println("Enter Number of Element you want");
	 Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
	 int arr[]=new int[x];
	 for(int i=0;i<x;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 for(int i=0;i<x;i++)
	 {
		 for(int j=0;j<x-1-i;j++)
		 {
			 if(arr[j]>arr[j+1])
			 {
				 int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		 }
	 }
	 for(int item:arr)
	 {
		 System.out.println(item);
	 }
}
}
