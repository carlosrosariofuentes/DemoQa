package com.demoqa.questions;


import com.demoqa.userinterfase.AlertsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
public class AlertQuestions  implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return Text.of(AlertsPage.QUESTIONS).viewedBy(actor).asString();


    }
    public static AlertQuestions compare(){

        return new AlertQuestions();
    }
}
