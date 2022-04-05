package com.comcast.inheritance;

class Parent {
	void className() {
		System.out.println("Parent Class");
	}
}

class Alpha extends Parent {
	@Override
	void className() {
		System.out.println("Class Alpha");
	}
}

class Beta extends Parent {
	@Override
	void className() {
		System.out.println("Class Beta");
	}
}

class Charlie extends Parent {
	@Override
	void className() {
		System.out.println("Class Charlie");
	}
}

public class RuntimePoly {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.className();
		
		parent = new Alpha();
		parent.className();
		
		parent = new Beta();
		parent.className();
		
		parent = new Charlie();
		parent.className();
		
	}

}
