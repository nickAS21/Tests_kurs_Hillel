package org.word.reader;

public class IncrementSynchronizeTest2_3_2 {
    private int value = 0;
    // # 2
    public synchronized int getNextValue2() {
        return value++;
    }

}
