package org.apple;

import java.util.Scanner;

public class SliceApple {
    public static void main(String[] args) {
        new SliceApple().listen();
    }

    private void listen() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("How many pieces do you want to slice your apple into?");

        int pieces = scanner.nextInt();

        System.out.println("Your Apple has been Sliced into " + pieces + " pieces");

    }
}

