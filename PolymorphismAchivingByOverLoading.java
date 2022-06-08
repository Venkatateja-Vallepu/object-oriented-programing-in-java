package com.cashapona.oops.jun1;
class Teja
{
	public void arthmaticOperrations(int a,int b,int c){
		System.out.println(a+b+c);
		}
	public void arthmaticOperrations(String a,String b){
		System.out.println(a+b);
	}
	public void arthmaticOperrations (int a,int b){
	System.out.println(a+b);
	}
	public void arthmaticOperrations(int a,int b,int c,int d,int e) {
		System.out.println(a+b+c+d+e);
	}
	public void arthmaticOperrations(float a,float b) {
		System.out.println(a+b);
	}
	
}
public class PolymorphismAchivingByOverLoading {
	public static void main (String[]args) {
Teja t=new Teja();
t.arthmaticOperrations(19,29,67);
t.arthmaticOperrations("teja","ram");
t.arthmaticOperrations(12,36);
t.arthmaticOperrations(12,34,56,67,54);
t.arthmaticOperrations(2.4f,43.5f);
}
}

