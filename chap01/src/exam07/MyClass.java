package exam07;

public class MyClass {
	
	// field
	RemoteControl rc = new Television();
	
	// constructor
	MyClass(){}
	MyClass(RemoteControl rc){
	   this.rc = rc;
	   rc.turnOn();
	   rc.setVolumn(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolumn(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolumn(5);
	}

}
