
package Models;

import java.util.concurrent.Semaphore;

public class DessertCook  extends Thread {
    
    private Table table;
    //private Semaphore sema1, sema2, sema3;
    private int time;
    private boolean hired;
    
    public DessertCook(Table table, int time, boolean hired, int type){
        this.table = table;
        this.time = time;
        this.hired = hired;
    }
    
    @Override 
        public void run(){
            while(this.hired){
                
                }
            }
        }

