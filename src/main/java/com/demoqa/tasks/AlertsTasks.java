package com.demoqa.tasks;

import com.demoqa.interactions.Interactions;
import com.demoqa.userinterfase.AlertsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AlertsTasks implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Interactions interactions = new Interactions();
        try {

            Robot robot = new Robot();
            actor.attemptsTo(
                    Hit.the(Keys.ENTER).into(AlertsPage.BTN_BUTTON1));
            interactions.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            interactions.sleep(2000);
            actor.attemptsTo(
                    Hit.the(Keys.ENTER).into(AlertsPage.BTN_BUTTON2));
            robot.delay(6000);
            robot.keyPress(KeyEvent.VK_ENTER);
            actor.attemptsTo(
                    Scroll.to(AlertsPage.BTN_BUTTON2),
                    Hit.the(Keys.ENTER).into(AlertsPage.BTN_BUTTON3)
            );
            interactions.sleep(2000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            interactions.sleep(2000);
            actor.attemptsTo(
                    Scroll.to(AlertsPage.BTN_BUTTON4),
                    Hit.the(Keys.ENTER).into(AlertsPage.BTN_BUTTON4)
            );
            interactions.sleep(2000);
            setClipboardData("Carlos");
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            interactions.sleep(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            interactions.sleep(2000);



        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

    }

    public static AlertsTasks darClick() {
        return instrumented(AlertsTasks.class);


    }
}
