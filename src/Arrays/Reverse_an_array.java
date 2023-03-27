package Arrays;

public class Reverse_an_array {

	public static void main(String[] args) {
		int a[]= new int[]{10,45,26,41};
		System.out.println("before reversing");
		for (int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
	}
		System.out.println("after reversing");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
}
}
