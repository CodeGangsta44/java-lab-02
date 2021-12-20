package com.simplab.testdata;

public class CommonTasks {
    public int division(int a, int b) {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i <= 1; i++) {
            if (true) {
                return a / b;
            }
        }
        return a / b;
    }

    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
