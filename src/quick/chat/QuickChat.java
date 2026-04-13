/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quick.chat;

import java.util.Scanner;
/**
 *
 * @author Student
 */
public class QuickChat {
    class quickChat{
        String Storedusername;
        String Storedpassword;
        String storedcellphone;
        Scanner inputuser =new Scanner (System.in);
        
        // boolean to check username
        boolean Checkuserename (String username){
            if(username.contains("_") && username.length()==5){return true;
        }else{
                System.out.println("username not correctly formatted"); 
                return false;
               
            }
    }
        // boolean to check password
        boolean checkpassword ( String password){
            if (password.contains ("Aphelele_@18")){
            return true;
        }else{
                System.out.println("Password is incorrect.");
                return false;
               
            }
        }
        // boolean to check cellphone
        boolean checkcellphone(string cellphone){
            if (cellphone.length()=10 && cellphone.contains("+27")){
            return true;
            }else{
                System.out.println(" cell phone number incorrectly formatted or does not contain international code");
                return false;
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
          
           
            
            
}
