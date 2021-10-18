import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if( x < 10) return true;

        List<Integer> numbers = new ArrayList<>();
        while (x != 0) {
            numbers.add(x % 10);
            x /= 10;
        }
        int i = 0;
        int halfSize = numbers.size() / 2;
        while(numbers.get(i).equals(numbers.get(numbers.size() - i - 1)) && i < halfSize) {
            i++;
        }
        return i == halfSize;
    }
}
