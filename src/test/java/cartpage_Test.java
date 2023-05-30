import Pageobject.Cartpage;
import Pageobject.Productspage;
import Stepobject.Cartpage_steps;
import Stepobject.Homepage_steps;
import Stepobject.Productpage_steps;
import Utils.Chromerunner;
import io.qameta.allure.Description;
import methods.mymethod_a;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Dataobject.Homepage_Data.searchproduct;

public class cartpage_Test extends Chromerunner {
    Stepobject.Homepage_steps Homepage_steps = new Homepage_steps();
    Stepobject.Productpage_steps Productpage_steps = new Productpage_steps();
    Pageobject.Productspage Productspage = new Productspage();
    methods.mymethod_a mymethod_a = new mymethod_a();
    Stepobject.Cartpage_steps Cartpage_steps = new Cartpage_steps();
    Pageobject.Cartpage Cartpage = new Cartpage();
    @Test
    @Description("case 4:კონკრეტული პროდუქტის კალათაში დამატების ღილაკზე დაჭერით უნდა გამოიტანოს შედეგი შეტყობინება: \"პროდუქტი წარმატებით დაემატა კალათაში\"")
    public void addtocartaction() {
        Homepage_steps.searchclick()
                .sendvalue(searchproduct)
                .searchitem();
        Productpage_steps.addtocart()
                .checkmessage();
        Assert.assertTrue(Productspage.successadd.isDisplayed(), "Success message appears");
    }

    @Test
    @Description("case 11:თუ გავზრდით კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა გაიზარდოს თითოეული ველის \"სულ\" მნიშვნელობა")
    public void productnumandpricgrow() {
        mymethod_a.mymethod();
        Cartpage_steps.numbergrow();
    }

    @Test
    @Description("case 12:თუ შევამცირებთ კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა შემცირდეს თითოეული ველის \"სულ\" მნიშვნელობა")
    public void productnumandpricedecrease() {
        mymethod_a.mymethod();
        Cartpage_steps.numberdecrease();
    }
    @Test
    @Description("case 13:შესაძლებელი უნდა იყოს კალათაში არსებული კონკრეტული პროდუქტის წაშლა, \"X\" ღილაკზე დაჭერით")
    public void deleteproductfromcart(){
        mymethod_a.mymethod();
        Cartpage_steps.deleteproduct();
        Assert.assertFalse(Cartpage_steps.itemname.isDisplayed(),"Product is deleted from cart");
    }
    @Test
    @Description("case 14:თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება")
    public void deleteallproductfromcart(){
        mymethod_a.mymethodadd2products();
        Cartpage_steps.delete2product();
        Assert.assertFalse(Cartpage_steps.itemname.isDisplayed(),"First product is deleted from cart");
        Assert.assertFalse(Cartpage_steps.itemname2.isDisplayed(),"Second product is deleted from cart");
    }
    @Test
    @Description("case 15:კალათის გასუფთავება ღილაკზე დაჭერით გამოდის ტექსტი კალათა ცარიელია")
    public void deleteallproductfromcarttochecktext(){
        mymethod_a.mymethodadd2products();
        Cartpage_steps.delete2productchecktxt();
        Assert.assertTrue(Cartpage.cartempty.isDisplayed(),"Cart empty message check");
    }
    @Test
    @Description("case 16:\"კალათის გასუფთავება\" ღილაკზე დაჭერით უნდა გაქრეს ღილაკი \"გაგრძელება\"")
    public void deleteallproductscontinuebtncheck(){
        mymethod_a.mymethodadd2products();
        Cartpage_steps.delete2productcheckcontinuebtn();
        Assert.assertFalse(Cartpage.continuebtn.isDisplayed(),"Continue message check");
    }
    @Test
    @Description("case 17:\"კალათის გასუფთავება\" ღილაკზე დაჭერით უნდა გაქრეს ღილაკი \"კალათის გასუფთავება\"")
    public void deleteallproductscontinuebk(){
        mymethod_a.mymethodadd2products();
        Cartpage_steps.delete2productcheckdeletebtn();
        Assert.assertFalse(Cartpage.continuebtn.isDisplayed(),"Product delete button  check");
    }
}
