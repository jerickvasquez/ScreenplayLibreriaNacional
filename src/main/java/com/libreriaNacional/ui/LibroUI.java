package com.libreriaNacional.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LibroUI extends PageObject {

    public static final Target LBL_TITULO_LIBRO =Target.the("Titulo del libro")
            .locatedBy("//h1[@class='text--extrabold text--lgxm text--blue text--lh-1 col-10 col-md-9 px-0']");

    public static final Target LBL_PRECIO_LIBRO =Target.the("Precio del libro")
            .locatedBy("//span[@class='text--blue text--lgx text--lh-1 text--bold']");

    public static final Target LBL_AUTOR_LIBRO =Target.the("Autor del libro")
            .locatedBy("//a[@class='text--blue text--md text--medium']");
}
