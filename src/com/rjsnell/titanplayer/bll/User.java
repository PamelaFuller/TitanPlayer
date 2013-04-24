package com.rjsnell.titanplayer.bll;

import javax.swing.JOptionPane;

public class User {
   
    private String username;
    private String password;
    private String email;
    
    public User(String username, String password, String email) {
        
        String errorString = "";
        boolean validPassword = password.matches("^(?=.*?\\d)(?=.*?[a-zA-Z])(?=.*?[@#$%^&+=!]).*");
        boolean validEmail = email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$");
        
       if(validPassword && validEmail) {
            this.username = username;
            this.password = password;
            this.email = email;
        } else {
            if (!validPassword) {
                errorString += "Invalid Pasword \"" + password + "\"\n";
            }
            if (!validEmail) {
                errorString += "Invalid E-Mail \"" + email + "\"\n";
            }
            JOptionPane.showMessageDialog(null, errorString, "Input Error", JOptionPane.INFORMATION_MESSAGE);
        }
           
    }
    
    public String getUsername () {
        return username;
    }
        
}
