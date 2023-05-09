package Stepobject;

import Pageobject.Homepage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class Homepage_steps extends Homepage {
    @Step("Click on the search button")
    public  Homepage_steps searchclick(){
        searchbutton.click();
        return this;
    }
    @Step("Search is visibele")
    public Homepage_steps searchvisible(){
        search.shouldBe(Condition.visible);
        return this;
    }
    @Step("set search product")
    public Homepage_steps sendvalue(String searchproduct){
        search.setValue(searchproduct);
        return this;
    }
    @Step("Click to search the product")
    public Homepage_steps searchitem(){
        searchclickbtn.click();
        return this;
    }
    @Step("Check for invalid search")
    public Homepage_steps sendinvalidvalue(String invalidsearchproduct){
        search.setValue(invalidsearchproduct);
        return this;
    }
}
