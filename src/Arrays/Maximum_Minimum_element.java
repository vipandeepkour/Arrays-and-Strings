package Arrays;
public class Maximum_Minimum_element {
	public static void main(String[] args) {
		int a[]=new int[5];
		int max,min;
		a[0]=5;
		a[1]=8;
		a[2]=9;
		a[3]=1;
		a[4]=7;
		for (int i=0;i<a.length;i++)
		{
			System.out.println(+a[i] + "");
		}
		min=max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) max=a[i];
			if(a[i]<min) max=a[i];
		}
		System.out.println("Maximum value" + max );
		System.out.println("Minimum value" + min );
		
	}

}
