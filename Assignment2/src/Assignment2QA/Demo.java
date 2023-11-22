package Assignment2QA;

public class Demo {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,7,8,9};
		int b[]= {1,3,5,7};
		int x=a.length;
		int y=b.length;
		int temp=0;
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				if(a[i]==b[j])
				{
				temp++;
				break;
				}
			}
		}
		
		if(y==temp)
		{
			System.out.println("b is subset of a");
		}
		else
		
			{
				System.out.println("b is not subset of a");
			}
		}

	}


