package com.example.demo;


import java.time.LocalDate;

public class ToDo {

    private String title;
    private String description;
    private LocalDate dueDate;
    private String category;
    private Integer priority;

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }



    public ToDo (String title, String description,LocalDate dueDate,String  category,Integer priority) {

        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.category = category;
        this.priority = priority;

    }


}
