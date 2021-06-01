
import Login.Login;
import booking.Booking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frong
 */
public class Facade {
    private Login login;
    private Booking booking;
    public Facade(String username,String password,boolean b,boolean w,int g,int s,int e){
        login = new Login(username,password);
        booking = new Booking(b,w,g,s,e);
    }
   
    public void clientLogin(){
        login.check();
    }
    public void getBook(){
        booking.calculateCost();
    }
    public void clientPay(){
        
    }
  
    public void getdoPay(){
        
    }
    public void setPay(){
        
    }
}
