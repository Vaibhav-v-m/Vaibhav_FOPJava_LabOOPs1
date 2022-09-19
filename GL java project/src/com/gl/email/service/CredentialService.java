package com.gl.email.service;

import com.gl.email.model.Employee;

import java.util.Random;

public class CredentialService {

    public char[] generatePassword(){

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCase = "!@#$%^&*()_+=";
        String bigString= upperCase+lowerCase+numbers+specialCase;


        Random random = new Random();
        char [] password = new char[8];
        for(int i=0;i<8;i++){
            password[i]= bigString.charAt(random.nextInt(bigString.length()));

        }
        return password;
    }

    public String generateEmailAddress(String firstName, String lastName, String department){

        return firstName+lastName+"@"+department+".gl.com";

    }

    public void showCredentials(Employee emp, String email, char[] password){

        System.out.println("Dear " +  emp.getFirstName() +" your generated credentials are as follows ");
        System.out.println("Email:" + email);
        String str = String.valueOf(password);
        System.out.println("Password:" + str);

    }



}
