package com.DkAngelo.exercises.generics;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapToPairs {
    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src){
        Set<Map.Entry<K, V>> dst = src.entrySet();

    }
}
