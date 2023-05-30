package Pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class Legalpage {
    public SelenideElement
                            pis = $(By.id("pis")),
                            iur = $(By.id("iur")),
                            sendbtn = $(By.id("btn2")),
                            companyname = $(byAttribute("placeholder","კომპანიის სახელწოდება")),
                            identificationcode = $(byAttribute("placeholder","საიდენტიფიკაციო კოდი")),
                            addresslegal = $(byAttribute("placeholder","ფაქტიური მისამართი")),
                            contactphone = $(byAttribute("placeholder","საკონტაქტო ნომერი"),0),
                            datewhen = $(byAttribute("placeholder","როდის გსურთ შეკვეთის მიღება?"),0),
                            email = $(byAttribute("placeholder","ელ.ფოსტა"),0);


}
