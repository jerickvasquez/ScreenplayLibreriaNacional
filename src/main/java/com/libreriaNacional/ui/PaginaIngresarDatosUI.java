package com.libreriaNacional.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaIngresarDatosUI extends PageObject {

    public static final Target INPUT_CORREO = Target.the("enviar correo")
            .locatedBy("//input[@placeholder='nombre@correo.com']");

    public static final Target INPUT_CONTRASENIA = Target.the("enviar contraseña")
            .locatedBy("//input[@placeholder='Ingresar contraseña']");

    public static final Target BUTTON_INGRESAR = Target.the("click a iniciar sesion")
            .locatedBy("//button[text() = 'Iniciar sesión']");
}
