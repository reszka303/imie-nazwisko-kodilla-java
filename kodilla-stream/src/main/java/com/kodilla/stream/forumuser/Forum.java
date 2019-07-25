package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum() {
        listOfForumUsers.add(new ForumUser(0001, "Rudy Guenther", 'M', LocalDate.of(2000,2,6),15));
        listOfForumUsers.add(new ForumUser(0002, "Ardella Walkowiak", 'F', LocalDate.of(1985, 8, 13), 120));
        listOfForumUsers.add(new ForumUser(0003, "Terry Carbonell", 'M', LocalDate.of(1975, 3, 19), 44));
        listOfForumUsers.add(new ForumUser(0004, "Susy Byard", 'F', LocalDate.of(1967, 12, 30), 5));
        listOfForumUsers.add(new ForumUser(0005, "Coleman Bucko", 'M', LocalDate.of(1954, 4, 9), 0));
        listOfForumUsers.add(new ForumUser(0006, "Clorinda Dominick", 'F', LocalDate.of(2004, 10, 14), 11));
    }
        public List<ForumUser> getList() {
            return new ArrayList<>(listOfForumUsers);
    }
}
