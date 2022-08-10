package org.apple;

public class RottenAppleException extends Exception{
    public RottenAppleException(int days) {
     super("Your Apple has been left out for " + days + " now it's rotten");
    }

}

