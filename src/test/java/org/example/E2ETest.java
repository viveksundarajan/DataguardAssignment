package org.example;

import org.example.pages.ToDoPage;
import org.example.utilities.BaseInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class E2ETest extends BaseInit {

    public E2ETest() throws IOException {
        super();
    }

    @Test(priority = 1)
    public void verifyAddAndModifyToDo() {
        ToDoPage toDoPage = page.getInstance(ToDoPage.class);
        toDoPage.getToDoTextField().sendKeys(configuration.todoNameWithTimeStamp(todoName));
        toDoPage.clickAddButton();
        toDoPage.clickModify();

        //Verification for task added successfully
        Assert.assertTrue(toDoPage.getToDoTitle().contains(configuration.getTimestamp()), "ToDo is not added successfully");

        toDoPage.getEditTodoTextField().sendKeys(configuration.todoNameWithTimeStamp(todoName));
        toDoPage.saveChanges();
        toDoPage.clickModify();

        //Verification for task is updated successfully
        Assert.assertTrue(toDoPage.getToDoTitle().contains(configuration.getTimestamp()), "ToDo is not updated");

        driver.navigate().back();
        toDoPage.removeToDo();

        //Verification for task is deleted successfully
        Assert.assertTrue(toDoPage.getListOfTodo().size()==0, "Todo is deleted successfully");
    }
}
