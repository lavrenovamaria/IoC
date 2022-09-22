package edu.school21.ioc

import edu.school21.ioc.music.Music
import edu.school21.ioc.music.MusicPlayer
import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext(
            "applicationContext.xml"
        )
        val musicPlayer: MusicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)
        val musicPlayer1: MusicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)

        val boolean = musicPlayer === musicPlayer1
        println(boolean)

        musicPlayer.playMusic()

        println(musicPlayer.getName())
        println(musicPlayer.getVolume())

        musicPlayer.setVolume(1000)
        println(musicPlayer.getVolume())
        println(musicPlayer1.getVolume())

        context.close()
    }
}