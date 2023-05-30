package Pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class Cartpage {
    public SelenideElement
                            itemname = $(byText("კალამი ბურთულიანი \"შნაიდერი / Schneider\" TOPS ლურჯი")),
                            itemname2 = $(byText("კალამი ტუშის \"შნაიდერი / Schneider\" ONE HYBRID C 0.5მმ ლურჯი")),
                            itemcolor = $(byAttribute("class","choose_color")),
                            itemcode = $(byAttribute("class","item_id")),
                            itemnum = $(byAttribute("name","quantity")),
                            itemprice = $(byAttribute("class","prod_price"),0),
                            itemsumprice = $(byXpath("/html/body/div[5]/div/div[3]/div[7]/div[2]/span[1]")),
                            increasebtn = $(byAttribute("class","fa fa-plus")),
                            decreasebtn = $(byAttribute("class","fa fa-minus")),
                            deleteproduct = $(byAttribute("class","fas fa-times")),
                            deleteallproducts = $(byAttribute("class","remove_carts"),1),
                            cartempty = $(byText("კალათა ცარიელია")),
                            continuebtn = $(byAttribute("class","continue"));
}
