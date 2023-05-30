package Stepobject;

import Pageobject.Cartpage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

public class Cartpage_steps extends Cartpage {
    @Step("Product name check")
    public Cartpage_steps namecheck() {
        itemname.shouldBe(Condition.visible, Duration.ofMillis(15000));
        return this;
    }

    @Step("Product color check")
    public Cartpage_steps colorcheck() {
        itemcolor.shouldBe(Condition.visible);
        return this;
    }

    @Step("Product code check")
    public Cartpage_steps codecheck() {
        itemcode.shouldBe(Condition.visible);
        return this;
    }

    @Step("Product number check")
    public Cartpage_steps numcheck() {
        itemnum.shouldBe(Condition.visible);
        return this;
    }

    @Step("Product price check")
    public Cartpage_steps pricecheck() {
        itemprice.shouldBe(Condition.visible);
        return this;
    }

    @Step("Product total price check")
    public Cartpage_steps sumpricecheck() {
        itemsumprice.shouldBe(Condition.visible);
        return this;
    }

    @Step("Product total price check")
    public Cartpage_steps numbergrow() {
        float i = Float.parseFloat(itemsumprice.getText()), b;
        increasebtn.click();
        b = Float.parseFloat(itemsumprice.getText());
        Assert.assertEquals(b, i * 2, "Check if total prize has grown twice");
        return this;
    }
    @Step("Product total price check")
    public Cartpage_steps numberdecrease() {
        float i = Float.parseFloat(itemsumprice.getText()), b;
        increasebtn.click();
        decreasebtn.click();
        b = Float.parseFloat(itemsumprice.getText());
        Assert.assertEquals(b, i, "Check if total prize has grown twice");
        return this;
    }
    @Step("Delete product")
    public Cartpage_steps deleteproduct() {
        deleteproduct.click();
        itemname.shouldNotBe(Condition.visible,Duration.ofMillis(5000));
        return this;
    }
    @Step("Delete  2 product")
    public Cartpage_steps delete2product() {
        deleteallproducts.click();
        itemname.shouldNotBe(Condition.visible,Duration.ofMillis(5000));
        itemname2.shouldNotBe(Condition.visible,Duration.ofMillis(5000));
        return this;
    }
    @Step("Delete  2 product and check tect")
    public Cartpage_steps delete2productchecktxt() {
        deleteallproducts.click();
        cartempty.shouldBe(Condition.visible,Duration.ofMillis(50000));
        return this;
    }
    @Step("Delete  2 product and check continue btn ")
    public Cartpage_steps delete2productcheckcontinuebtn() {
        deleteallproducts.click();
        continuebtn.shouldNotBe(Condition.visible,Duration.ofMillis(50000));
        return this;
    }
    @Step("Delete  2 product and check delete products btn ")
    public Cartpage_steps delete2productcheckdeletebtn() {
        deleteallproducts.click();
        deleteallproducts.shouldNotBe(Condition.visible,Duration.ofMillis(50000));
        return this;
    }
    @Step("Continue button click ")
    public Cartpage_steps continuebtnclick() {
        continuebtn.click();
        return this;
    }
}