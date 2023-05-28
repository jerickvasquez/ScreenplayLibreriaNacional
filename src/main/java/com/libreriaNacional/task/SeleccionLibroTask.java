package com.libreriaNacional.task;

import com.libreriaNacional.interactions.SeleccionAleatoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionLibroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionAleatoria.SeleccionAleatoria()
        );
    }

    public static Performable clickLibro(){
        return instrumented(SeleccionLibroTask.class);
    }

}
