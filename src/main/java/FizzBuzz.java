import java.util.*;
public class FizzBuzz {
    int number;
    public FizzBuzz(int n) {
        this.number=n;
    }

    public String fizzbuzz() {
        String k=Integer.toString(number);
        while(true)
        {
            if(number%15==0)
                return "FizzBuzz";
            if(number%3==0)
                return  "Fizz";
            if(number%5==0)
                return "Buzz";
            if( k.contains("3") && k.contains("5"))
                return "FizzBuzz";
            if(k.contains("3"))
                return "Fizz";
            if(k.contains("5"))
                return "Buzz";

            return null;

        }
    }
}
