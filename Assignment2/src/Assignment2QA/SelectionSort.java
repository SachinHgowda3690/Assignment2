package Assignment2QA;

public class SelectionSort {

	public static void main(String[] args) {
int min,temp=0;

		int a[]= {38,52,9,18,6,62,13};
		
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
				 
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		
		
		
		for(int el:a)
		{
			System.out.print(el+" ");
		}
			
	}

}
