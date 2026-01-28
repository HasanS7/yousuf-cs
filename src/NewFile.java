import java.util.ArrayList;
import java.util.Arrays;

public class NewFile {
    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','A','A','A','A','A'},
                                      {'A','A','A','A','A','A'},
                                      {'A','A','A','A','A','A'},
                                      {'A','A','A','A','A','A'},
                                      {'A','A','A','A','A','A'},
                                      {'A','A','A','A','A','A'}};
        String word = "AAAAAAAAAAAAAA";
        Solution mySolution = new Solution();
        System.out.println(mySolution.exist(board,word));
    }

    public static void greet(String word1, String word2){
        System.out.println("Hello there, Mr. " + word1 + ". You are better than " + word2);
    }

    public static void addFive(int number){
        System.out.println(number + 5);
    }

    public static int multiplyBy2(int value) {
        int result = value * 2;
        return value;
    }
}
