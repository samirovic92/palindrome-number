import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void setup() {
        this.solution = new Solution();
    }

    @Test
    public void example_1() {
        // Given
        int x = 121;

        // When
        boolean response = solution.isPalindrome(x);

        // Then
        assertTrue(response);
    }

    @Test
    public void example_2() {
        // Given
        int x = -121;

        // When
        boolean response = solution.isPalindrome(x);
        // Then
        assertFalse(response);
    }

    @Test
    public void example_3() {
        // Given
        int x = 10;

        // When
        boolean response = solution.isPalindrome(x);
        // Then
        assertFalse(response);
    }

    @Test
    public void example_4() {
        // Given
        int x = 192;

        // When
        boolean response = solution.isPalindrome(x);

        // Then
        assertFalse(response);
    }

    @Test
    public void example_5() {
        // Given
        int x = 1;

        // When
        boolean response = solution.isPalindrome(x);

        // Then
        assertTrue(response);
    }

    @Test
    public void example_6() {
        // Given
        int x = 1122;

        // When
        boolean response = solution.isPalindrome(x);

        // Then
        assertFalse(response);
    }
}