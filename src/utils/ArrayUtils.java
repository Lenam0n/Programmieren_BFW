package utils;

import java.util.function.IntFunction;

public class ArrayUtils {

    public static <T> T[] createArray(IntFunction<T[]> constructor, int size) {
        return constructor.apply(size);
    }
}
