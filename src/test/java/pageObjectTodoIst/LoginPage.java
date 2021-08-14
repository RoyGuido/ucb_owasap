package pageObjectTodoIst;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public Button loginButton = new Button(By.xpath("//*[@id=\"login_form\"]/button"));
    public TextBox emailTextBox = new TextBox(By.xpath("//*[@id=\"email\"]"));
    public TextBox passwordTextBox = new TextBox(By.xpath("//*[@id=\"password\"]"));


}
