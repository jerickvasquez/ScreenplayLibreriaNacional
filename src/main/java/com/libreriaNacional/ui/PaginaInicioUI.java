package com.libreriaNacional.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://librerianacional.com/")
public class PaginaInicioUI extends PageObject {

    public static final Target BUTTON_MENU = Target.the("enviar nombre del producto")
            .locatedBy("//button[@id='dropdownMenuLogin']");

    public static final Target BUTTON_INICIAR_SESION = Target.the("enviar nombre del producto")
            .locatedBy("//a[@ng-reflect-router-link='/,usuario,ingresar'][text() = ' Iniciar Sesión ']");


}
