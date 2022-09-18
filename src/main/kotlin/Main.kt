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
        val music: Music = context.getBean("musicBean", Music::class.java)
        val musicPlayer = MusicPlayer(music)
        musicPlayer.playMusic()
        context.close()
    }
}