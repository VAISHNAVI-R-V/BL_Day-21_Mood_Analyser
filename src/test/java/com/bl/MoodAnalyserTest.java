package com.bl;

import com.moodanayzer.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    void givenMessage_WhenInAnyMood_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assertions.assertEquals("HAPPY", mood);
    }
    }
