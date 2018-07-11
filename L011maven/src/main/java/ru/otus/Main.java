package ru.otus;


import com.google.common.base.Preconditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final long EXIT_DELAY = TimeUnit.SECONDS.toMillis(3);

    public static void main(String[] args) throws IOException, InterruptedException {
        String name = null, surname = null, input = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your name and surname");

            System.out.println("Enter your name:");
            name = input = br.readLine();
            System.out.println("Enter your surname:");
            surname = input = br.readLine();
        }

        Preconditions.checkArgument(name.length() >= 1, "Name length should be greater or equals to 1!");
        Preconditions.checkArgument(surname.length() >= 1, "Surname length should be greater or equals to 1!");

        System.out.println(String.format("Have a good day %s %s!", name, surname));
        Thread.sleep(EXIT_DELAY);
    }
}
