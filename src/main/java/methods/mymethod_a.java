package methods;

import Stepobject.Cartpage_steps;
import Stepobject.Homepage_steps;
import Stepobject.Productpage_steps;

import static Dataobject.Homepage_Data.searchproduct;

public class mymethod_a {
    Stepobject.Homepage_steps Homepage_steps = new Homepage_steps();
    Stepobject.Productpage_steps Productpage_steps = new Productpage_steps();
    Stepobject.Cartpage_steps Cartpage_steps = new Cartpage_steps();
    public void mymethod() {
        Homepage_steps.searchclick()
                .sendvalue(searchproduct)
                .searchitem();
        Productpage_steps.addtocart()
                .checkmessage()
                .cartclick();
    }
    public void mymethodadd2products() {
        Homepage_steps.searchclick()
                .sendvalue(searchproduct)
                .searchitem();
        Productpage_steps.addtocart()
                .checkmessage()
                .addtocart2()
                .checkmessage()
                .cartclick();
    }
    public void mymethodcontinue(){
        Homepage_steps.searchclick()
                .sendvalue(searchproduct)
                .searchitem();
        Productpage_steps.addtocart()
                .checkmessage()
                .addtocart2()
                .checkmessage()
                .cartclick();
        Cartpage_steps.continuebtnclick();
    }
}


