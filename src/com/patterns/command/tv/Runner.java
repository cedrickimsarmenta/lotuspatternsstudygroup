package com.patterns.command.tv;

public class Runner {
	public static void main(String [] args) {
		Television tv = new Television(0, 23);
		tv.display();
		UniversalRemoteControl rc = new UniversalRemoteControl();
		rc.init(tv);
		rc.pindot("..--||");
		rc.pindot("..--||");
		rc.pindot("..--||");
		rc.pindot("..--||");
		tv.display();
		rc.pindot("..--||");
		rc.pindot("..--||");
		tv.display();
		
		rc.pindot("+");
		rc.pindot("+");
		rc.pindot("+");
		rc.pindot("+");
		rc.pindot("+");
		rc.pindot("+");
		rc.pindot("+");
		tv.display();
		tv.display();
		
		rc.pindot("</()");
		rc.pindot("</()");
			
		tv.display();
		
		rc.pindot("7");
		tv.display();
		rc.pindot("7");
		tv.display();
		
	}
	
}
