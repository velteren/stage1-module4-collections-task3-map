package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        var result = new HashMap<String, Integer>();
        for (var item: sourceMap.entrySet()) {
            if (!result.containsKey(item.getValue())) {
                result.put(item.getValue(), item.getKey());
            } else {
                if (item.getKey() < result.get(item.getValue())) {
                    result.put(item.getValue(), item.getKey());
                }
            }
        }
        return result;
    }
}
