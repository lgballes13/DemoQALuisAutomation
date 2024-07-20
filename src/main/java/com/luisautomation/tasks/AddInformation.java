package com.luisautomation.tasks;

import com.luisautomation.models.WebTableModel;
import com.luisautomation.userinterface.WebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class AddInformation implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String department;

    public AddInformation (List<WebTableModel> model){
        this.firstName = model.get(0).getFirstName();
        this.lastName = model.get(0).getLastName();
        this.email = model.get(0).getEmail();
        this.age =  model.get(0).getAge();
        this.salary = model.get(0).getSalary();
        this.department = model.get(0).getDepartment();
    }


    public static AddInformation forRegister(List<WebTableModel> model){
        return Tasks.instrumented(AddInformation.class, model);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(WebTablePage.BTN_ADD),
                Enter.theValue(firstName).into(WebTablePage.TXT_FIRST_NAME),
                Enter.theValue(lastName).into(WebTablePage.TXT_LAST_NAME),
                Enter.theValue(email).into(WebTablePage.TXT_EMAIL),
                Enter.theValue(age).into(WebTablePage.TXT_AGE),
                Enter.theValue(salary).into(WebTablePage.TXT_SALARY),
                Enter.theValue(department).into(WebTablePage.TXT_DEPARTAMENT),
                Click.on(WebTablePage.BTN_SUBMIT)
                );

    }
}
