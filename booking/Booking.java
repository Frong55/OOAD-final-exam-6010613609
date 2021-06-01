/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

/**
 *
 * @author Frong
 */
public class Booking {
    //bed
    private boolean bed;
    private boolean wifi;
    private int guessNum;
    private int startDate;
    private int endDate;
    public Booking(boolean b, boolean w, int g, int s, int e){
        bed=b;
        wifi=w;
        guessNum=g;
        startDate=s;
        endDate=e;
    }
    public boolean bed(){
        return bed;
    }
    public boolean wifi(){
        return wifi;
    }
    public int guessNum(){
        return guessNum;
    }
    public int startDate(){
        return startDate;
    }
    public int endDate(){
        return endDate;
    }
    public double calculateCost(){
        double cost = 0;
        if(bed == true) // small bed
            cost = cost+500;
        else    // big bed
            cost=cost+1000;
        
        if(wifi == true)
            cost=cost+100;
        
        for(int i=1; i<=guessNum; i++){
            cost = cost+100;
        }
           
        int dateNum = endDate-startDate;
        
        if(dateNum>1){
            cost = cost * (dateNum);
        }
        return cost;
    }
}
