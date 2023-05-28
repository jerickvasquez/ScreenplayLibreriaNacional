package com.libreriaNacional.task;


import com.libreriaNacional.interactions.ClickMenuYIniciarSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaInicioTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ClickMenuYIniciarSesion.ClickMenu()
        );
    }


    public static Performable PaginaInicioTask(){
        return instrumented(PaginaInicioTask.class);
    }

}
