package org.word.reader;

import java.util.Collection;

import static java.util.Arrays.*;

/**
 * 2. Write a generic method that takes an array of objects and a collection,
 * and puts all objects in the array into the collection.
 */

public class AddArrayIntoCollectionTest2_2 {

    public <T> void addArrayIntoCollection(T[] array, Collection<T> collection) {
        collection.addAll(asList(array));
    }
}
