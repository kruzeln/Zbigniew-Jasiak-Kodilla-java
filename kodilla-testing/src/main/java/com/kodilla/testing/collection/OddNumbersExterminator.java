package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList exterminate(ArrayList<Integer> number){
       ArrayList<Integer> oddList = new ArrayList<Integer>();

       for(Integer tymczList : number) {

           if (tymczList % 2 == 0) {
               oddList.add(tymczList);
           }

       }
       return oddList;
    }
}
