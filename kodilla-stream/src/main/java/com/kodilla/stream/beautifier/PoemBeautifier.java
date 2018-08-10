package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String stringToBeautify, PoemDecorator poemDecorator){
        System.out.println("Result: " + poemDecorator.decorate(stringToBeautify));
    }
}
