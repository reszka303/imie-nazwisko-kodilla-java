package com.kodilla.good.patterns.allegro;

public class InformationServiceImpl implements InformationService {
    public void informUserAboutOrder(User user) {
        System.out.println("Sending SMS to: " + user.getName() + " " + user.getLastName());
    }
}
