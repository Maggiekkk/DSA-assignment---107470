/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.workoutplanner;

/**
 *
 * @author USER
 */

   import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class WorkoutPlan {
    private String planName;
    private double duration;
    private Queue<String> exercises;
    private Stack<String> history;

    public WorkoutPlan(String name, double dur) {
        planName = name;
        duration = dur;
        exercises = new LinkedList<>();
        history = new Stack<>();
    }

    public void addExercise(String exercise) {
        exercises.offer(exercise);
        history.push(exercise);
    }

    public void undoLastExercise() {
        if (!history.isEmpty()) {
            String lastExercise = history.pop();
            exercises.remove(lastExercise);
        }
    }

    public String provideDetails() {
        return "Plan: " + planName + ", Duration: " + duration + ", Exercises: " + exercises.toString();
    }
}
 

