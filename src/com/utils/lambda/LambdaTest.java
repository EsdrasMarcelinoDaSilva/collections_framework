package com.utils.lambda1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface CustomizedLambda{
    String execute(String text);
}

interface ICalc {
    double sum(double numberFirst, double numberSecond);
}

public class LambdaTest {
    public static void main(String[] args) {
        Runnable functionLambda = () -> {
            System.out.println("function Lambda");
        };
        functionLambda.run();

        CustomizedLambda customizedLambda = (String text) -> {
            return text;
        };
        System.out.println(customizedLambda.execute("Lambda function custom"));

        ICalc calc = (numberFirst, numberSecond) -> {
            return numberFirst + numberSecond;
        };
        System.out.println(calc.sum(32, 43.6));

        List<String> users = new ArrayList<String>(
                Arrays.asList("Esdras", "Emanuel", "Samuel", "Alice")
        );

        users.forEach((user) -> {
            System.out.println(user);
        });
    }
}
