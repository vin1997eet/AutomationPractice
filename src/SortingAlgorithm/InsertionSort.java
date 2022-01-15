package SortingAlgorithm;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<len;i++)
		{
			for(int j=i;j>=1;j--)
			{
				int Temp=arr[j];
				if(arr[j]<arr[j-1])
				{
				 arr[j]=arr[j-1];
				}
			}
		}
	}

}
