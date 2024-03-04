package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        var result = new HashMap<String, Integer>();
        if (sentence.isEmpty()) {
            return result;
        }
        String str = sentence.replaceAll("[.,!?]", "").toLowerCase();
        var arr = str.split(" ");
        for (var item: arr) {
            if (result.containsKey(item)) {
                result.put(item, result.get(item) + 1);
            } else {
                result.put(item, 1);
            }
        }
        return result;
    }
}
