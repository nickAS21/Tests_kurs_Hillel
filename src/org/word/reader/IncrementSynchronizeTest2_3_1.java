package org.word.reader;

import java.util.concurrent.atomic.AtomicInteger;

/**
 ** 3. Given the following class;
 *  * public class IncrementSynchronize {
 *  * private int value = 0;
 *  * //getNextValue()
 *  * }
 *  * Write three different method options for getNextValue()
 *  * that will return 'value++', each method needs to be synchronized in a different way.
 */

public class IncrementSynchronizeTest2_3_1 {
    private int value = 0;
    // # 1
    private AtomicInteger valueInc = new AtomicInteger(value);
    public int getNextValue1() {
        return valueInc.getAndIncrement();
    }
 }
