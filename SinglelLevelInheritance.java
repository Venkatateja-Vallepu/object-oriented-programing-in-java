package com.cashapona.oops.may31;
class Parent{
	String parentName="ramanaiah";
	int parentAge=40;
	double parentSalarey=2000.0;
	String parentSurName="vallepu";
	String parentAddress="bheemavaram";
	double parentTotalProparteyCost=500000.0;
	void parentInfo() {
		System.out.println(parentName);
		System.out.println(parentAge);
		System.out.println(parentSalarey);
		System.out.println(parentSurName);
		System.out.println(parentAddress);
		System.out.println(parentTotalProparteyCost);
	}
}
	class Child extends Parent{
		String childName="venkat";
		int childAge=23;
		double childSalarey=16600.0;
		void childInfo(){
			System.out.println(childName);
			System.out.println(childAge);
			System.out.println(childSalarey);
			System.out.println(parentSurName);
			System.out.println(parentAddress);
			System.out.println(parentTotalProparteyCost);
		}	
		}	

public class SinglelLevelInheritance {
public static void main(String[]args){
	Child c=new Child();
	c.childInfo();
	c.parentInfo();
}
}
