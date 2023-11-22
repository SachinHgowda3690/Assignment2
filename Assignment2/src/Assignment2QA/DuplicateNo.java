package Assignment2QA;

public class DuplicateNo {

	public static void main(String[] args) {


		int ar[]= {1,2,3,4,2,5,8,8,3};
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[j]+" ");
				}
			}
		}

	}

}
