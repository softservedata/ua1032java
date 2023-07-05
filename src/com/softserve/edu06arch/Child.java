package com.softserve.edu06arch;

import com.softserve.edu06inh.Parent;

public class Child extends Parent {

    //@Override
    public int f() {
        System.out.println("running f() from Child");
        return 2;
    }

    public int useF2() {
        //return useF();
		return f();
    }
}
