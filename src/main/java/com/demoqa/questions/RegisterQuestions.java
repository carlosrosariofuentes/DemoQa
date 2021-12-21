package com.demoqa.questions;

import com.demoqa.userinterfase.RegisterForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegisterQuestions  implements Question<String> {




    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RegisterForm.QUESTIONS).viewedBy(actor).asString();
    }

    public static RegisterQuestions compare(){

                   return new RegisterQuestions();
    }

}
