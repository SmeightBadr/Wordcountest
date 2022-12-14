package com.example.wordcounterapp;

import org.junit.Test;

import function.counter;
import static org.junit.Assert.*;


public class UnitTest {
    @Test
    public void countChar_regular()
    {
        String InputString = "hello";
        int expected = 5;
        int actual = counter.countChars(InputString);
        assertEquals(expected,actual);

    }
    @Test
    public void countChar_blankSpace_and_words()
    {
        String InputString = "Washing Machine Heart";
        int expected = 21;
        int actual = counter.countChars(InputString);
        assertEquals(expected,actual);

    }
    @Test
    public void countChar_specialCharacter()
    {
        String InputString = "blëp";
        int expected = 4;
        int actual = counter.countChars(InputString);
        assertEquals(expected,actual);
    }
    @Test
    public void countChar_blankSpace()
    {
        String InputString ="Got a long list of ex-lovers\n" +
                "They'll tell you I'm insane\n" +
                "But I've got a blank space, baby\n" +
                "And I'll write your name";
        int expected = 114;
        int actual = counter.countChars(InputString);
        assertEquals(expected,actual);
    }

    @Test
    public void countChar_REALblankSpace()
    {
        String InputString =" ";
        int expected = 1;
        int actual = counter.countChars(InputString);
        assertEquals(expected,actual);

    }
    @Test
    public void countChar_numbers()
    {
        String InputString ="42069";
        int expected = 5;
        int actual = counter.countChars(InputString);
        assertEquals(expected,actual);

    }
    //---------------------------------------------
    //count word next
    //---------------------------------------------
    @Test
    public void countWord_oneWord()
    {
        String InputString = "helo";
        int expected = 1;
        int actual = counter.countWords(InputString);
        assertEquals(expected,actual);

    }
    @Test
    public void countWord_Multiple_word()
    {
        String InputString = "Nobody loves the light like the blind man";
        int expected = 8;
        int actual = counter.countWords(InputString);
        assertEquals(expected,actual);
    }
    @Test
    public void countWord_Special_letters()
    {
        String InputString = "when the summer dië";
        int expected = 4;
        int actual = counter.countWords(InputString);
        assertEquals(expected,actual);
    }
    @Test
    public void countWord_split_w_other_punctuation() {
        String InputString = "Sing,goddess,the'rage'of.Achilles";
        int expected = 6;
        int actual = counter.countWords(InputString);
        assertEquals(expected, actual);
    }

}