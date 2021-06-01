package Login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frong
 */
public class NormalAccount extends UserAccount{
    
    private String username;
    public NormalAccount(String u){
        username = u;
    }
    public String getUsername(){
        return username;
    }
}
