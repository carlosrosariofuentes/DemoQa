package com.demoqa.userinterfase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class AlertsPage extends PageObject {
    public static final Target BTN_BUTTON1 = Target.the("Se dara clik en el primero boton del la pagina").locatedBy("//*[@class='btn btn-primary']");
    public static final Target BTN_BUTTON2 = Target.the("Se dara clik en el segundo boton del la pagina").located(By.id("timerAlertButton"));
    public static final Target BTN_BUTTON3 = Target.the("Se dara clik en el tercer boton del la pagina").locatedBy("//button[@id='confirmButton']");
    public static final Target BTN_BUTTON4 = Target.the("Se dara clik en el cuarto boton del la pagina").locatedBy("//button[@id='promtButton']");
    public static  final Target QUESTIONS = Target.the("Se obtendra el elemento final").locatedBy("//span[@id='promptResult']");
}
