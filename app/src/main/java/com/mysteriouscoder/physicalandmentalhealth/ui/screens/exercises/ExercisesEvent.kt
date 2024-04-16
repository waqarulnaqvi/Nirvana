package com.mysteriouscoder.physicalandmentalhealth.ui.screens.exercises

sealed class ExercisesEvent {
    data class WomenExercises(val title: String, val subtitle: String, val image: Int) : ExercisesEvent()
    data class MenExercises(val title: String, val subtitle: String, val image: Int) : ExercisesEvent()
}


