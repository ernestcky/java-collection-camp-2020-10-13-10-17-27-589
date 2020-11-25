package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> list = this.array.stream()
                .map(item -> item * 3).collect(Collectors.toList());
        return list;
    }

    public List<String> mapLetter() {
        List<String> list = this.array.stream()
                .map(item -> letters[this.array.indexOf(item)]).collect(Collectors.toList());
        return list;
    }

    public List<Integer> sortFromBig() {
        List<Integer> list = this.array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return list;
    }
}
