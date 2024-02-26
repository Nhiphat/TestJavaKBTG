package Hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinCacheCapacity {
    public static void main(String argv[]) {
        List<String> A = Arrays.asList("item1", "item1","item3","item1","item3");
        int res = solution(5,A,1);
        System.out.println(res);
    }
    public static int solution(int n, List<String> A, int k) {
        int res = -1;
        int cacheHits = 0;
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int cacheHit = findCacheHitWithCacheSize(n, A, k, m+1);
            // Check if x is present at mid
            if (cacheHit == k)
                return m + 1;
 
            // If x greater, ignore left half
            if (cacheHit < k)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        
        
        return res;
    }
    public static int findCacheHitWithCacheSize(int n, List<String> A, int k, int cacheSize) {
        int cacheHit = 0;
        String[] cache = new String[cacheSize];
        boolean first = true;
        for (String a: A) {
            if (first) {
                cache[0] = a;
                first = false;
                continue;
            }
            if (cache.length == 0) {
                cache[0] = a;
            } else {
                if (Arrays.stream(cache).findAny().get().equals(a)) {
                    cacheHit++;
                } else {
                    if (cacheSize > cache.length) {
                        cache[cache.length] = a;
                    } else {
                        cache[cache.length - 1] = a;
                    }
                }
            }
        }
        return cacheHit;
    }
}
