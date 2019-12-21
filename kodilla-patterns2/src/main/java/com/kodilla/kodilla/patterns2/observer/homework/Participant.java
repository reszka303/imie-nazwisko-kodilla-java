package com.kodilla.kodilla.patterns2.observer.homework;

public class Participant implements ObserverMU {
    private final String participantMentorName;
    private int updateCount;

    public Participant(String participantName) {
        this.participantMentorName = participantName;
    }

    @Override
    public void update(ParticipantTasks participantTasks){
        System.out.println(participantMentorName + " : there's been added a new task for you to check: "
                + participantTasks.getTasks() + " in: " + participantTasks.getModule() + " by "
                + participantTasks.getUserCourseName() + "\n" +
                " (total: " + participantTasks.getTasks().size() + " to check in : "
                + participantTasks.getModule() +")");
        updateCount++;
    }

    public String getParticipantName() {
        return participantMentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
