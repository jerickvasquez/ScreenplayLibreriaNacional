package com.libreriaNacional.task;

import com.libreriaNacional.interactions.ClickIngresarConMail;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaIngresarTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ClickIngresarConMail.ClickIngresarConMail()
        );
    }

    public static Performable PaginaIngresarTask(){
        return instrumented(PaginaIngresarTask.class);
    }

}
