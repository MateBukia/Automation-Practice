import Dataobject.Legalpage_Data;
import Pageobject.Legalpage;
import Stepobject.*;
import Stepobject.Legalpage_steps;
import Utils.Chromerunner;
import io.qameta.allure.Description;
import methods.mymethod_a;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Dataobject.Legalpage_Data.*;

public class Legalpage_Test extends Chromerunner {
    Cartpage_steps Cartpage_steps = new Cartpage_steps();
    methods.mymethod_a mymethod_a = new mymethod_a();
    Stepobject.Legalpage_steps Legalpage_steps = new Legalpage_steps();
    Pageobject.Legalpage Legalpage = new Legalpage();

    @Test
    @Description("case 18:კალათაში პროდუქტის დამატების შემდეგ გაგრძელება ღილაკზე დაჭერით უნდა გამოვიდეს ორი ფორმა \"იურიდიული პირები\" და \"ფიზიკური პირები\"")
    public void continuetolegalpage(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.checkforforms();
        Assert.assertTrue(Legalpage.pis.isDisplayed(),"Pis form is displayed");
        Assert.assertTrue(Legalpage.iur.isDisplayed(),"Pis form is displayed");
    }
    @Test
    @Description("case 19:უნდა გაწითლდეს ველი \"კომპანიის სახელწოდება\"")
    public void checkforcompanycolor(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkcompanynamecolor(Red);
        Assert.assertEquals(Legalpage.companyname.getCssValue("border-color"),Red,"Check if company name border is red");
    }
    @Test
    @Description("case 20:უნდა გაწითლდეს ველი \"საიდენტიფიკაციო კოდი\"")
    public void checkforidentificationcodecolor(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkidentificationcodecolor(Red);
        Assert.assertEquals(Legalpage.identificationcode.getCssValue("border-color"),Red,"Check if identification code border is red");
    }
    @Test
    @Description("case 21:უნდა გაწითლდეს ველი \"ფაქტიური მისამართი\"")
    public void checkforaddresslegalcolor(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkaddresslegalcolor(Red);
        Assert.assertEquals(Legalpage.addresslegal.getCssValue("border-color"),Red,"Check if legal address border is red");
    }
    @Test
    @Description("case 22:უნდა გაწითლდეს ველი \"საკონტაქტო ნომერი\"")
    public void checkforcontactphonecolor(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkcontactphonecolor(Red);
        Assert.assertEquals(Legalpage.contactphone.getCssValue("border-color"),Red,"Check if contact phone border is red");
    }
    @Test
    @Description("case 23:უნდა გაწითლდეს ველი \"როდის გსურთ შეკვეთის მიღება?\"")
    public void checkfordatewhencolor(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkdatewhencolor(Red);
        Assert.assertEquals(Legalpage.datewhen.getCssValue("border-color"),Red,"Check if when date border is red");
    }
    @Test
    @Description("case 24:უნდა გაწითლდეს ველი \"ელ.ფოსტა\"")
    public void checkforcheckemailcolorcolor(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkemailcolor(Red);
        Assert.assertEquals(Legalpage.email.getCssValue("border-color"),Red,"Check if email border is red");
    }
    @Test
    @Description("case 25:ველი აღარ უნდა იყოს წითელი")
    public void checkforcompanynamecolordissapear(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick();
        Legalpage_steps.checkcompanynamecolordissapear(mycopmanyname,Red);
        Assert.assertNotEquals(Legalpage.companyname.getCssValue("border-color"),Red,"Check if company name border is not red");
    }
    @Test
    @Description("case 26:არ უნდა ჩაიწეროს ველში მნიშვნელობა")
    public void checkforinvalididentificatiocode(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.checkinvalididentificatiocode(Invalididentification);
        Assert.assertNotEquals(Legalpage.identificationcode.getValue(),Invalididentification,"Check if invalid identification code is not set");
    }
    @Test
    @Description("case 27:უნდა გაწითლდეს ველი \"საიდენტიფიკაციო კოდი\"")
    public void checkforinvalididentificatiodigit(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.checkInvalid8digitidentification(Invalid8digitidentification,Red);
        Assert.assertEquals(Legalpage.identificationcode.getCssValue("border-color"),Red,"Check if identification code border is red");
    }
    @Test
    @Description("case 28:ველში მაინც უნდა ჩაიწეროს 9 სიმბოლო")
    public void checkforInvalid10digitidentification(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.checkInvalid10digitidentification(Invalid10digitidentification);
        Assert.assertEquals(Legalpage.identificationcode.getValue(),Valid9digitidentification,"Check if 9 digits were sent ");
    }
    @Test
    @Description("case 29:ველი აღარ უნდა იყოს წითელი")
    public void checkforValid9digitidentification(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkValid9digitidentification(Valid9digitidentification,Red);
        Assert.assertNotEquals(Legalpage.identificationcode.getCssValue("border-color"),Red,"Check if identification code border is red ");
    }
    @Test
    @Description("case 30:ველი აღარ უნდა იყოს წითელი")
    public void checkforValidlegaladdress(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkValidlegaladdress(ValidLegaladdress,Red);
        Assert.assertNotEquals(Legalpage.addresslegal.getCssValue("border-color"),Red,"Check if legal address border is red ");
    }
    @Test
    @Description("case 31:არ უნდა ჩაიწეროს ველში მნიშვნელობა")
    public void checkforinvalidphone(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.checkinvalidphone(Invalidphone);
        Assert.assertNotEquals(Legalpage.contactphone.getValue(),Invalidphone,"Check if contact phone is empty ");
    }
    @Test
    @Description("case 32:უნდა გაწითლდეს ველი \"საკონტაქტო ნომერი\"")
    public void checkforinvalidinvalidphonne8digit(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.checkinvalidphonne8digit(phonne8digit,Red);
        Assert.assertEquals(Legalpage.contactphone.getCssValue("border-color"),Red,"Check if contact phone border is red");
    }
    @Test
    @Description("case 33:ველში მაინც უნდა ჩაიწეროს 9 სიმბოლო")
    public void checkforinvalidphone12digit(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.checkinvalidphone12digit(phone12digit,phone9digit);
        Assert.assertEquals(Legalpage.contactphone.getValue(),phone9digit,"Check if contact phone is set to 9 digit ");
    }
    @Test
    @Description("case 34:ველი აღარ უნდა იყოს წითელი")
    public void checkforvalidphone9digit(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                        .checkvalidphone9digit(phone9digit,Red);
        Assert.assertNotEquals(Legalpage.contactphone.getCssValue("border-color"),Red,"Check if contact phone border is not red");
    }
    @Test
    @Description("case 35:ველი \"როდის გსურთ შეკვეთის მიღება?\" უნდა დარჩეს წითელი")
    public void checkforInvaliddateinput(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkInvaliddateinput(Invaliddateinput,Red);
        Assert.assertEquals(Legalpage.datewhen.getCssValue("border-color"),Red,"Check if date border is  red");
    }
    @Test
    @Description("case 36:ველი აღარ უნდა იყოს წითელი")
    public void checkforvaliddateinput(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkvaliddateinput(Validdateinput,Red);
        Assert.assertNotEquals(Legalpage.datewhen.getCssValue("border-color"),Red,"Check if date border is not red");
    }
    @Test
    @Description("case 37:ველი აღარ უნდა იყოს წითელი")
    public void checkforvalidemailinput(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkValidemailinput(Validemail,Red);
        Assert.assertNotEquals(Legalpage.email.getCssValue("border-color"),Red,"Check if email border is not red");

    }
    @Test
    @Description("case 38:ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი")
    public void checkforinvalidemail1input(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkInvalidemail1input(Invalidemail1,Red);
        Assert.assertEquals(Legalpage.email.getCssValue("border-color"),Red,"Check if email border is  red");
    }
    @Test
    @Description("case 39:ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი")
    public void checkforinvalidemail2input(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkInvalidemail2input(Invalidemail2,Red);
        Assert.assertEquals(Legalpage.email.getCssValue("border-color"),Red,"Check if email border is  red");
    }
    @Test
    @Description("case 40:ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი")
    public void checkforinvalidemail3input(){
        mymethod_a.mymethodcontinue();
        Legalpage_steps.sendbtnclick()
                .checkInvalidemail3input(Invalidemail3,Red);
        Assert.assertEquals(Legalpage.email.getCssValue("border-color"),Red,"Check if email border is  red");
    }
}

