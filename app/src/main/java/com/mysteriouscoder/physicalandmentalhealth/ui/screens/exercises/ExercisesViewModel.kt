package com.mysteriouscoder.physicalandmentalhealth.ui.screens.exercises

import androidx.lifecycle.ViewModel
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore

class ExercisesViewModel(
    private val auth: FirebaseAuth = Firebase.auth,
    private val db: FirebaseFirestore = Firebase.firestore
)  :ViewModel()
{
    private fun loadAllMenExercises(){

    }

    private fun loadAllWomenExercises(){

    }

}