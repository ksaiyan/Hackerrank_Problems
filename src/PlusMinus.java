import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos=0;
        int neg=0;
        int zero=0;
        int len = arr.size();

        for (int i=0;i<arr.size();i++){
            if(arr.get(i) < 0)
                neg++;
            else if(arr.get(i) == 0){
                zero++;
            }
            else
                pos++;
        }
        //ArrayList prop = new ArrayList(3);

        float one = (float)pos/len;
        float two = (float)neg/len;
        float three = (float)zero/len;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);



    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
