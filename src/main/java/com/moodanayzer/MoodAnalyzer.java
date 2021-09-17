package com.moodanayzer;

/**
 * @author : VAISHNAVI R. VISHWAKRMA.
 * @purpose: To Print Welcome message,
 * To Implementing Mood Analyser Program.
 * @SINCE 15-09-2021.
 */

public class MoodAnalyzer {

    private String message;

    // parameterized constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    // default constructor
    public MoodAnalyzer() {

    }

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

    /**
     * Purpose : This method is created for implementing test cases
     *           which uses parameterized constructor
     * Condition : Handle NullPointerException using try-catch block
     * @return returns actual value
     */
    public String analyseMood() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";

        } catch (NullPointerException exception) {
            return "HAPPY";
        }
    }

}
