package com.main;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Run0103 {
    public static void main(String[] args){
        Set<String>set=new HashSet<String>();
        String str=new String("fly");
        set.add(str);
        String str1=new String("fly");
        set.add(str1);
        System.out.println(str==str1);
        System.out.println(str.equals(str1));
        while(true){
            System.out.println(System.currentTimeMillis());
        }
    }
}
