package com.libreriaNacional.interactions;

import com.libreriaNacional.ui.PaginaPerfilBuscarUI;
import com.libreriaNacional.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.libreriaNacional.ui.PaginaPerfilBuscarUI.INPUT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBuscar implements Interaction {

    @Page
    PaginaPerfilBuscarUI paginaPerfilBuscarUI;

    private static ArrayList<Map<String, String>> datosExcel = new ArrayList<>();


    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            datosExcel = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx", "Search");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> BUSCAR = paginaPerfilBuscarUI.getDriver().findElements(By.xpath(INPUT_BUSCAR.getCssOrXPathSelector()));

        BUSCAR.get(1).sendKeys(datosExcel.get(0).get("Search"));
        BUSCAR.get(1).sendKeys(Keys.ENTER);

    }

    public static Performable ClickBuscar(){
        return  instrumented(ClickBuscar.class);
    }

}
