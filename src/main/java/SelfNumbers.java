import java.util.ArrayList;
import java.util.List;

/**
 Created by Роман Лотоцький on 09.03.2017.
 In 1949 the Indian mathematician D.R. Kaprekar discovered a class of numbers called self-numbers.
For any positive integer n, define d(n) to be n plus the sum of the digits of n.
For example, d(75) = 75 + 7 + 5 = 87.
The number n is called a generator of d(n).
Some numbers have more than one generator: for example, 101 has two generators, 91 and 100.
A number with no generators is a self-number.
There are thirteen self-numbers less than 100: 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, and 97.
- Write a program to sum of all self-numbers which are bigger than 0 and smaller than 5000.
*/

public class SelfNumbers {

    public List<Integer> resultingArray;
    int sum;

    public SelfNumbers(){
        resultingArray = new ArrayList<Integer>();
    }

    public int findSelfNumbers(int number) {
        String strNumber = Integer.toString(number);
        int addedNumbers = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            addedNumbers += Character.getNumericValue(strNumber.charAt(i));
        }
        return addedNumbers + number;
    }

    public void generateConclusiveListSelfNumbers(){
        for(int i = 0; i < 5000; i++){
            resultingArray.add(findSelfNumbers(i));
        }
        int max = findBiggestNumbers(resultingArray);
        for(int i = 0; i < max; i++) {
            if (!resultingArray.contains(i)) {
                sum += i;
            }
        }
    }

    public int findBiggestNumbers(List<Integer> list){
        int max = 0;
        for (int n: list) {
            if(max <= n){
                max = n;
            }
        }
        return max;
    }
}