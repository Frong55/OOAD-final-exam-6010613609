/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frong
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String username ="sawasdee";
                String password ="iloveyou";
                        boolean bed = true;
                                boolean wifi = true;
                                        int guessNum = 2;
                                                int startDate = 5;
                                                        int endDate = 6;
        Facade aClient = new Facade(username,password,bed,wifi,guessNum,startDate,endDate);
    }
    
}
