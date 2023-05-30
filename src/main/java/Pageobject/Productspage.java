package Pageobject;

import com.codeborne.selenide.SelenideElement;

import static Dataobject.Homepage_Data.invalidsearchproduct;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Productspage {

    public SelenideElement
            errortext = $(byAttribute("class","color_text")),
            errorline1 = $(byText("საძიებო სიტყვა")),
            searchtitle = $(byAttribute("class","prod_title"),0),
            errorline3 = $(byText("'satesto'")),
            addtocart = $(byAttribute("onclick","updateCartItemColor(1435)")),
            addtocart2 = $(byAttribute("onclick","updateCartItemColor(1487)")),
            successadd = $(byText("პროდუქტი წარმატებით დაემატა კალათაში")),
            cart = $(byAttribute("class","cart_info")),
            errorline2 = $(byText("ვერაფერი მოიძებნა"));


}
