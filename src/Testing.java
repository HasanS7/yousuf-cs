import java.lang.reflect.Array;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args){
        while(1==1) {
            Scanner s = new Scanner(System.in);
            String J = s.nextLine();
            int y = countVowels(J);
            System.out.println(y);
        }
    }
    public static boolean isPrime(int num){
        for(int i = num - 1; i > 1; i--){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int countVowels(String word){
        int count = 0;
        char[] vowels = {'a','e','i','o','u'};
        for(int i = 0; i < word.length(); i++){
            for(int x = 0; x < vowels.length; x++){
                if(word.charAt(i) == (vowels[x])){
                    count = count + 1;
                }
            }
        }
        return count;
    }


    public static double arrayAverage(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        double mean = sum/arr.length;
        return mean;
    }
    public static int Convert(int f){
        return ((f - 32) * 5/9);
    }
    public static String EvenOrOdd(int i){
        if(i % 2 != 0){
            return "odd";
        }
        else return "even";
    }

    public static boolean isPalindrome(String word){
        if(word.equals(reverse(word))){
            return true;
        }
        else return false;
    }
    public static String reverse(String word){
        String L = "";
        for(int i = word.length() - 1; i >= 0; i--){
            L = L + word.charAt(i);
        }
        return L;
    }
}
