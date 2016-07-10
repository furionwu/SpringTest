package com.smart.test;

import java.util.Calendar;

/**
 * Created by sony on 2016/7/10.
 */
public class LazyTest {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        cal.set(2003,7,31);
        cal.set(Calendar.MONTH,8);
        System.out.println(cal.getTime());
        cal.set(Calendar.DATE,5);
        System.out.println(cal.getTime());

    }
}
