package com.bl;

/**
 * @author : VAISHNAVI R. VISHWAKRMA.
 * @purpose: To Print Welcome message,
 * To read message from user and return sad if message contains sad else happy.
 * @since : 15-09-2021.
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
     * This method is created for implementing test cases which does not use parameterized constructor
     *
     * @param message This is the first parameter used to store the message
     * @return returns actual value from analyseMood method
     */
    public String analyseMood(String message) throws MoodAnalyzerException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalyzerException {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException exception) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL,
                    "Please enter proper message");
        }
    }
}