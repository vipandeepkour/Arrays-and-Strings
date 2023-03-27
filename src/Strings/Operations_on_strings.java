package Strings;
public class Operations_on_strings {
	public static void main(String[] args) {
		int result,idx;
		char ch;
		String str1=new String ("This is a basic string programme.");
		String str2="In Java,Strings are objects.";
		String str3=new String(str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1.length());
		System.out.println(str1.charAt(3));
		idx=str1.indexOf("basic");
		System.out.println("Index of basic is" + idx);
	
	if(str1.equals(str2))
		System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
	if(str2.equals(str3))
		System.out.println("Strings are equal");
	else
		System.out.println("stringa are not equal");

	result=str1.compareTo(str2);
	if(result==0)
		System.out.println("Strings are equal");
	else if(result<0)
		System.out.println("str1 is less than str2");
	else
	System.out.println("str1 is greater than str2");
	System.out.println("***************************");
	String str4[]= {"Strings","can","be","assembled","as","arrays"};
	System.out.println("Original array is ");
	for(String s:str4)
		System.out.println(s);
	
	String orgstr="Java makes the web move";
	String substr= orgstr.substring(5,18);
	System.out.println("orgstr " +orgstr);
	System.out.println("substr " +substr);
}
}
		
