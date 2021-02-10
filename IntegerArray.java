package task1;

import java.util.Scanner;

public class IntegerArray
{
	public static void main(String[] args)
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter array size");
		int[] arr=new int[d.nextInt()];
		System.out.println("Enter the age");
		int AdultCount=0;
		int ChildCount=0;
		int SCCount=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=d.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<18)
			{
				ChildCount++;
			}
			else if(arr[i]>=18 && arr[i]<=54)
			{
				AdultCount++;
			}
			else 
			{
				SCCount++;
			}
		}
		System.out.println("Children "+ChildCount);
		System.out.println("Adult "+AdultCount);
		System.out.println("Senior Citizen "+SCCount);
	}

}
