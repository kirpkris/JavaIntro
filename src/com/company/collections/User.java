package com.company.collections;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    private int age;
    private String name;


    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static List<User> showIntersections(List<User> a, List<User> b) {
        List<User> newList = new ArrayList<>();
        for(User el: a) {
            for (User el2: b)
                if(el.equals(el2)) {
                    newList.add(el);
                }
        }
        return newList;
    }

    public static Set<User> showIntersections(Set<User> a, Set<User> b) {
        Set<User> newSet = new HashSet<>();
        for(User el: a) {
            for (User el2: b)
                if(el.equals(el2)) {
                    newSet.add(el);
                }
        }
        return newSet;
    }

}
