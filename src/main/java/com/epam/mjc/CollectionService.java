package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
       return list.stream( ).filter(x ->{ return x%2==0; }).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(x -> {return  x.toUpperCase(); }).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max((x,y)->x.compareTo(y));
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
       return list.stream().flatMap(l1->l1.stream()).min(Integer::compare);
    }

    public Integer sum(List<Integer> list) {
       return list.stream().reduce(0,(x,y)->x+y);
    }
}
