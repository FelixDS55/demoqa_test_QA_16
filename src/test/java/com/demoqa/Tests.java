package com.demoqa;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class Tests {
    @Test
    void formTests(){
        open("https://demoqa.com/automation-practice-form");


    }
}
