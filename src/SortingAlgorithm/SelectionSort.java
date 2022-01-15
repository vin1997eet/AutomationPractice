package SortingAlgorithm;
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) 
	{
	  
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int arr[]=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<x;i++)
		{
			int min=Integer.MAX_VALUE;
			int index=0;
			for(int j=i;j<x;j++)
			{
			   if(arr[j]<min)
			   {
				   min=arr[j];
				   index=j;
			   }
			}
			int temp=min;
			arr[index]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<x;i++)
		{
		 System.out.println(arr[i]);
		}
		sc.close();
	  }

}
