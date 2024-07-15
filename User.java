/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.workoutplanner;

/**
 *
 * @author USER
 */

    import java.util.ArrayList;

public class User {
    private String userName;
    private int DOB;
    private double height;
    private double weight;
    private ArrayList<WorkoutPlan> workoutPlans;

    public User(String uName, int dateOfBirth, double h, double w) {
        userName = uName;
        DOB = dateOfBirth;
        height = h;
        weight = w;
        workoutPlans = new ArrayList<>();
    }

    public void addWorkoutPlan(WorkoutPlan plan) {
        workoutPlans.add(plan);
    }

    public String userDetails() {
        return "Username: " + userName + ", Date of Birth: " + DOB + ", Height: " + height + ", Weight: " + weight;
    }

    public double calculateBMI() {
        return (weight / (height * height)) * 10000;
    }
}

    

