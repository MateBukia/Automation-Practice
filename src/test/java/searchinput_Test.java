import Pageobject.Homepage;
import Pageobject.Productspage;
import Stepobject.Homepage_steps;
import Stepobject.Productpage_steps;
import Utils.Chromerunner;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Dataobject.Homepage_Data.invalidsearchproduct;
import static Dataobject.Homepage_Data.searchproduct;

public class searchinput_Test extends Chromerunner {
    Homepage_steps Homepage_steps = new Homepage_steps();
    Homepage Homepage = new Homepage();
    Productpage_steps Productpage_steps = new Productpage_steps();
    Productspage Productspage = new Productspage();
    @Test
    @Description("case 1:საძიებო ღილაკზე დაკლიკებით უნდა გამოვიდეს ჩასაწერი ველი")
    public void searchbuttonaction(){
        Homepage_steps.searchclick()
                .searchvisible();
        Assert.assertTrue(Homepage.search.isDisplayed(),"search is visible");
    }
    @Test
    @Description("case 2:საძიებო ველში სწორი მონაცემებით ძებნა დაბრუნებული მონაცემების სახელებში უნდა იყოს ძებნისას გადაცემული სიტყვა")
    public void searchentervalue(){
        Homepage_steps.searchclick()
                .sendvalue(searchproduct)
                .searchitem();
        Productpage_steps.checkname(searchproduct);
        Assert.assertTrue(Productspage.searchtitle.isDisplayed(),"Search product is visible");

    }
    @Test
    @Description("case 3:საძიებო ველში არასწორი მონაცემებით ძებნა უნდა გამოიტანოს შედეგი ტექსტით: \"საძიებო სიტყვა 'satesto' ვერაფერი მოიძებნა\"")
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
}
