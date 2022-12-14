package com.example.wordcounterapp;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static org.hamcrest.CoreMatchers.containsString;

import androidx.test.filters.LargeTest;



@LargeTest
@RunWith(AndroidJUnit4.class)
public class UITesting {
    @Rule
    ActivityScenarioRule<MainActivity> main = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void TestCharacters()
    {
        String InputString = "hello";
        int expected = 5;
        onView(withId(R.id.edit_text_count)).perform(click(), replaceText(InputString));
        onView(withId(R.id.spinner)).perform(click());
        onView(withId(R.id.spinner)).check(matches(withSpinnerText(containsString("counting characters"))));
        onView(withId(R.id.text_view_output)).check(matches(withId(expected)));


    }
    @Test
    public void TestWords()
    { String InputString = "hello";
        int expected = 1;
        onView(withId(R.id.edit_text_count)).perform(click(), replaceText(InputString));
        onView(withId(R.id.spinner)).perform(click());
        onView(withId(R.id.spinner)).check(matches(withSpinnerText(containsString("counting words"))));
        onView(withId(R.id.text_view_output)).check(matches(withId(expected)));

    }
}