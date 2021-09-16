package com.moodanayzer;

/**
 * @author : VAISHNAVI R. VISHWAKRMA.
 * @purpose: To Print Welcome message,
 *           To Implementing Mood Analyser Program.
 * @SINCE 15-09-2021.
 */

public class MoodAnalyzer {
    // main method
    public static void main(String[] args) {
        // printing welcome message.
        System.out.println("Welcome to Mood Analyzer Program");
    }

    /**
     * This method is created for implementing test cases
     *
     * @param message This is the first parameter used to store the message
     * @return returns actual value
     */
    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }

}
