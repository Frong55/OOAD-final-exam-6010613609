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
public class Login {
    //username or email
    //password -> can be normal password or anything
    String userName;
    String password;
    public Login(String u, String p){
        userName = u;
        password = p;
    }
    
    public boolean void check(){
        if(userName == getUsername(userName))  
            if(getEncodeOfPassword(password)== getEncode())  
                return true;//admit to access
    }
    
}
