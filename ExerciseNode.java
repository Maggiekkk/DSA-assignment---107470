/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.workoutplanner;

/**
 *
 * @author USER
 */

    class ExerciseNode {
    String exercise;
    int intensity;
    ExerciseNode left, right;

    public ExerciseNode(String exercise, int intensity) {
        this.exercise = exercise;
        this.intensity = intensity;
        left = right = null;
    }
}

public class ExerciseNode {
    private ExerciseNode root;

    public void addExercise(String exercise, int intensity) {
        root = addExerciseRec(root, exercise, intensity);
    }

    private ExerciseNode addExerciseRec(ExerciseNode root, String exercise, int intensity) {
        if (root == null) {
            root = new ExerciseNode(exercise, intensity);
            return root;
        }
        if (intensity < root.intensity) {
            root.left = addExerciseRec(root.left, exercise, intensity);
        } else if (intensity > root.intensity) {
            root.right = addExerciseRec(root.right, exercise, intensity);
        }
        return root;
    }

    public String recommendExercise(int intensity) {
        return recommendExerciseRec(root, intensity);
    }

    private String recommendExerciseRec(ExerciseNode root, int intensity) {
        if (root == null) {
            return "No exercise found";
        }
        if (intensity == root.intensity) {
            return root.exercise;
        }
        if (intensity < root.intensity) {
            return recommendExerciseRec(root.left, intensity);
        }
        return recommendExerciseRec(root.right, intensity);
    }
}


