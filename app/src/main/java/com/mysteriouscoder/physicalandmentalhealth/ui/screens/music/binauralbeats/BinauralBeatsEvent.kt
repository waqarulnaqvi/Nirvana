package com.mysteriouscoder.physicalandmentalhealth.ui.screens.music.binauralbeats

sealed class BinauralBeatsEvent {

    data class BinauralBeatsSounds(
        val title: String,
        val subtitle: String,
        val image: Int,
    ) : BinauralBeatsEvent()
}