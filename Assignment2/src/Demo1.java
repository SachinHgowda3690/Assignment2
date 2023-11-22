//WAP to find the duplicates present in an array.
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
				
			}
		}

	}

}
