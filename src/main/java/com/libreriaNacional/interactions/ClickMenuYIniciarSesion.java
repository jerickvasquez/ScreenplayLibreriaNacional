package com.libreriaNacional.interactions;


import com.libreriaNacional.ui.PaginaInicioUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import java.util.List;

import static com.libreriaNacional.ui.PaginaInicioUI.BUTTON_INICIAR_SESION;
import static com.libreriaNacional.ui.PaginaInicioUI.BUTTON_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickMenuYIniciarSesion implements Interaction {

    @Page
    static
    PaginaInicioUI paginaInicioUI;

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> MENU = paginaInicioUI.getDriver().findElements(By.xpath(BUTTON_MENU.getCssOrXPathSelector()));
        List<WebElement> INICIOSESION = paginaInicioUI.getDriver().findElements(By.xpath(BUTTON_INICIAR_SESION.getCssOrXPathSelector()));

        MENU.get(1).click();
        INICIOSESION.get(1).click();
    }


    public static Performable ClickMenu(){
        return  instrumented(ClickMenuYIniciarSesion.class);
    }
}
