package com.cashapona.oops.may31;
class GrandParent{
	 String GrandParentName="ram";
	int GrandParentAge=85;
	double GrandParentSalarey=2000.0;
	String GrandParentSurName="vallepu";
	String GrandParentAddress="bheemavaram";
	double GrandParentTotalProparteyCost=500000.0;
void GrandParentInfo(){
	System.out.println(GrandParentName);
	System.out.println(GrandParentAge);
	System.out.println(GrandParentSalarey);
	System.out.println(GrandParentSurName);
	System.out.println(GrandParentAddress);
	System.out.println(GrandParentTotalProparteyCost);	
}
}
class Parent1 extends GrandParent{
	String parentName="ramanaiah";
	int parentAge=40;
	double parentSalarey=2000.0;
void parentInfo() {
	System.out.println(parentName);
	System.out.println(parentAge);
	System.out.println(parentSalarey);
	System.out.println(GrandParentSurName);
	System.out.println(GrandParentAddress);
	System.out.println(GrandParentTotalProparteyCost);
}
}
class Child1 extends Parent1{
	String childName="venkat";
	int childAge=23;
	double childSalarey=16600.0;
void childInfo() {
	System.out.println(childName);
	System.out.println(childAge);
	System.out.println(childSalarey);
	System.out.println(GrandParentSurName);
	System.out.println(GrandParentAddress);
	System.out.println(GrandParentTotalProparteyCost);

}	
}
public class MultilevelInheritance {
public static void main(String[]args) {
	Child1 c=new Child1();
	c.childInfo();
	c.parentInfo();
	c.GrandParentInfo();
}
}
