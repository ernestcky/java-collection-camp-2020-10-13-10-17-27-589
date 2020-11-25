package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list
                = this.array.stream()
                .filter(item -> item % 2 == 0).collect(Collectors.toList());
        return list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list
                = this.array.stream()
                .filter(item -> item % 3 == 0).collect(Collectors.toList());
        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> list = firstList.stream()
                .filter(item -> secondList.contains(item)).collect(Collectors.toList());
        return list;
    }
}
