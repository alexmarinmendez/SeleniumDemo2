package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver;

    public LoginSteps(GlobalSteps global) {
        this.driver = global.driver;
    }

    @Given("Se navega a la pagina de Login")
    public void navegarPagina() {
        driver.get("https://www.saucedemo.com/");
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
