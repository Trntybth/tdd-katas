package org.example;

import java.util.Arrays;

public class Katas {

    public int ReturnsSumOfMiddleNumbers(int[] integers) {
        // sort array by size
        // ignore first and last element, sum middle elements
        Arrays.sort(integers);

        int[] newArray = Arrays.copyOfRange(integers, 1, integers.length - 1); // new array to store length

        return Arrays.stream(newArray).sum();
    }

    public float calculateMean(int[] integers) {
        float sum = Arrays.stream(integers).sum();
        float result = sum / integers.length;

        return result;
    }

    public int calculateAsciiSum(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {

            int asciiValue = (int) string.charAt(i);
            sum += asciiValue;


        }
        return sum;
    }

    public enum Rating {
        LIKE,
        DISLIKE,
        NEUTRAL
    }

    public Rating studentRating(Rating[] ratings){
        //count number of LIKEs & DISLIKEs
        int numberLikes = 0;
        int numberDislikes = 0;

        for (Rating rating : ratings){
            if(rating.equals(Rating.LIKE)){
                numberLikes++;
            } else if (rating.equals(Rating.DISLIKE)) {
                numberDislikes++;
            }
        }
        // getting the remainders
        int numberLikesRemainder = numberLikes % 2;
        int numberDislikesRemainder = numberDislikes % 2;

        // creating array for switch
        int[] likesDislikesTotal = new int[]{numberLikesRemainder, numberDislikesRemainder};

        switch(Arrays.toString(likesDislikesTotal)) { //array to string for switch
            case "[0, 0]", "[1, 1]":
                return Rating.NEUTRAL;
            case "[0, 1]":
                return Rating.DISLIKE;
            case "[1, 0]":
                return Rating.LIKE;
            default:
                return Rating.NEUTRAL;

        }

    }
    public String caeserCipher(String string) {
// northcoders
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                char currentLetter = string.charAt(i);
                int currentAscii = (int) currentLetter;
                (currentAscii + 13 - 65) 
            }
        }

        return null;
    }
}

