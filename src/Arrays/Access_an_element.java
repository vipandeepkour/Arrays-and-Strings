package Arrays;

public class Access_an_element {

	public static void main(String[] args) {
		int a[]=new int[3];
		a[0]=2;
		a[1]=3;
		a[2]=5;
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Element at index 2 is" +a[2]);
		}
}
}
