package com.mysteriouscoder.physicalandmentalhealth.dataclass

import com.mysteriouscoder.physicalandmentalhealth.R

data class ExerciseChallenges(
    val title: String,
    val subtitle: String,
    val image: Int,
)

val challengeslist= listOf(
    ExerciseChallenges(
        title = "30 Day Squat",
        subtitle = "30 Day Squat Challenge",
        image = R.drawable.menlegworkout
    ),
    ExerciseChallenges(
        title = "30 Day Plank",
        subtitle = "30 Day Plank Challenge",
        image = R.drawable.womenexercisefullpaper
    ),
    ExerciseChallenges(
        title = "30 Day Pushup",
        subtitle = "30 Day Pushup Challenge",
        image = R.drawable.femalechestworkout
    ),
    ExerciseChallenges(
        title = "30 Day Abs",
        subtitle = "30 Day Abs Challenge",
        image = R.drawable.menexercisewallpaper
    ),
    ExerciseChallenges(
        title = "30 Day Cardio",
        subtitle = "30 Day Cardio Challenge",
        image = R.drawable.femalearm
    ),
    ExerciseChallenges(
        title = "30 Day Yoga",
        subtitle = "30 Day Yoga Challenge",
        image = R.drawable.kundaliniyoga
    ),
    ExerciseChallenges(
        title = "30 Day Meditation",
        subtitle = "30 Day Meditation Challenge",
        image = R.drawable.meditation2
    ),
    ExerciseChallenges(
        title = "30 Day Running",
        subtitle = "30 Day Running Challenge",
        image = R.drawable.femaleshoulder
    ),
    ExerciseChallenges(
        title = "30 Day Walking",
        subtitle = "30 Day Walking Challenge",
        image = R.drawable.femalechestworkout
    ),
    ExerciseChallenges(
        title = "30 Day Cycling",
        subtitle = "30 Day Cycling Challenge",
        image = R.drawable.menshoulder
    ),
    ExerciseChallenges(
        title = "30 Day Swimming",
        subtitle = "30 Day Swimming Challenge",
        image = R.drawable.femaleback
    ),
    ExerciseChallenges(
        title = "30 Day Skipping",
        subtitle = "30 Day Skipping Challenge",
        image = R.drawable.menbackexercise
    ),
    ExerciseChallenges(
        title = "30 Day Hiking",
        subtitle = "30 Day Hiking Challenge",
        image = R.drawable.gym4
    ),
    ExerciseChallenges(
        title = "30 Day Climbing",
        subtitle = "30 Day Climbing Challenge",
        image = R.drawable.menarm
    ),

    ExerciseChallenges(
        title="3km Running",
    subtitle="The basic of running",
        image = R.drawable.gym2,
    ),

    ExerciseChallenges(
    title = "14 Days full Body",
    subtitle = "Easily shape your life",
    image =  R.drawable.gym1,

    ),
    ExerciseChallenges(
        title = "14 Days upper Body",
        subtitle = "Shape a Strong upper body",
        image =  R.drawable.gym3,
    ),
    ExerciseChallenges(
        title = "7 Day shoulder",
        subtitle = "Shape a Strong back",
        image = R.drawable.gym4,
    ),
    ExerciseChallenges(
        title = "21 Day full body",
        subtitle = "Daily make yourself 1% better",
        image =  R.drawable.gym5,
    )
)