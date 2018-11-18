package lesson8.task4;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumOfUsingForkJoin {
    static int [] N = getArray();
    private static final int NUM_THREADS = 2;

    static class RecSumOfN extends RecursiveTask<Long> {
        int from, to;

        public RecSumOfN(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if ((to - from) <= N.length / NUM_THREADS) {
                long localSum = 0;
                for (int i = from; i <= to; i++) {
                    localSum += N[i];
                }
                return localSum;
            } else {
                int mid = (from + to) / 2;
                RecSumOfN firstHalf = new RecSumOfN(from, mid);
                firstHalf.fork();
                RecSumOfN secondHalf = new RecSumOfN(mid + 1, to);
                long resultSecond = secondHalf.compute();
                return firstHalf.join() + resultSecond;
            }
        }
    }

    public static int [] getArray() {
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
        long computedSum = pool.invoke(new RecSumOfN(0, N.length-1));
        //long formulaSum = (N*(N+1))/2;
        System.out.println();
        System.out.println(computedSum);
    }

}
