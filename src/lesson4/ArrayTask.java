package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {
    Scanner sc = new Scanner(System.in);
    private String[] word1;
    private String[] word2;

    public void getWord() {
        word1 = sc.nextLine().split(" ");
//        System.out.println("Enter the second word array: ");
        word2 = sc.nextLine().split(" ");
        System.out.print("1st -> " + Arrays.toString(word1) + "\t");
        System.out.println("2nd -> " + Arrays.toString(word2));
    }

    public String complyWord(String[] word) {
        StringBuilder compliedWord = new StringBuilder();
        for (String s : word) {
            compliedWord.append(s);
        }
        return compliedWord.toString();
    }

    public void launch() {
        System.out.println("Enter two strings to compare (use space to split the string):");
//        System.out.println("Enter the first word array: ");  doesn't work after first loop, how to improve?
        while (!sc.hasNext("exit")) {
            getWord();
            System.out.println(complyWord(word1).equals(complyWord(word2)));
        }
    }

    public static void main(String[] args) {
        ArrayTask arrayTask = new ArrayTask();
        arrayTask.launch();
    }
}

