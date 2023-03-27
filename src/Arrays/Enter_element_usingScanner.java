package Arrays;
import java.util.Scanner;
public class Enter_element_usingScanner {
public static void main(String[] args) {
	int a[] =new int[5];
	for(int i=0;i<a.length;i++)
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number");
		a[i]=in.nextInt();
}
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
//for(int element:a)//enhanced for loop
{
	//System.out.println(element);
}
}
}
