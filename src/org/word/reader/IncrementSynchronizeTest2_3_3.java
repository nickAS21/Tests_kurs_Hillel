package org.word.reader;

public class IncrementSynchronizeTest2_3_3 {
    private int value = 0;
    //#3
    private final Object lock = new Object();
    public int getNextValue3() {
        synchronized (lock) {
            return value++;
        }
    }
}
