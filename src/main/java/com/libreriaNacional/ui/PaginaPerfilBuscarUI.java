package com.libreriaNacional.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPerfilBuscarUI extends PageObject {

    public static final Target INPUT_BUSCAR= Target.the("Buscar Libro")
            .locatedBy("//input[@placeholder='Buscar…']");
}
