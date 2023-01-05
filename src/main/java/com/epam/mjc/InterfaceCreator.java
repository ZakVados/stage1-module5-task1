package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return x -> {
            for (String s: x) {
                if (!Character.isUpperCase(s.charAt(0))) return false;
            }
            return true;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return x -> {
            int xLen = x.size();
            for (int i = 0; i < xLen; i++) {
                if (x.get(i) % 2 == 0) {
                    x.add(x.get(i));
                }
            }
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            List<String> res = new ArrayList<>();
            for (String str : values) {
                if (Character.isLowerCase(str.charAt(0))) continue;
                if (str.charAt(str.length()-1) != '.') continue;
                if (str.split(" ").length <= 3) continue;
                res.add(str);

            }
            return res;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        throw new UnsupportedOperationException("You should implement this method.");
    }
}
