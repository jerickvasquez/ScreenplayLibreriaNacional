package com.libreriaNacional.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicioSesionUI extends PageObject {

    public static final Target BUTTON_INGRESAR= Target.the("Ingresar con mail y contraseña")
            .locatedBy("//div[@class='d-flex align-items-center text--blue text--normal text--xl my-1']");
}
