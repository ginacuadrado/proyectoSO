
package Models;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainCook extends Thread {
    
    private Table table;                  //Table on which plates will be set
    private int time;                     //Time it takes to produce a dish
    private boolean hire;                 //Indicator whether a cook is hired or not
    private Semaphore SemME, SemMC, SemW; //Mutual Exclusivity, Main Cook and Waiter Semaphores
    private int id;
    
//CLASS CONSTRUCTOR
public MainCook(Table table, int time, Semaphore SemME, Semaphore SemMC, Semaphore SemW)
{
    this.table = table;
    this.time = time;
    this.hire = false;
    this.SemME = SemME;
    this.SemMC = SemMC;
    this.SemW = SemW;
}

//GETTER AND SETTER FOR COOK STATUS
    public boolean isHire() {
        return hire;
    }

    public void setHire(boolean hire) {
        this.hire = hire;
    }
    
    public int getID(){
        return this.id;
    }
    
    public void setID(int i){
        this.id = i;
    }

//DEFINITION OF THREAD RUN METHOD
    @Override
    public void run(){
       while(this.hire){
            try{
                this.SemMC.acquire();
                
                //Wait the set amount of time before producing a plate
                Thread.sleep(this.time);
                
                //Making sure to have ME when setting a plate on the table
                this.SemME.acquire();
                
                //Setting a plate on th table
                this.table.setPlate(Restaurant.inMain, 1);
                Restaurant.inMain = (Restaurant.inMain + 1) % this.table.getMax();
                Restaurant.addMain();
                
                this.SemW.release();
                this.SemME.release();
                
                //If a main cook is fired, reflect this after the finish the last main dish they started producing
                if(!this.hire){
                    Restaurant.displayMCook--;
                }
            } catch(InterruptedException ex) {
                Logger.getLogger(MainCook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
