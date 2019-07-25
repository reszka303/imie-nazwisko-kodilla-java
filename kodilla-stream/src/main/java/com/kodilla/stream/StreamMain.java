package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultListOfUser = theForum.getList().stream()
                .filter(ForumUser -> ForumUser.getSexOfUser() == 'M')
                .filter(ForumUser -> Period.between(ForumUser.getDateOfBorn(), LocalDate.now()).getYears() >= 20)
                .filter(ForumUser -> ForumUser.getQuantityOfPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueIDOfForumUser, ForumUser -> ForumUser));

        theResultListOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
