package Stepobject;

import Pageobject.Legalpage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class Legalpage_steps extends Legalpage {
    @Step("Check for iur adn pis forms visible")
    public Legalpage_steps checkforforms() {
        pis.shouldBe(Condition.visible, Duration.ofMillis(5000));
        iur.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }

    @Step("Click send button")
    public Legalpage_steps sendbtnclick() {
        sendbtn.click();
        return this;
    }

    @Step("Check company name color:{Red}")
    public Legalpage_steps checkcompanynamecolor(String Red) {
        companyname.shouldHave(Condition.cssValue("border-color", Red));
        return this;
    }

    @Step("Check identification code color:{Red}")
    public Legalpage_steps checkidentificationcodecolor(String Red) {
        identificationcode.shouldHave(Condition.cssValue("border-color", Red));
        return this;
    }

    @Step("Check address legal color:{Red}")
    public Legalpage_steps checkaddresslegalcolor(String Red) {
        addresslegal.shouldHave(Condition.cssValue("border-color", Red));
        return this;
    }

    @Step("Check contact phone color:{Red}")
    public Legalpage_steps checkcontactphonecolor(String Red) {
        contactphone.shouldHave(Condition.cssValue("border-color", Red));
        return this;
    }

    @Step("Check date when color:{Red}")
    public Legalpage_steps checkdatewhencolor(String Red) {
        datewhen.shouldHave(Condition.cssValue("border-color", Red));
        return this;
    }

    @Step("Check email color:{Red}")
    public Legalpage_steps checkemailcolor(String Red) {
        email.shouldHave(Condition.cssValue("border-color", Red));
        return this;
    }

    @Step("Check email color:{Red}, disappear after input{mycompanyname}")
    public Legalpage_steps checkcompanynamecolordissapear(String mycompanyname, String Red) {
        companyname.setValue(mycompanyname);
        sendbtn.click();
        companyname.shouldNotHave(Condition.cssValue("border-color", Red));
        return this;
    }

    @Step("Set invalid value:{Invalididentification}")
    public Legalpage_steps checkinvalididentificatiocode(String Invalididentification) {
        identificationcode.setValue(Invalididentification);
        identificationcode.shouldBe(Condition.empty);
        return this;
    }

    @Step("Set invalid 8 digit value:{Invalid8digitidentification}")
    public Legalpage_steps checkInvalid8digitidentification(String Invalid8digitidentification, String Red) {
        identificationcode.setValue(Invalid8digitidentification);
        sendbtn.click();
        identificationcode.shouldHave(Condition.cssValue("border-color", Red));
        return this;
    }

    @Step("Set invalid 10 digit value:{Invalid10digitidentification}")
    public Legalpage_steps checkInvalid10digitidentification(String Invalid10digitidentification) {
        identificationcode.setValue(Invalid10digitidentification);
        return this;
    }

    @Step("Set valid 9 digit value:{Valid9digitidentification}")
    public Legalpage_steps checkValid9digitidentification(String Valid9digitidentification, String Red) {
        identificationcode.setValue(Valid9digitidentification);
        sendbtn.click();
        identificationcode.shouldNotHave(Condition.cssValue("border-color", Red));
        return this;
    }

    @Step("Set valid legal address value:{Invalid10digitidentification}")
    public Legalpage_steps checkValidlegaladdress(String ValidLegaladdress, String Red) {
        addresslegal.setValue(ValidLegaladdress);
        sendbtn.click();
        addresslegal.shouldNotHave(Condition.cssValue("border-color", Red));
        return this;
    }

    @Step("Set invalid contact phone:{Invalidphone}")
    public Legalpage_steps checkinvalidphone(String Invalidphone) {
        contactphone.setValue(Invalidphone);
        contactphone.getValue().isEmpty();
        return this;
    }
    @Step("Set invalid contact phone:{phonne8digit}")
    public Legalpage_steps checkinvalidphonne8digit(String phonne8digit, String Red) {
        contactphone.setValue(phonne8digit);
        sendbtn.click();
        contactphone.shouldHave(Condition.cssValue("border-color", Red));
        return this;
    }
    @Step("Set invalid contact phone:{phone12digit}")
    public Legalpage_steps checkinvalidphone12digit(String phone12digit,String phone9digit) {
        contactphone.setValue(phone12digit);
        contactphone.getText().matches(phone9digit);
        return this;
    }
    @Step("Set valid contact phone:{phone9digit}")
    public Legalpage_steps checkvalidphone9digit(String phone9digit,String Red) {
        contactphone.setValue(phone9digit);
        sendbtn.click();
        contactphone.shouldNotHave(Condition.cssValue("border-color", Red));
        return this;
    }
    @Step("Set invalid date:{Invaliddateinput}")
    public Legalpage_steps checkInvaliddateinput(String Invaliddateinput,String Red) {
        datewhen.setValue(Invaliddateinput);
        sendbtn.click();
        datewhen.shouldHave(Condition.cssValue("border-color", Red));
        return this;
    }
    @Step("Set invalid date:{Validdateinput}")
    public Legalpage_steps checkvaliddateinput(String Validdateinput,String Red) {
        datewhen.setValue(Validdateinput);
        sendbtn.click();
        datewhen.shouldNotHave(Condition.cssValue("border-color", Red));
        return this;
    }
    @Step("Set invalid date:{Validdateinput}")
    public Legalpage_steps checkValidemailinput(String Validemail,String Red) {
        email.setValue(Validemail);
        sendbtn.click();
        email.shouldNotHave(Condition.cssValue("border-color", Red));
        return this;
    }
    @Step("Set invalid date:{Invalidemail1}")
    public Legalpage_steps checkInvalidemail1input(String Invalidemail1,String Red) {
        email.setValue(Invalidemail1);
        sendbtn.click();
        return this;
    }
    @Step("Set invalid date:{Invalidemail2}")
    public Legalpage_steps checkInvalidemail2input(String Invalidemail2,String Red) {
        email.setValue(Invalidemail2);
        sendbtn.click();
        return this;
    }
    @Step("Set invalid date:{Invalidemail3}")
    public Legalpage_steps checkInvalidemail3input(String Invalidemail3,String Red) {
        email.setValue(Invalidemail3);
        sendbtn.click();
        return this;
    }
}