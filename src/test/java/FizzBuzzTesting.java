import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTesting {


    @Test
    public void toObtainFizzIfNumberIsDivisibleByThree() throws IOException {
        FizzBuzz obj=new FizzBuzz(6);
        String expectedOutput="Fizz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void toObtainBuzzIfNumberIsDivisibleByFive() throws IOException {
        FizzBuzz obj=new FizzBuzz(10);
        String expectedOutput="Buzz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void toObtainFizzIfNumberContainsThree() throws IOException {
        FizzBuzz obj=new FizzBuzz(23);
        String expectedOutput="Fizz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void toObtainBuzzIfNumberContainsFive() throws IOException {
        FizzBuzz obj=new FizzBuzz(52);
        String expectedOutput="Buzz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void toObtainBuzzIfNumberIsDivisibleByFifteen() throws IOException {
        FizzBuzz obj=new FizzBuzz(30);
        String expectedOutput="FizzBuzz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void toObtainFizzBuzzIfNumberContainsBothThreeAndFive() throws IOException {
        FizzBuzz obj=new FizzBuzz(53);
        String expectedOutput="FizzBuzz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }

   @Test
    public void toCheckNumberInRange()
    {
        FizzBuzz obj=new FizzBuzz(300);
        Exception exception=assertThrows(IOException.class, obj::fizzbuzz);
        assertEquals(exception.getMessage(),"Number not in range");
    }

    @Test
    public void toObtainNumberWhichIsNotFizzBuzzNumber() throws IOException
    {
        FizzBuzz obj=new FizzBuzz(91);
        String exceptedOutput="91";
        String actualOutput= obj.fizzbuzz();
        assertEquals(exceptedOutput,actualOutput);
    }


}
