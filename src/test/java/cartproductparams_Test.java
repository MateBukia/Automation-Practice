import Stepobject.Cartpage_steps;
import Stepobject.Homepage_steps;
import Stepobject.Productpage_steps;
import Utils.Chromerunner;
import io.qameta.allure.Description;
import methods.mymethod_a;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cartproductparams_Test extends Chromerunner {
    Stepobject.Homepage_steps Homepage_steps = new Homepage_steps();
    Stepobject.Productpage_steps Productpage_steps = new Productpage_steps();
    Stepobject.Cartpage_steps Cartpage_steps = new Cartpage_steps();
    mymethod_a mymethod_a = new mymethod_a();

    @Test
    @Description("case 5:პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის დასახელება")
    public void checkproductname() {
        mymethod_a.mymethod();
        Cartpage_steps.namecheck();
        Assert.assertTrue(Cartpage_steps.itemname.isDisplayed(), "Check for item name");
    }

    @Test
    @Description("case 6:პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის ფერი")
    public void checkproductcolor() {
        mymethod_a.mymethod();
        Cartpage_steps.colorcheck();
        Assert.assertTrue(Cartpage_steps.itemcolor.isDisplayed(), "Check for item color");
    }

    @Test
    @Description("case 7:პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის კოდი")
    public void checkproductcode() {
        mymethod_a.mymethod();
        Cartpage_steps.codecheck();
        Assert.assertTrue(Cartpage_steps.itemcode.isDisplayed(), "Check for item code");
    }

    @Test
    @Description("case 8:პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის რაოდენობა")
    public void checkproductnumber() {
        mymethod_a.mymethod();
        Cartpage_steps.numcheck();
        Assert.assertTrue(Cartpage_steps.itemnum.isDisplayed(), "Check for item number");
    }

    @Test
    @Description("case 9:პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის ფასი")
    public void checkproductprice() {
        mymethod_a.mymethod();
        Cartpage_steps.pricecheck();
        Assert.assertTrue(Cartpage_steps.itemprice.isDisplayed(), "Check for item price");
    }

    @Test
    @Description("case 10:პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის ჯამი")
    public void checkproducttotalprice() {
        mymethod_a.mymethod();
        Cartpage_steps.sumpricecheck();
        Assert.assertTrue(Cartpage_steps.itemsumprice.isDisplayed(), "Check for item total price");
    }
}

