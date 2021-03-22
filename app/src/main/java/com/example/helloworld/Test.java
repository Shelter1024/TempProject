package com.example.helloworld;

import android.util.Log;

/**
 * @author: Shelter
 * Create time: 2021/3/8, 10:16.
 */
public class Test {
    public void test() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Log.i("Shelter", "Test test() outer = " + outer + ", inner = " + inner);

    }
}
