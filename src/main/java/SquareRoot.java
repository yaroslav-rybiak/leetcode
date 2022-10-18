/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.
 */

public class SquareRoot {
    public static int mySqrt(int x) {
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            if(i*i == x) return i;
            else if(i*i > x) return i-1;
        }
        return 46340;
    }
}
