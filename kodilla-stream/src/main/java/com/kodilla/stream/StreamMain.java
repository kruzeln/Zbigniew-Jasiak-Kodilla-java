package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.Forumuser;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.LocalDate.now;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();

        String theResultsStringOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getNumbOfPosts() > 0)
                .filter(user -> user.getDateOfBirth().getYear() > 1998)
 //to chyba nie jest rozwiązanie optymalne, ale wynik zgodny
                .map(Forumuser::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultsStringOfUsers);



    }
}

