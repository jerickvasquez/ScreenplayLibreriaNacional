package com.libreriaNacional.utils;
/*
 * @(#) BusquedaAleatoria.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class BusquedaAleatoria {


    public static String busqueda() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("datos/data.xlsx", "Videos");
        Random random= new Random();
        int indice= random.nextInt(data.size());

        String video= data.get(indice).get("SearchV");
        return video;
    }
}
