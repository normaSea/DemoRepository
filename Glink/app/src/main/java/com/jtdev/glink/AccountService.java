package com.jtdev.glink;

import android.widget.EditText;
import android.widget.Toast;

public class AccountService  {
    String []UserList = {"johndoe123@example.com","alice.smith89@testmail.com"
            ,"davidbrown55@fakemail.net","emily.jones22@example.org"
            ,"mike.wilson76@fictitious.com",};
    String []PassList =  {"P@ssw0rd123","SecureP@ss!","Brownie#2023"
            ,"J0nesEms!","Wils0nM1ke#"};
    int UserIndex, PassIndex;
    public boolean LogIn(String username, String password){
        String user = "venlangm4p4gm4h4l";
        String pass = "123452678";

        if(username.equals(user) && password.equals(pass)) {
            return true;
        }
        return false;
    }
    //Function that Check the credential of the USER INPUT
    public boolean UserCredentialChecker(String Username, String Password){

        for (String x: UserList) {
            if(x.equals(Username)){
                for(String z: PassList) {
                    if (z.equals(Password)) {
                        for(int i = 0; i < UserList.length; i++){
                            if(UserList[i].equals(Username)){
                                UserIndex = i;
                                break;
                            }
                        }
                        for(int i = 0; i < UserList.length; i++){
                            if(PassList[i].equals(Password)){
                                PassIndex = i;
                                break;
                            }
                        }
                        //Toast
                        return UserIndex == PassIndex;
                    }
                }
            }
        }
        return false;
    }
    //It checks if Email already in the database
    public boolean EmailChecker(String UserName){

        for (String email:UserList) {
            if(UserName.equals(email)){
                return true;
            }
        }
        return false;
    }
    public boolean ValidAgeChecker(int Age){
        return Age < 16;
    }


}
