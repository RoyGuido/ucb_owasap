package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObjectTodoIst.LoginPage;
import pageObjectTodoIst.MainPage;
import session.Session;

public class TodoIstTest {
    MainPage mainPage = new MainPage();
    LoginPage loginPage= new LoginPage();

    @BeforeEach
    public void before(){
        Session.getInstance().getDriver().get("https://todoist.com/");
        Session.getInstance().maxime();
    }

    @DisplayName("Verificar la ejecución del LOGIN")
    @Description("Este test cases es para verificar...........")
    @Link("jira00000")
    @Issue("BUG0000")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void verifyTheProjectIsLogged(){
        mainPage.loginButton.click();
        loginPage.emailTextBox.setValue("correoprueba@gmail.com");
        loginPage.passwordTextBox.setValue("0000");
        loginPage.loginButton.click();

    }
    @AfterEach
    public void after(){
        Session.getInstance().closeSession();
    }
}
