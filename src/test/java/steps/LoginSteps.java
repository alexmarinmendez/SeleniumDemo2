package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("Se navega a la pagina de Login")
    public void navegarPagina() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("Se completa el formulario con el username {string} y el password {string}")
    public void completarFormulario(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("Se verifica que el mensaje de error es {string}")
    public void verificarMensajeError(String mensajeEsperado) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
