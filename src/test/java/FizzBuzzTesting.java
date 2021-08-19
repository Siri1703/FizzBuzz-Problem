import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTesting {
    @Test
    public void toObtainFizzIfNumberIsDivisibleByThree()
    {
        FizzBuzz obj=new FizzBuzz(6);
        String expectedOutput="Fizz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void toObtainBuzzIfNumberIsDivisibleByFive()
    {
        FizzBuzz obj=new FizzBuzz(10);
        String expectedOutput="Buzz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }


}
