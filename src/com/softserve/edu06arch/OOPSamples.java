package com.softserve.edu06arch;

public class OOPSamples {
	public static void main(String... args) {
		//Parent child = new Child();
		Child child = new Child();
		System.out.println("child.useF(): " + child.useF());
		System.out.println("child.useF2(): " + child.useF2());
		System.out.println("child.f(): " + child.f());
	}
}
