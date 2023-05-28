package com.libreriaNacional.task;

import com.libreriaNacional.interactions.ClickBuscar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaPerfilBuscarTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ClickBuscar.ClickBuscar()
                );

    }

    public static Performable PaginaPerfilBuscarTask(){
        return instrumented(PaginaPerfilBuscarTask.class);
    }

}
