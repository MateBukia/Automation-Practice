package Pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class Homepage {
    public SelenideElement
                           searchbutton = $(byAttribute("class","fas fa-search")),
                           search = $(byAttribute("name","search")),
                           searchclickbtn = $(byAttribute("class","fas fa-search"),1);
}
