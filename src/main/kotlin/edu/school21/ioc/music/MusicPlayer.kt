package edu.school21.ioc.music

class MusicPlayer {

    private var music: Music? = null
    private var name: String? = null
    private var volume: Int? = null

    constructor(music: Music) {
        this.music = music
    }

    constructor() {
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getVolume(): Int? {
        return volume
    }

    fun setVolume(volume: Int) {
        this.volume = volume
    }

    fun playMusic() {
        println("Playing: " + music!!.getSong())
    }

    fun setMusic(music: Music) {
        this.music = music
    }
}