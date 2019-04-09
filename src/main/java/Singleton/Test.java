package Singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public Test(String s){
        System.out.println(1);
    }
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final CyclicBarrier condition = new CyclicBarrier(100);
        Set<String> set= Collections.synchronizedSet(new HashSet<String>());
        for (int i =0; i < 100; i++){
            executorService.submit(() -> {

                try {
                    condition.await();
                    UnsafeSingleton unsafeSingleton = UnsafeSingleton.getUnsafeSingleton();
                    set.add(unsafeSingleton.toString());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }

            });


        }

        Thread.sleep(100);
        for (String s : set)
            System.out.println(s);
        executorService.shutdown();
    }
}
