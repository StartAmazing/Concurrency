package com.ll.concurrency.example.atomic;

import com.ll.concurrency.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.LongAdder;

@Slf4j
@ThreadSafe
public class AtomicExample4 {

   private static AtomicReference<Integer> count = new AtomicReference<>(0);

    public static void main(String[] args) {
        //是expect的时候更新成update
        count.compareAndSet(0,2);       //2
        count.compareAndSet(0,1);       //不执行
        count.compareAndSet(1,3);       //不执行
        count.compareAndSet(2,4);       //4
        count.compareAndSet(3,5);       //不执行

        log.info("count:{}",count.get());

    }

}
