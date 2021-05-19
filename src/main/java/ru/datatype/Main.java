package ru.datatype;


import java.util.Random;

public class Main {

    public static void main(String... args) {
        Random random = new Random();
        //Метод nextDouble() возвращает значения от 0.0d включительно до 1.0d исключительно
        double d = random.nextDouble();
        byte b = 127; // Максимальное значение для типа byte 127
        System.out.println(d);
        System.out.println(b);
    }

}
