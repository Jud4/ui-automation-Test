package ui;

import org.openqa.selenium.By;

public class DashboardUI {
    public static By logout = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");
    public static By addProject = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");
    public static By inputTask = By.xpath("//*[@id=\"NewItemContentInput\"]");
    public static By addTask = By.xpath("//*[@id=\"NewItemAddButton\"]");
    public static By listTask = By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]/div[1]/div[1]/div[4]/ul");
    public static By lastTask = By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]/div[1]/div[1]/div[4]/ul/li[last()]/div/table/tbody/tr/td[3]/div[4][text()=\"Diplomado V5\"]");

}
