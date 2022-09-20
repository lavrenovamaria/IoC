package edu.school21.ioc.music

class MusicPlayer {

    private var music: Music? = null

    constructor(music: Music) {
        this.music = music
    }

    constructor() {
    }

    fun playMusic() {

        println("Playing: " + music!!.getSong())

    }

    fun setMusic(music: Music) {
        this.music = music
    }
}