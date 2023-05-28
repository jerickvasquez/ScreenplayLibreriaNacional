package com.libreriaNacional.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionLibroUI {

    public static final Target LBL_NOMBRE_LIBRO= Target.the("Nombre del Libro")
            .locatedBy("//a[@class='d-flex text--blue text--sm text--bold text--lh-1 book-title']");


    public static final Target LBL_PRECIO_LIBRO= Target.the("Precio del Libro")
            .locatedBy("//span[@class='text--blue text--sm text--lh-1 text--bold']");



}
