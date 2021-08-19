import java.util.*;
public class FizzBuzz {
    int number;
    public FizzBuzz(int n) {
        this.number=n;
    }

    public String fizzbuzz() {
        while(true)
        {
            if(number%3==0)
                return  "Fizz";
            if(number%5==0)
                return "Buzz";

        }
    }
}
