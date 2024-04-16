package com.mysteriouscoder.physicalandmentalhealth.ui.screens.meditation

sealed class MeditationAndSoundsEvent{
    data class Meditation(
        val title: String,
        val subtitle: String,
        val image: Int,
    ) : MeditationAndSoundsEvent()

    data class Sounds(
        val title: String,
        val subtitle: String,
        val image: Int,
    ) : MeditationAndSoundsEvent()
}