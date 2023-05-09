package Stepobject;

import Pageobject.Cartpage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class Cartpage_steps extends Cartpage {
    @Step("Product name check")
    public Cartpage_steps namecheck(){
        itemname.shouldBe(Condition.visible, Duration.ofMillis(10000));
        return this;
    }
    @Step("Product color check")
    public Cartpage_steps colorcheck(){
        itemcolor.shouldBe(Condition.visible);
        return this;
    }
    @Step("Product code check")
    public Cartpage_steps codecheck(){
        itemcode.shouldBe(Condition.visible);
        return this;
    }
    @Step("Product number check")
    public Cartpage_steps numcheck(){
        itemnum.shouldBe(Condition.visible);
        return this;
    }
    @Step("Product price check")
    public Cartpage_steps pricecheck(){
        itemprice.shouldBe(Condition.visible);
        return this;
    }
    @Step("Product total price check")
    public Cartpage_steps sumpricecheck(){
        itemsumprice.shouldBe(Condition.visible);
        return this;
    }
}
