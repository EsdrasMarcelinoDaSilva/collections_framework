package com.utils.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFirst {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("morango", "maçã", "pera"));
        list.addAll(Arrays.asList("laranja", "uva", "abacate", "limão"));
        list.remove(2);
        System.out.println(list.contains("pera"));
        list.set(4, "mamão");
        System.out.println(list.getFirst());
        System.out.println(list);
        System.out.println(list.size());
    }
}
