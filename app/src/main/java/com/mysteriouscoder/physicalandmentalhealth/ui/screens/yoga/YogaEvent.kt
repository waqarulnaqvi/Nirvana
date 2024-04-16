package com.mysteriouscoder.physicalandmentalhealth.ui.screens.yoga

sealed class YogaEvent
{
    data class Yoga(
        val title: String,
        val subtitle: String,
        val image: Int,
    ) : YogaEvent()
}