package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.text.AsyncBoxView;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;


public class Tests {

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void formTests(){
        open("/automation-practice-form");
        $("[id=firstName]").setValue("Mike");
        $("[id=lastName]").setValue("Turilov");
        $("[id=userEmail]").setValue("example@google.com");
        $("[id=gender-radio-1]").doubleClick();
        $("[id=userNumber]").setValue("89001546995");
        $("[id=dateOfBirthInput]").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1985");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--012").click();
        $("#subjectsInput").click();
        $("#subjectsInput").setValue("Maths");
        $("#subjectsInput").pressEnter();
        $("#subjectsInput").pressTab();
        $("#hobbies-checkbox-1").parent().click();
//        $("#uploadPicture").uploadFromClasspath("1.png");
        $("#uploadPicture").uploadFile(new File("src/test/resources/1.png"));
        $("#currentAddress").setValue("Some Address");
        $("#state").click();
        $("#state").selectOption("NCR");
        $("#state").pressTab();




    }
}
