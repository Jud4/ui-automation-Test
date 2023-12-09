package ui;

import org.openqa.selenium.By;

public class HomePageUI {
    public static By loginButton = By.xpath("//div[@class='HPHeaderSignup']");
    public static By signUpButton = By.xpath("//div[@class='HPHeaderSignup']");
    public static By fullnameInput = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]");
    public static By emailInput = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]");
    public static By passwordInput = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]");
    public static By termsCheckbox = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_CheckBoxTerms\"]");
    public static By signUpConfirm = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]");
    public static By loginEmailInput = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]");
    public static By loginPassInput = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]");
    public static By loginConfirm = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]");
}
