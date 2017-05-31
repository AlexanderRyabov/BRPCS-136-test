package com.devfactory.brpcs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class1 {

    public void test1() {
        List<String> list = Stream.of("a", "b", "c").collect(Collectors.toList());
        String[] result = (String[]) list.toArray();
        System.out.println(result);
    }

    public void test2() {
        Collection<String> c = Collections.emptyList();
        System.out.println((String[]) c.toArray());
    }

    public void test3() {
        Collection<String> a = Collections.emptyList();
        Collection<String> b = Collections.emptyList();
        boolean flag = true;
        System.out.println((String[]) (flag ? a : b).toArray());
    }

    public void test4() { // valid case
        List<String> list = Stream.of("a", "b", "c").collect(Collectors.toList());
        String[] result = (String[]) list.toArray(new String[3]);
        System.out.println(result);
    }

    public void test5() {
        Collection<String> x = Collections.emptyList();
        Collection<String> y = Collections.emptyList();
        boolean flag = true;
        System.out.println((String[]) (flag ? x.toArray() : y.toArray()));
    }

    public void run() {
        test5();
    }

    public static void main(String[] args) {
        new Class1().run();
    }


}

