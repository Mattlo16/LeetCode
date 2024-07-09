import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        //Beats 100%
        List<String> array = new ArrayList<>();
        for (int i = 1; i <= n; i++)
        {
            if (i % 3 == 0)
            {
                if (i % 5 == 0)
                {
                    array.add("FizzBuzz");
                }
                else
                {
                    array.add("Fizz");
                }
            }
            else if (i % 5 == 0)
            {
                array.add("Buzz");
            }
            else
            {
                array.add("" + i);
            }
        }
        return array;
    }
}
