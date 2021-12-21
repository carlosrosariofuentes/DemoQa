package com.demoqa.tasks;

import com.demoqa.interactions.Interactions;
import com.demoqa.interactions.WaitElement;
import com.demoqa.userinterfase.WindowsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WindowsTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Interactions interactions= new Interactions();

        try{
            Robot robot= new Robot();
            actor.attemptsTo(
                    Hit.the(Keys.ENTER).into(WindowsPage.BTN_BOTON1),
                    WaitElement.untilAppears(WindowsPage.BTN_BOTON2)
            );
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            actor.attemptsTo(Hit.the(Keys.ENTER).into(WindowsPage.BTN_BOTON2));

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(5000);
            actor.attemptsTo(Hit.the(Keys.ENTER).into(WindowsPage.BTN_BOTON3));
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            actor.attemptsTo(WaitElement.untilAppears(WindowsPage.BTN_BOTON2));

        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

    public static WindowsTasks darClick() {
        return instrumented(WindowsTasks.class);
    }
}
