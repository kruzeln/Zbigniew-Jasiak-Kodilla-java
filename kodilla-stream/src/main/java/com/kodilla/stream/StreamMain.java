package com.kodilla.stream;

import com.kodilla.stream.beautifier.Decorator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumberGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
            /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

            System.out.println("Calcul;ating expressions with lambdas");
            expressionExecutor.executeExpression(10, 5, (a,b) -> a + b);
            expressionExecutor.executeExpression(10, 5, (a,b) -> a - b);
            expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
            expressionExecutor.executeExpression(10, 5, (a,b) -> a / b);

            System.out.println("Calculating expressions with method references");

            expressionExecutor.executeExpression(3,4,FunctionalCalculator::multiplyAByB);
            expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
            expressionExecutor.executeExpression(3,4,FunctionalCalculator::subBFromA);
            expressionExecutor.executeExpression(3,4,FunctionalCalculator::divideAByB);

        }*/
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Example text: ", Decorator::ABC);
        poemBeautifier.beautify("Example text.",
                (stringToBeautify)->stringToBeautify.toUpperCase());
        poemBeautifier.beautify("Example text.",
                (stringToBeautify) ->stringToBeautify.toLowerCase());
        poemBeautifier.beautify("Example text.",Decorator::addTreeeDots);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumberGenerator.generateEven(20);
    }
}

