package in.Example;

import java.util.HashSet;

public class ExampleHashSet {
	public static void main(String[] args) {
		Student s1=new Student(1,"raj");
		Student s2=new Student(1,"raj");
		
		System.out.println(s1==s2);//false
		System.out.println(s1.hashCode());//11
		System.out.println(s2.hashCode());//12
		System.out.println(s1.equals(s2));//false
		
		System.out.println("-----------");
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);

		System.out.println(i1==i2);//false
		System.out.println(i1.hashCode());//10
		System.out.println(i2.hashCode());//11
		System.out.println(i1.equals(i2));//true
		
	}
}
