package com.demo;

public class HelloJenkins {
    public static String greet() {
        return "Hello from Jenkins Pipeline!";
    }

    public static void main(String[] args) {
        System.out.println(greet());
    }
}
