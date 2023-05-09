import Pageobject.Productspage;
import Stepobject.Cartpage_steps;
import Stepobject.Homepage_steps;
import Stepobject.Productpage_steps;
import Pageobject.Homepage;
import Utils.Chromerunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Dataobject.Homepage_Data.invalidsearchproduct;
import static Dataobject.Homepage_Data.searchproduct;

public class searchcheck_Test extends Chromerunner {
    Homepage_steps Homepage_steps = new Homepage_steps();
    Productpage_steps Productpage_steps = new Productpage_steps();
    Homepage Homepage = new Homepage();
    Productspage Productspage = new Productspage();
    Cartpage_steps Cartpage_steps = new Cartpage_steps();

   @Test
   @Description("case 1")
    public void searchbuttonaction(){
        Homepage_steps.searchclick()
                      .searchvisible();
       Assert.assertTrue(Homepage.search.isDisplayed(),"search is visible");
    }
    @Test
    @Description("case 2")
    public void searchentervalue(){
        Homepage_steps.searchclick()
                .sendvalue(searchproduct)
                .searchitem();
        Productpage_steps.checkname(searchproduct);
        Assert.assertTrue(Productspage.searchtitle.isDisplayed(),"Search product is visible");

    }
    @Test
    @Description("case 3")
    public void searchincalidtext(){
        Homepage_steps.searchclick()
                .sendinvalidvalue(invalidsearchproduct)
                .searchitem();
        Productpage_steps.errorcheck1()
                .errorcheck2()
                .errorcheck3();
        Assert.assertTrue(Productspage.errorline1.isDisplayed(),"Error text 1 is visible");
        Assert.assertTrue(Productspage.errorline3.isDisplayed(),"Error text 3 is visible");
        Assert.assertTrue(Productspage.errorline2.isDisplayed(),"Error text 2 is visible");
    }
    @Test
    @Description("case 4")
    public void addtocartaction(){
        Homepage_steps.searchclick()
                .sendvalue(searchproduct)
                .searchitem();
        Productpage_steps.addtocart()
                .checkmessage();
        Assert.assertTrue(Productspage.successadd.isDisplayed(),"Success message appears");
    }
    @Test
    @Description("case 5-10")
    public void enterthecart(){
        Homepage_steps.searchclick()
                .sendvalue(searchproduct)
                .searchitem();
        Productpage_steps.addtocart()
                .checkmessage()
                . cartclick();
        Cartpage_steps.namecheck()
                .colorcheck()
                .codecheck()
                .numcheck()
                .pricecheck()
                .sumpricecheck();
        Assert.assertTrue(Cartpage_steps.itemname.isDisplayed(),"Chech for item name");
        Assert.assertTrue(Cartpage_steps.itemcolor.isDisplayed(),"Chech for item color");
        Assert.assertTrue(Cartpage_steps.itemcode.isDisplayed(),"Chech for item code");
        Assert.assertTrue(Cartpage_steps.itemnum.isDisplayed(),"Chech for item number");
        Assert.assertTrue(Cartpage_steps.itemprice.isDisplayed(),"Chech for item price");
        Assert.assertTrue(Cartpage_steps.itemsumprice.isDisplayed(),"Chech for item totel price");
    }
}
