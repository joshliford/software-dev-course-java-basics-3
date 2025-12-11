package org.example;

public class Main {
    public static void main(String[] args) {
        //JavaCafe javaCafe = new JavaCafe();
        //javaCafe.run();
        ConditionalExercises conditional = new ConditionalExercises();
        LoopExercises loops = new LoopExercises();


        System.out.println(conditional.lessThanFive(2));
        System.out.println(conditional.getAgeGroup(20));
        System.out.println(conditional.isValidPassword("pass"));

        System.out.println(loops.sum(4));
        System.out.println(loops.sumUntilEven(3));
    }
}