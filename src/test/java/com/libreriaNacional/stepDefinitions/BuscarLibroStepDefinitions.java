package com.libreriaNacional.stepDefinitions;

import com.libreriaNacional.questions.LibroValidacionQuestion;
import com.libreriaNacional.task.*;
import com.libreriaNacional.ui.PaginaInicioUI;
import com.libreriaNacional.utils.EsperaImplicita;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.screenplay.actions.Open;

import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class BuscarLibroStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver browser;
    private Actor user = Actor.named("user");

    private PaginaInicioUI paginaInicioUI= new PaginaInicioUI();

    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(browser));
    }
    @Dado("que el usuario abra el navegador en la url")
    public void queLeUsuarioAbraElNavegadorEnLaUrl() {

        user.wasAbleTo(
                Open.browserOn(paginaInicioUI)
        );
    }

    @Cuando("el usuario de click en mi cuenta y de click en Iniciar Sesion")
    public void elUsuarioDeClickEnMiCuentaYDeClickEnIniciarSesion() {
        user.attemptsTo(
                PaginaInicioTask.PaginaInicioTask()
        );

    }
    @Cuando("de click en Ingresar con Mail y contraseña")
    public void deClickEnIngresarConMailYContraseña() {
        user.attemptsTo(
                PaginaIngresarTask.PaginaIngresarTask()
        );
    }
    @Cuando("ingrese los datos correspondientes y de click en iniciar sesion")
    public void ingreseLosDatosCorrespondientesYDeClickEnIniciarSesion() {
        user.attemptsTo(
                PaginaIngresarDatosTask.PaginaIngresarDatosTask()
        );
    }
    @Cuando("el usuario ingrese una busqueda y presione enter")
    public void elUsuarioIngreseUnaBusquedaYPresioneEnter() {
        user.attemptsTo(
                PaginaPerfilBuscarTask.PaginaPerfilBuscarTask()
        );
        EsperaImplicita.esperaImplicita(5);
    }
    @Cuando("seleccione un libro")
    public void seleccioneUnLibro() {
        user.attemptsTo(
                SeleccionLibroTask.clickLibro()
        );
        EsperaImplicita.esperaImplicita(5);
    }
    @Entonces("el usuario visualizara el libro seleccionado de forma exitosa")
    public void elUsuarioVisualizaraElLibroSeleccionadoDeFormaExitosa() {
        user.should(
                seeThat(
                        "Se visualiza el nombre del libro y su precio",
                        LibroValidacionQuestion.validacionLibro(),
                        Matchers.equalTo(true)
                )
        );
        EsperaImplicita.esperaImplicita(5);
    }

}
