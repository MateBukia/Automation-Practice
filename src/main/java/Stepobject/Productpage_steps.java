package Stepobject;

import Pageobject.Productspage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class Productpage_steps  extends Productspage{
    @Step("Check for first 5 product names")
    public Productpage_steps checkname(String searchproduct){
        for (int i = 0; i < 5; i++) {
            SelenideElement title = $(byAttribute("class","prod_title"),i);
            title.shouldHave(Condition.text(searchproduct));
        }
        return this;
    }
    @Step("Check the error message 1")
    public Productpage_steps errorcheck1(){
        errorline1.shouldBe(Condition.visible);
        return this;
    }
    @Step("Check the error message 2")
    public Productpage_steps errorcheck2(){
        errortext.shouldBe(Condition.visible);
        return this;
    }
    @Step("Check the error message 3")
    public Productpage_steps errorcheck3(){
        errorline2.shouldBe(Condition.visible);
        return this;
    }
    @Step("Click add to cart button")
    public Productpage_steps addtocart(){
        addtocart.click();
        return this;
    }
    @Step("Success message check")
    public Productpage_steps checkmessage(){
        successadd.shouldBe(Condition.visible, Duration.ofMillis(10000));
        return this;
    }
    @Step("Cart click")
    public Productpage_steps cartclick(){
        successadd.shouldNotBe(Condition.visible, Duration.ofMillis(10000));
        cart.click();
        return this;
    }
    @Step("Click add to cart button for 2nd product")
    public Productpage_steps addtocart2(){
        addtocart2.click();
        return this;
    }
}
