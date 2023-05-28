package com.libreriaNacional.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.libreriaNacional.ui.PaginaIngresarDatosUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaIngresarDatosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("jorgeerick446@gmail.com").into(INPUT_CORREO),
                Enter.theValue("nacional").into(INPUT_CONTRASENIA),
                Click.on(BUTTON_INGRESAR)
        );
    }

    public static Performable PaginaIngresarDatosTask(){
        return instrumented(PaginaIngresarDatosTask.class);
    }

}
