package dev.marmo.app;

import io.javalin.Javalin;

public class App {

    static int counter = 0;

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        app.get("/add/{num1}/{num2}", context -> {
            int num1 = Integer.parseInt(context.pathParam("num1"));
            int num2 = Integer.parseInt(context.pathParam("num2"));
            System.out.println("Request number" + ++counter);
            context.result("the sum is " + (num1+num2));
        });

        app.start(7000);
    }
}
