package com.kodilla.testing.forum.statistics;
import java.util.List;

    //interfejs do pobierania danych mock
public interface Statistics {
    List<String> usersNames();
    int postCount();
    int commentsCount();
    
}
