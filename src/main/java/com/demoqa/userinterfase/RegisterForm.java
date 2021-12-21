package com.demoqa.userinterfase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://demoqa.com/automation-practice-form")
public class RegisterForm  extends PageObject {

/*
    public static final Target FIRST_NAME = Target.the("input where the first name is written ").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("input where the last Name is written ").located(By.id("lastName"));
    public static final Target USER_EMAIL = Target.the("input where the user Email is whitten").located(By.id("userEmail"));
    public static final Target  GENDER   = Target.the("choose the gender of the label").locatedBy("//label[@for='gender-radio-2']");
    public static final Target NUMBER_MOBILE = Target.the("write your mobile number on the label").located(By.id("userNumber"));

    public static final Target SUBJECTS = Target.the("choose subject").located(By.id("subjectsInput"));*/
//___________________________________________________________________________________________________________
    public static final Target NAME = Target.the("firstname").locatedBy("//input[@id='firstName']");
    public static final Target LASTNAME = Target.the("lastname").locatedBy("//input[@id='lastName']");
    public static final Target EMAIL = Target.the("email").locatedBy("//input[@id='userEmail']");
    public static final Target MALE = Target.the("male").locatedBy("//*[@class='custom-control-label']");
    public static final Target MOBILE = Target.the("mobile").locatedBy("//input[@id='userNumber']");
    public static final Target CLEAR_ON_BIRTHDAY = Target.the("clear_on_birthday").locatedBy("//*[@id='dateOfBirthInput']");
    public static final Target BIRTHDAY_MONTH = Target.the("birthday_month").locatedBy("//*[@class='react-datepicker__month-select']");
    public static final Target BIRTHDAY_SELECT = Target.the("birthday_select").locatedBy("//*[@class='react-datepicker__month-select']/option[004]");
    public static final Target BIRTHDAY_YEAR = Target.the("birthday_year").locatedBy("//*[@class='react-datepicker__year-select']/option[96]");
    public static final Target BIRTHDAY_DAY = Target.the("birthday_day").locatedBy("//*[@class='react-datepicker__day react-datepicker__day--028']");
    public static final Target SUBJECTS = Target.the("subjects").locatedBy("//input[@id='subjectsInput']");
    public static final Target SUBJECTS_TAB = Target.the("subjects_tab").locatedBy("//input[@id='subjectsInput']");
    public static final Target HOBBIES1_SPACE = Target.the("hobbies1_space").locatedBy("//*[@id='hobbies-checkbox-1']");
    public static final Target HOBBIES1_TAB = Target.the("hobbies1_tab").locatedBy("//*[@id='hobbies-checkbox-1']");
    public static final Target HOBBIES2_SPACE = Target.the("hobbies2_space").locatedBy("//*[@id='hobbies-checkbox-2']");
    public static final Target HOBBIES2_TAB = Target.the("hobbies2_tab").locatedBy("//*[@id='hobbies-checkbox-2']");
    public static final Target HOBBIES3_SPACE = Target.the("hobbies3_space").locatedBy("//*[@id='hobbies-checkbox-3']");
    public static final Target ADRESS = Target.the("adress").locatedBy("//*[@id='currentAddress']");

    public static final Target STATE = Target.the("state").locatedBy("//*[@id='react-select-3-input']");
    public static final Target STATE_TAB = Target.the("state_tab").locatedBy("//*[@id='react-select-3-input']");

    public static final Target CITY = Target.the("city").locatedBy("//*[@id='react-select-4-input']");
    public static final Target CITY_TAB = Target.the("city_tab").locatedBy("//*[@id='react-select-4-input']");
    public static final Target CITY_TAB1 = Target.the("city_tab").locatedBy("//*[@id='react-select-4-input']");
    public static final Target SUBMIT = Target.the("submit").locatedBy("//*[@type='submit']");
    public static final Target QUESTIONS = Target.the("Cadena de texto").locatedBy("//*[text()='Thanks for submitting the form']");
    public static final Target SELECT_PICTURE  = Target.the("click in Select picture").located(By.id("uploadPicture"));




}
