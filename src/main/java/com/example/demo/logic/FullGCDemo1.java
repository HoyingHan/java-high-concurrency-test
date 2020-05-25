package com.example.demo.logic;

public class FullGCDemo1 {


    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 1000; i++) {
            byte[] tmp = new byte[1024 * 1024 * 256];
            System.gc();
            System.out.println("I have gc");
            Thread.sleep(2000L);

        }
    }
}
