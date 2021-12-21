package com.demoqa.userinterfase;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WindowsPage extends PageObject {
    public static final Target BTN_BOTON1 = Target.the("Click en el primer boton").locatedBy("//button[@id='tabButton']");
    public static final Target BTN_BOTON2 = Target.the("Click en el segundo boton").locatedBy("//button[@id='windowButton']");
    public static final Target BTN_BOTON3 = Target.the("Click en el segundo boton").locatedBy("//button[@id='messageWindowButton']");
}
