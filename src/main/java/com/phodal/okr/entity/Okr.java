package com.phodal.okr.entity;

// class OKR {
//    -goal
//    -startDate: String
//    -endDate: String
//    -deadline
//    -priority
//    -progress
//    +setGoal()
//    +setDeadline()
//    +setPriority()
//    +setProgress()
//}
public class Okr {
    private String goal;
    private String startDate;
    private String endDate;
    private String deadline;
    private String priority;
    private String progress;

    public Okr(String goal, String startDate, String endDate, String deadline, String priority, String progress) {
        this.goal = goal;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deadline = deadline;
        this.priority = priority;
        this.progress = progress;
    }

    public Okr() {
    }

    public String getGoal() {
        return goal;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getPriority() {
        return priority;
    }

    public String getProgress() {
        return progress;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}
