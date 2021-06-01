/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageAndPromotion;

import booking.Booking;

/**
 *
 * @author Frong
 */
public class SummerPackage {
    //come 4 free 1
    Booking bookTrip;
    public SummerPackage(Booking i){
        
            bookTrip = i;
           
    }
    
    public double DiscountCost(){
         return bookTrip.calculateCost()-100;
    }
    
}
