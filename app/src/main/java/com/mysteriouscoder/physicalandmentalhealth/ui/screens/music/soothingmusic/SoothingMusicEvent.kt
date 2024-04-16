package com.mysteriouscoder.physicalandmentalhealth.ui.screens.music.soothingmusic

sealed class SoothingMusicEvent {
    data class SoothingMusic(
        val title: String,
        val subtitle: String,
        val image: Int,
    ) : SoothingMusicEvent()
}