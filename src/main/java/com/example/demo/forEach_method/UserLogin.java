package com.example.demo.forEach_method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class UserLogin {

    public static void main(String[] args) {

        ArrayList<Login> myuserlogin = new ArrayList<Login>();
        myuserlogin.add(new Login("RAJAH ", "123"));
        myuserlogin.add(new Login("LANGAR", "102WW"));
        myuserlogin.add(new Login("AMIGOS", "MLK456PO"));
        myuserlogin.add(new Login("EMINOS", "BCV"));

        System.out.println("------- Use for loop ---------");
        for (Login login : myuserlogin) {

            System.out.print("User Name : " + login.UserName + "  ******   ");
            System.out.println("Password : " + login.Password);
        }

        //use iterator
        System.out.println();
        System.out.println("------- Use Iterator ---------");
        Iterator<Login> i = myuserlogin.iterator(); // prend le premier index de myuserlogin
        while (i.hasNext()) {
            Login userinfo = i.next(); //element of colletion
            System.out.print("User Name : " + userinfo.UserName + "  ******   ");
            System.out.println("Password : " + userinfo.Password);
        }


        //Use Lambda
        Predicate<Login> preRules = (p) -> p.StrongPassword() == true;
        //
        System.out.println();
        System.out.println("------- Use Lambda expression ---------");


        myuserlogin.forEach(user -> {
            if (preRules.test(user)) {
                System.out.print("User Name : " + user.UserName + "  ******   ");
                System.out.println("Password : " + user.Password);
            }
        });


    }
}
