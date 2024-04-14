package com.mysteriouscoder.physicalandmentalhealth.ui.screens.onboarding

import androidx.annotation.DrawableRes
import com.mysteriouscoder.physicalandmentalhealth.R

data  class Page(
     val title:String,
     val description:String,
     @DrawableRes val image:Int
 )

val pages= listOf(

    Page(
        title = "Meditation",
        description="Meditation quiets the mind, reduces stress, enhances focus,  and improves overall well-being.",
        image = R.drawable.meditationmainscreen
    ),

    Page(
        title = "Yoga & Exercises",
        description="Yoga and exercises calm the mind, reducing stress. fostering mental resilience and positivity.",
        image = R.drawable.exercisesmainscreen
    ),

    Page(
        title = "Mind Relaxing Music",
        description="Mind relaxing music soothes nerves ,and reducing anxiety for improved mental well-being.",
        image = R.drawable.soothingmusicmainscreen
    ),
    Page(
        title = "AI Friend",
        description="Interacting with AI can alleviate loneliness but excessive reliance may lead to affecting mental well-being.",
//        description="Interacting with AI can alleviate loneliness but excessive reliance may lead to affecting mental well-being negatively.",
        image = R.drawable.aimainscreen
    ),
    Page(
        title = "Progress Tracking",
        description="Progress tracking can alleviate anxiety by providing a sense of achievement and boost confidence.",
        image = R.drawable.progresstrackingphonewallpaper
    )

)