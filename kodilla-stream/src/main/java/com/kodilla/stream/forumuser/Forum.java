package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<Forumuser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new Forumuser(1, "one", 'M',
                LocalDate.of(1975, 5, 15), 5));
        forumUserList.add(new Forumuser(2, "Two", 'F',
                LocalDate.of(1977, 7, 14), 0));
        forumUserList.add(new Forumuser(3, "Tree", 'F',
                LocalDate.of(1990, 1,5), 15));
        forumUserList.add(new Forumuser(4, "Four", 'M',
                LocalDate.of(1957, 12, 25), 10));
        forumUserList.add(new Forumuser(5, "Five", 'M',
                LocalDate.of(1988, 7, 7), 0));
        forumUserList.add(new Forumuser(6, "Six", 'M',
                LocalDate.of(2000, 3, 7), 3));
        forumUserList.add(new Forumuser(7,"Seven", 'F',
                LocalDate.of(2002, 7, 6), 7));

    }
    public List<Forumuser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}
