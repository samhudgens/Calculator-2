package com.samhudgens;

import java.util.Scanner;

/**
 * Created by samhudgens on 5/20/16.
 */
public class UserInput {

    Scanner input = new Scanner(System.in);


    public double promptUserforDouble(String msg) {
        promptUser(msg);
        return input.nextDouble();
    }

    public int promptUserforInt(String msg) {
        promptUser(msg);
        return input.nextInt();
    }

    public void promptUser(String msg) {
        System.out.println(msg);
    }
}
