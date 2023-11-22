package Assignment2QA;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {3,4,2,1,5,7,8,6};
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1;j<ar.length-i;j++)
			{
				if(ar[j]<ar[j-1])
				{
					int temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
							
				}
				
			}
			
		}
		
		for(int i:ar)
		{
			System.out.print(i+" ");
		}

	}

}

