package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Insert_Delete_anElement {
	public static void main(String[] args) {
		int[]a= {25,10,11,12,13,14};
		int index=2;
		int value=89;
		System.out.println("Before insertion" +Array.toString (a));
		for(int i=a.length-1;i>index;i--)
		{a[i]=a[i-1];
	
	}
		a[index]=value;
		System.out.println("After insertion" +Array.toString(a));
}
}
