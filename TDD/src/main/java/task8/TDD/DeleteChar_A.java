package task8.TDD;

import java.util.Scanner;

public class DeleteChar_A {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		DeleteChar_A obj = new DeleteChar_A();
		System.out.print(obj.deleteChar(input));
		sc.close();
	}
	public String deleteChar(String input){
		StringBuffer sb=new StringBuffer();
		char a[]=input.toCharArray();
		if(a[0]!='A')
			sb.append(a[0]);
		if(a[1]!='A')
			sb.append(a[1]);
		for(int i=2;i<input.length();i++)
			sb.append(a[i]);
		return sb.toString();
	}
	

}
