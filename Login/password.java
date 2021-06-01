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
public class password extends Encode {
    private String encode;
    private String passwordBeforeEncode;
    public password (String p){
        passwordBeforeEncode = p;
    }
    public String getEncode(){
        encode = passWordAfterEncode(passwordBeforeEncode); // encode passwordBeforeEncode and put it in encode variable
        return encode;
    }
   
}
