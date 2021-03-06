
package Controllers;
import Models.Restaurant;
import Views.InitialView;


public class ViewController extends Thread
{
    private boolean active;
    private InitialView view;
        
    
    public ViewController(InitialView view)
    {
        this.active=true;
        this.view= view;
    }
  
public void run()
{
        while(this.active)
        {
            this.view.getNumberACooks().setText(Integer.toString(this.view.res.getCountACook()));
            this.view.getNumberDCooks().setText(Integer.toString(this.view.res.getCountDCook()));
            this.view.getNumberMCooks().setText(Integer.toString(this.view.res.getCountMCook()));
            this.view.getNumberWaiters().setText(Integer.toString(this.view.res.getCountWaiter()));
            this.view.getNumberADishes().setText(Integer.toString(Restaurant.aCount));
            this.view.getNumberMDishes().setText(Integer.toString(Restaurant.mCount));
            this.view.getNumberDDishes().setText(Integer.toString(Restaurant.dCount));
            this.view.getNumberOrders().setText(Integer.toString(Restaurant.orderCount));
            this.view.getHourScale().setText("1 HOUR LASTS " + Integer.toString(Restaurant.hourSeconds) + " SECONDS");
            this.view.getDayHours().setText(Integer.toString(Restaurant.countdown) + " HOURS");
            this.view.getChiefStatus().setText(this.view.res.getChief().getStatus());
            this.view.getManagerStatus().setText(this.view.res.getManager().getStatus());
            this.view.getEarning().setText("TOTAL EARNINGS: $" + Restaurant.sales);
            this.view.getDays().setText("DAYS PASSED: " + Integer.toString(this.view.res.getDay()));
            this.view.getMessageBox().setText(this.view.res.Message());
            this.view.getTotal().setText("TOTAL ORDERS: " + Integer.toString(this.view.res.getTotal()));
            this.view.getNote().setText("NOTE: Each order has a value of $" + Restaurant.price);
        }
    }          
}
