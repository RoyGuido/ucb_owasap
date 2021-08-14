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
import pageObject.LoginModal;
import pageObject.MainPage;
import session.Session;

public class TodoLyTest {

    MainPage mainPage = new MainPage();
    LoginModal loginModal= new LoginModal();

    @BeforeEach
    public void before(){
        Session.getInstance().getDriver().get("https://todo.ly/");
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
        loginModal.emailTextBox.setValue("jjaja@jaja.com");
        loginModal.passwordTextBox.setValue("0000");
        loginModal.loginButton.click();

        //Verificaciones ........

    }
    @AfterEach
    public void after(){
        Session.getInstance().closeSession();
    }

}
