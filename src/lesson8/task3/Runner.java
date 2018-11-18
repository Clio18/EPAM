package lesson8.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Runner {
    Map<Integer, Integer> map;
    final int COUNT = 1000;

    public void run() {
        testHashMap();
        testConcurrentMap();
    }

    public void testHashMap() {
        map = new HashMap<>();
        Thread[] threadWrite = new Thread[COUNT];
        Thread[] threadRead = new Thread[COUNT];
        for (int i = 0; i < COUNT; i++) {
            int a = i;
            threadWrite[i] = new Thread(() -> {
               // synchronized (this.map) {
                    map.put(a, a);
                //}
            });
            threadRead[i] = new Thread(() -> {
                //synchronized (this.map) {
                   map.get(a);
                //}
            });
        }
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            threadWrite[i].start();
            threadRead[i].start();
        }
        for (int i = 0; i < COUNT; i++) {
            try {
                threadWrite[i].join();
                threadRead[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        long end = System.nanoTime();
        System.out.println("Time HashMap: " + (end - start) / 1000000000.0);
    }

    public void testConcurrentMap() {
        map = new ConcurrentHashMap<>();
        Thread[] threadWrite = new Thread[COUNT];
        Thread[] threadRead = new Thread[COUNT];
        for (int i = 0; i < COUNT; i++) {
            int a = i;
            threadWrite[i] = new Thread(() -> {
                map.put(a, a);
            });
            threadRead[i] = new Thread(() -> {
                map.get(a);
            });
        }
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            threadWrite[i].start();
            threadRead[i].start();
        }
        for (int i = 0; i < COUNT; i++) {
            try {
                threadWrite[i].join();
                threadRead[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        long end = System.nanoTime();
        System.out.println("Time Concurent: " + (end - start) / 1000000000.0);
    }
}
