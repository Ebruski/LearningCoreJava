package com.ebruski.java9.immutablecollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        List<String> list = List.of("abc", "xyz", "123");
        Set<String> set = Set.of("abc", "xyz");
        Map.of(1, "a", 2, "b");

    }

}
