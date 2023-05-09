package Pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class Cartpage {
    public SelenideElement
                            itemname = $(byAttribute("calss","item_title")),
                            itemcolor = $(byAttribute("class","choose_color")),
                            itemcode = $(byAttribute("class","item_id")),
                            itemnum = $(byAttribute("class","inputvalue cartQuantity166572")),
                            itemprice = $(byAttribute("class","prodPrice166572")),
                            itemsumprice = $(byAttribute("class","fullPriceFor prodSum166572"));
}
