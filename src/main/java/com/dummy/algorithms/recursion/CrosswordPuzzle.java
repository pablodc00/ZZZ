package com.dummy.algorithms.recursion;

import com.dummy.teksystem.test.A;

import java.util.*;

public class CrosswordPuzzle {
    //https://www.youtube.com/watch?v=L8JG5oPuZoE
    //https://www.hackerrank.com/challenges/crossword-puzzle/problem?isFullScreen=true

    //static List<String> result = null;

    public static void main(String[] args) {
        System.out.println("Original crossword:");
        List<String> crossword = makeCrosswordOne();
        //List<String> crossword = makeCrosswordTwo();
        //List<String> crossword = makeCrosswordThree();
        for(String elem : crossword) {
            System.out.println(elem);
        }

        String word = "LONDON;DELHI;ICELAND;ANKARA";
        //String word = "ICELAND;ANKARA";
        //String word = "ANKARA";


        List<String> result = crosswordPuzzle(crossword, word);
        //crosswordPuzzle(crossword, word);
        System.out.println("Result crossword:");
        for(String elem : result) {
            System.out.println(elem);
        }
    }

    public static List<String> crosswordPuzzle(List<String> crossword, String words) {
        // Write your code here
        List<String> lWords = Arrays.asList(words.split(";"));
        return complete(crossword, lWords.get(0), lWords.subList(1, lWords.size()));
    }

    private static List<String> complete(List<String> crossword, String word, List<String> lWords) {
        List<String> newCrossword = null;
        String currenWord = null;
        StringBuilder newWord = null;

        List<String> currenWordV = null;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (canPlaceH(crossword, word, i, j)) {
                    currenWord = crossword.get(i);
                    newWord = new StringBuilder(currenWord);
                    for (int k = 0; k < word.length(); k++) {
                        newWord.setCharAt(j+k, word.charAt(k));
                    }
                    crossword.set(i, newWord.toString());
//                    System.out.println("Place H");
//                    for(String elem : crossword) {
//                        System.out.println(elem);
//                    }
                    if (lWords.isEmpty()) {
                        return crossword;
                    } else {
                        newCrossword = complete(crossword, lWords.get(0), lWords.subList(1, lWords.size()));
                        if (!checkCrossword(newCrossword)) {
                            //result = newCrossword;
                            return newCrossword;
                        }
                        crossword.set(i, currenWord);
                    }
                } else if (canPlaceV(crossword, word, i, j)) {
                    currenWordV = new ArrayList<>();
                    for (int k = 0; k < word.length(); k++) {
                        currenWordV.add(crossword.get(i+k));
                        newWord = new StringBuilder(crossword.get(i+k));
                        newWord.setCharAt(j, word.charAt(k));
                        crossword.set(i+k, newWord.toString());
                    }
//                    System.out.println("Place V");
//                    for(String elem : crossword) {
//                        System.out.println(elem);
//                    }
                    if (lWords.isEmpty()) {
                        return crossword;
                    } else {
                        newCrossword = complete(crossword, lWords.get(0), lWords.subList(1, lWords.size()));
                        if (!checkCrossword(newCrossword)) {
                            //result = newCrossword;
                            return newCrossword;
                        }
                        for (int k = 0; k < word.length(); k++) {
                            crossword.set(i+k, currenWordV.get(k));
                        }
                    }
                }
            }
        }

        return newCrossword;
    }


    private static boolean canPlaceH(List<String> crossword, String word, int i, int j) {
        if (!checkCrossword(crossword)) {
            return false;
        }

        String line = crossword.get(i);

        if ( !(Character.toString(line.charAt(j)).equals("-")) &&
             line.charAt(j) != word.charAt(0) ) {
            return false;
        }
        if (j > 0 && Character.toString(line.charAt(j-1)).equals("-") ) {
            return false;
        }
        if (j + word.length() > 10) {
            return false;
        }

        if (j + word.length() < 10) {
            if (Character.toString(line.charAt(j + word.length())).equals("-")) {
                return false;
            }
        }

        for (int k = 0; k < word.length(); k++) {
            if (Character.toString(line.charAt(j)).equals("-") ||
                Character.toString(line.charAt(j)).equals(Character.toString(word.charAt(k))) ) {
                j++;
            } else {
                return false;
            }
        }

        return true;
    }

    private static boolean canPlaceV(List<String> crossword, String word, int i, int j) {
        if (!checkCrossword(crossword)) {
            return false;
        }

        String line = crossword.get(i);
        if ( !(Character.toString(line.charAt(j)).equals("-")) &&
             line.charAt(j) != word.charAt(0) ) {
            return false;
        }

        if (i > 0) {
            String prevLine = crossword.get(i - 1);
            if (Character.toString(prevLine.charAt(j)).equals("-")) {
                return false;
            }
        }

        if (i + word.length() > 10) {
            return false;
        }

        if (i + word.length() < 10) {
            String nextLine = crossword.get(i + word.length());
            if (Character.toString(nextLine.charAt(j)).equals("-")) {
                return false;
            }
        }

        String currentLine = null;
        for (int k = 0; k < word.length(); k++) {
            currentLine = crossword.get(i);
            if (Character.toString(currentLine.charAt(j)).equals("-") ||
                Character.toString(currentLine.charAt(j)).equals(Character.toString(word.charAt(k))) ) {
                i++;
            } else {
                return false;
            }
        }

        return true;
    }

    private static boolean checkCrossword(List<String> crossword) {
        Optional<String> flag = crossword
                .stream()
                .filter(e -> e.contains("-"))
                .findFirst();
        return flag.isPresent();
    }

    private static List<String> makeCrosswordOne() {
        return  Arrays.asList(
                "+-++++++++",
                "+-++++++++",
                "+-++++++++",
                "+-----++++",
                "+-+++-++++",
                "+-+++-++++",
                "+++++-++++",
                "++------++",
                "+++++-++++",
                "+++++-++++");
    }

    private static List<String> makeCrosswordTwo() {
        return  Arrays.asList(
                "+L++++++++",
                "+O++++++++",
                "+N++++++++",
                "+DELHI++++",
                "+O+++-++++",
                "+N+++-++++",
                "+++++-++++",
                "++------++",
                "+++++-++++",
                "+++++-++++");
    }

    private static List<String> makeCrosswordThree() {
        return  Arrays.asList(
                "+L++++++++",
                "+O++++++++",
                "+N++++++++",
                "+DELHI++++",
                "+O+++C++++",
                "+N+++E++++",
                "+++++L++++",
                "++---A--++",
                "+++++N++++",
                "+++++D++++");
    }
}
