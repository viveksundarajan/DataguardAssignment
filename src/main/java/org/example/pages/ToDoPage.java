package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ToDoPage extends BasePage {

    public ToDoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "newtodo")
    private WebElement todoTextField;

    @FindBy(xpath = "//input[@value='Add']")
    private WebElement addButton;

    @FindBy(xpath = "//ul/li/a[2]")
    private WebElement modifyToDo;

    @FindBy(xpath = "//h1")
    private WebElement todoTitle;

    @FindBy(xpath = "//input[@value='Save']")
    private WebElement saveChange;

    @FindBy(id = "editTodo")
    private WebElement editTodoTextField;

    @FindBy(xpath = "//li/a[1]")
    private WebElement deleteToDo;

    @FindBy(xpath = "//ul/li")
    private List<WebElement> todoLists;

    public WebElement getToDoTextField()
    {
        return todoTextField;
    }

    public void clickAddButton()
    {
         addButton.click();
    }

    public void clickModify() {
         modifyToDo.click();
    }

    public String getToDoTitle() {
        return todoTitle.getText();
    }

    public void saveChanges() {
        saveChange.click();
    }

    public WebElement getEditTodoTextField()
    {
        return editTodoTextField;
    }

    public void removeToDo()
    {
         deleteToDo.click();
    }

    public List<WebElement> getListOfTodo() {
        return todoLists;
    }
}
