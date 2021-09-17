package com.bl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = null;
        try {
            mood = moodAnalyzer.analyseMood("I am in Sad Mood");
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenInAnyMood_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("I am in Any Mood");
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("I am in Happy Mood");
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_WhenSad_ShouldReturnSad_UsingParameterizedConstructor() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenNullMood_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        try {
         moodAnalyser.analyseMood();
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.type);
        }

    }
}
