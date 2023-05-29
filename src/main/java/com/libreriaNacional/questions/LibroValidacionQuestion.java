package com.libreriaNacional.questions;

import com.libreriaNacional.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.libreriaNacional.ui.LibroUI.LBL_PRECIO_LIBRO;
import static com.libreriaNacional.ui.LibroUI.LBL_TITULO_LIBRO;

public class LibroValidacionQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String libro="";
        String precio="";
        int longitudMinima = 0;

        try {
            ArrayList<Map<String, String>> datosExcel = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx", "Search");
            libro = datosExcel.get(0).get("NombreLibro");
            precio = datosExcel.get(0).get("ValorLibro");

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        String tituloLibro = LBL_TITULO_LIBRO.resolveFor(actor).getText();
        String precioLibro = LBL_PRECIO_LIBRO.resolveFor(actor).getText();

        if(libro.contains(".")){
            int puntoIndex = libro.indexOf(".");
            libro = libro.substring(0, puntoIndex);
            longitudMinima = Math.min(libro.length(), tituloLibro.length());
            return libro.startsWith(tituloLibro.substring(0, longitudMinima)) && precio.equals(precioLibro);
        }

        return libro.equals(tituloLibro) && precio.equals(precioLibro);
    }

    public static Question validacionLibro(){
        return new LibroValidacionQuestion();
    }
}
