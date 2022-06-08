package com.cashapona.oops.may30;
abstract class Parts{
	abstract void car();
	abstract void bike();
}
class StartButton extends Parts{
  void car(){
	    System.out.println("press the startbutton car start");
 }
  void bike(){
	System.out.println("press the startbutton bike  start");  
  }
}
class Break extends Parts{
	void car(){
		System.out.println("press the break car will stop");	
	}
	void bike(){
		System.out.println("press the break car will stop");
}
}
class Accelerator extends Parts{
	void car(){
		System.out.println("press the accelerator car speed will be increase");
	}
	void bike(){
		System.out.println("press the accelerator bike speed will be increase");
	}

}
class Gear extends Parts{
	void car(){
		System.out.println("press the gear car gear will be change");
	}
	void bike(){
		System.out.println("press the gear bike gear eill be change");
	}	
}
class Clutch extends Parts{
	void car(){
	    System.out.println("press the clutch car will be nutaled");	
	}
	void bike(){
	    System.out.println("press the clutch bike will be nutaled");	
    }
}     
class Horn extends Parts{
	void car(){
		System.out.println("press the horn strat the horn sound");
	}
	void bike(){
		System.out.println("press the horn strat the horn sound");
	}
}
class Indicator extends Parts{
	void car(){
		System.out.println("press the indicator button turn on the indicator lights");
	}
	void bike(){
		System.out.println("press the indicator button turn on the indicator lights");
	}	
}
class WiperSwitch extends Parts{
	void car()
	{
		System.out.println("press the Wiper switch move the Wiper and clean the car glass");
	}
	void bike(){
		System.out.println("bike does't have a wiper");
	}
}
class HandBreak extends Parts{
	void car(){
		System.out.println("we can use handbreak it will stop to moving  the car four weels ata time  ");
	}
	void bike(){
		System.out.println("bike does't have hand braeak");
}
}
class BackGear extends Parts{
	void car(){
		System.out.println("use BackGear car will move back");
	}
	void bike(){
		System.out.println("bike does't have BackGear");	
	}
}
class Steering extends Parts{
	void car(){
		System.out.println("use the streeing to changing the car direction");
	}
	void bike(){
		System.out.println("bike does't streeing");	
	}
}

public  class AbstractionAchiveByUsingAbstractclass{
	public static void main(String[]args)
	{
	 StartButton s= new StartButton();
	 s.car();
	 Break b=new Break();
	 b.car();
	 Accelerator a=new Accelerator();
	 a.car();
	 Gear g= new Gear();
	 g.car();
	 Clutch c =new Clutch();
	 c.car();
	 Horn h=new Horn();
	 h.car();
	 Indicator i=new Indicator();
	 i.car();
	 WiperSwitch w=new WiperSwitch();
	 w.car();
	 HandBreak h1=new HandBreak();
	 h1.car();
	 BackGear b1=new BackGear();
	 b1.car();
	 Steering s1=new Steering();
	 s1.car();
	 StartButton s2= new StartButton();
	 s2.bike();
	 Break b3=new Break();
	 b3.bike();
	 Accelerator a1=new Accelerator();
	 a1.bike();
	 Gear g1=new Gear();
	 g1.bike();
	 Clutch c1 =new Clutch();
	 c1.bike();
	 Horn h2=new Horn();
	 h2.bike();
	 Indicator i1=new Indicator();
	 i1.bike();
	 WiperSwitch w1=new WiperSwitch();
	 w1.bike();
	 HandBreak h3=new HandBreak();
	 h3.bike();
     BackGear b2=new BackGear();
	 b2.bike();
	 Steering s3=new Steering();
	 s3.bike();
	}
}