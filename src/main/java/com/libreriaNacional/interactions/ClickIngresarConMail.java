package com.libreriaNacional.interactions;

import com.libreriaNacional.ui.PaginaInicioSesionUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.libreriaNacional.ui.PaginaInicioSesionUI.BUTTON_INGRESAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickIngresarConMail implements Interaction {

    @Page
    PaginaInicioSesionUI paginaInicioSesionUI;

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> INGRESAR = paginaInicioSesionUI.getDriver().findElements(By.xpath(BUTTON_INGRESAR.getCssOrXPathSelector()));

        INGRESAR.get(2).click();

    }


    public static Performable ClickIngresarConMail(){
        return  instrumented(ClickIngresarConMail.class);
    }
}
