package com.demoqa.tasks;

import com.demoqa.interactions.Interactions;
import com.demoqa.models.DataRegister;
import com.demoqa.userinterfase.RegisterForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterTasks implements Task {
    DataRegister dataRegister;

    public RegisterTasks(DataRegister dataRegister) {
        this.dataRegister = dataRegister;
    }


    @Override

    public <T extends Actor> void performAs(T actor) {
        Interactions interactions = new Interactions();
        actor.wasAbleTo(

                Enter.keyValues(dataRegister.getFirstName()).into(RegisterForm.NAME),
                Enter.keyValues(dataRegister.getLastName()).into(RegisterForm.LASTNAME),
                Enter.keyValues(dataRegister.getEmail()).into(RegisterForm.EMAIL),
                Click.on(RegisterForm.MALE),
                Enter.keyValues(dataRegister.getMobile()).into(RegisterForm.MOBILE),
                SendKeys.of(Keys.TAB).into(RegisterForm.CLEAR_ON_BIRTHDAY),
                Click.on(RegisterForm.BIRTHDAY_MONTH),
                Click.on(RegisterForm.BIRTHDAY_SELECT),
                Click.on(RegisterForm.BIRTHDAY_YEAR),
                Click.on(RegisterForm.BIRTHDAY_SELECT),
                Click.on(RegisterForm.BIRTHDAY_DAY),
                Enter.keyValues(dataRegister.getSubjects()).into(RegisterForm.SUBJECTS),
                SendKeys.of(Keys.TAB).into(RegisterForm.SUBJECTS_TAB),
                SendKeys.of(Keys.SPACE).into(RegisterForm.HOBBIES1_SPACE),
                SendKeys.of(Keys.TAB).into(RegisterForm.HOBBIES1_TAB),
                SendKeys.of(Keys.SPACE).into(RegisterForm.HOBBIES2_SPACE),
                SendKeys.of(Keys.SPACE).into(RegisterForm.HOBBIES2_TAB),
                Scroll.to(RegisterForm.SUBMIT),
                SendKeys.of(Keys.SPACE).into(RegisterForm.HOBBIES3_SPACE),
                Enter.keyValues(dataRegister.getSelect()).into(RegisterForm.SELECT_PICTURE),
                Enter.keyValues(dataRegister.getAdress()).into(RegisterForm.ADRESS),
                Enter.keyValues(dataRegister.getState()).into(RegisterForm.STATE),

                SendKeys.of(Keys.TAB).into(RegisterForm.STATE_TAB),
                Enter.keyValues(dataRegister.getCity()).into(RegisterForm.CITY),
                SendKeys.of(Keys.TAB).into(RegisterForm.CITY_TAB),
                SendKeys.of(Keys.TAB).into(RegisterForm.CITY_TAB1),
                Hit.the(Keys.ENTER).into(RegisterForm.SUBMIT));
               interactions.sleep(5000);
        //SendKeys.of(Keys.ENTER).into(RegisterForm.SUBMIT));
        //Hit.the(Keys.ENTER).into(RegisterForm.SUBJECTS),
        // Click.on(RegisterForm.OPTIONSUBJECTS)
    }

    public static RegisterTasks registerUser(DataRegister dataRegister) {
        return instrumented(RegisterTasks.class, dataRegister);

    }
}



