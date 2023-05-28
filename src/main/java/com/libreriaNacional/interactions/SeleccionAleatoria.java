package com.libreriaNacional.interactions;

import com.libreriaNacional.utils.EscrituraExcel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.libreriaNacional.ui.SeleccionLibroUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionAleatoria implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaLibros = LBL_NOMBRE_LIBRO.resolveAllFor(actor);
        List<WebElementFacade> listaPrecios = LBL_PRECIO_LIBRO.resolveAllFor(actor);

        Random random= new Random();
        int indiceAleatorio= random.nextInt(listaPrecios.size());
        EscrituraExcel.escrituraExcel("datos/Data.xlsx",listaLibros.get(indiceAleatorio).getText(),1,1);
        EscrituraExcel.escrituraExcel("datos/Data.xlsx",listaPrecios.get(indiceAleatorio).getText(),1,2);

        listaLibros.get(indiceAleatorio).click();
    }

    public static Performable SeleccionAleatoria(){
        return  instrumented(SeleccionAleatoria.class);
    }
}
