import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Parallel {
    
    public static void main(String args[]) {
        long t = System.currentTimeMillis();

        List<Integer> list = Stream.iterate(1, x -> x + 1)
                                   .limit(20000)
                                   .collect(Collectors.toList());

        @SuppressWarnings("unused")
        List<Long> fact = list.parallelStream() 
                              .map(Parallel::Factorial)
                              .collect(Collectors.toList());

        long e = System.currentTimeMillis();
        System.out.println("Time taken: " + (e - t) + " ms");
    }

    private static long Factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {  
            result *= i;
        }
        return result;
    }
}
