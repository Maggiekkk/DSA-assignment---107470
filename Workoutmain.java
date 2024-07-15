/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.workoutplanner;

/**
 *
 * @author USER
 */

  public class Workoutmain {
    public static void main(String[] args) {
        User user1 = new User("JohnDoe", 1990, 175, 70);
        WorkoutPlan plan1 = new WorkoutPlan("Plan A", 30);
        
        plan1.addExercise("Push-ups");
        plan1.addExercise("Sit-ups");
        
        user1.addWorkoutPlan(plan1);
        
        System.out.println(user1.userDetails());
        System.out.println("BMI: " + user1.calculateBMI());
        System.out.println(plan1.provideDetails());
        
        ExerciseTree exerciseTree = new ExerciseTree();
        exerciseTree.addExercise("Light Jogging", 1);
        exerciseTree.addExercise("Running", 3);
        exerciseTree.addExercise("Sprinting", 5);
        
        System.out.println("Recommended Exercise for intensity 3: " + exerciseTree.recommendExercise(3));
    }
}
  
