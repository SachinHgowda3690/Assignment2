
public class launch {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40};
		
		for(int el:a)
		{
			System.out.println(el);
		}
		
		String s1="sachin";
		int count=s1.toUpperCase().length();
		
		System.out.println("the length of the string is :: "+count);
		
		StringBuffer sb=new StringBuffer("kohli");
		int length=sb.append("indrcb").reverse().length();
		System.out.println(length);

	}

}
