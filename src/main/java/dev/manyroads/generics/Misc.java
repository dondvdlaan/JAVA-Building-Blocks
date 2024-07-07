package dev.manyroads.generics;

import java.util.Collection;
import java.util.function.Supplier;

public class Misc {

    /**
     * Method with self defined types, SOURCE and DEST from the on-set
     * @param sourceCollection
     * @param collectionFactory
     * @return
     * @param <T>
     * @param <SOURCE>
     * @param <DEST>
     */
    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
    DEST transferElements(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }
}
