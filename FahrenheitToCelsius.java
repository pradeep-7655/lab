package secondlab;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit = 55;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}

