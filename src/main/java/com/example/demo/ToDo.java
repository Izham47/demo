package com.example.demo;

import java.time.LocalDate;

public class ToDo {
    private String title;
    private String description;

    // PROBLEM WAS HERE: He likely had 'LocalDate dueDate;'
    // FIX: Change it to String
    private String dueDate;

    private String category;

    // He uses Integer for priority (1-5), so we keep it Integer
    private Integer priority;

    // CONSTRUCTOR
    public ToDo(String title, String description, LocalDate date, String category, Integer priority) {
        this.title = title;
        this.description = description;

        // CONVERT Date to String here
        this.dueDate = (date != null) ? date.toString() : "";

        this.category = category;
        this.priority = priority;
    }

    // GETTERS
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getDueDate() { return dueDate; }
    public String getCategory() { return category; }
    public Integer getPriority() { return priority; }
}