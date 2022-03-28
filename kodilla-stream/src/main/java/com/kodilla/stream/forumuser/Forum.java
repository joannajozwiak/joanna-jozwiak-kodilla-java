package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public  final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();
    public Forum() {
        theUserList.add(new ForumUser(1, "Damian", 'M', LocalDate.of(1997,01,16), 50));
        theUserList.add(new ForumUser(2, "Anna", 'F', LocalDate.of(1991,10,30),10));
        theUserList.add(new ForumUser(3, "Daniel", 'M', LocalDate.of(2004,01,16), 50));
        theUserList.add(new ForumUser(4, "Darek", 'M', LocalDate.of(1997,9,16), 0));
        theUserList.add(new ForumUser(5, "Dominika", 'F', LocalDate.of(2003,05,20), 50));
        theUserList.add(new ForumUser(6, "Dyzio", 'M', LocalDate.of(1956,01,16), 1000));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }
}
