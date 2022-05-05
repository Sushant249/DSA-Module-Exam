import java.util.*;
class Question1
{
	static void insertionSort(int a[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int k=a[i];
			int j=i-1;
			while(j>=0 && a[j]>k)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
	}
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
		insertionSort(a1,n);
		display(a1);
		
	}
}