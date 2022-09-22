# [Spring Framework. Урок 7: Bean scope (Область видимости бинов)](https://www.youtube.com/watch?v=IcwWPjeBpFU)

<img width="765" alt="Screen Shot 2022-09-22 at 3 39 28 PM" src="https://user-images.githubusercontent.com/84707645/191775108-59e5d0cb-3ae6-40ed-9d35-d9e1fbbbc76e.png">

<img width="765" alt="Screen Shot 2022-09-22 at 3 39 34 PM" src="https://user-images.githubusercontent.com/84707645/191775120-4ab50e21-b04d-43e1-b405-03670f0bd4ad.png">

<img width="765" alt="Screen Shot 2022-09-22 at 3 39 48 PM" src="https://user-images.githubusercontent.com/84707645/191775134-93c02e7e-5d1f-4dce-b3e0-53384b4da350.png">

<img width="765" alt="Screen Shot 2022-09-22 at 3 40 18 PM" src="https://user-images.githubusercontent.com/84707645/191775152-3017a24c-ab2e-439a-8024-202713eec9cb.png">

<img width="765" alt="Screen Shot 2022-09-22 at 3 43 00 PM" src="https://user-images.githubusercontent.com/84707645/191775157-f2e16d6e-ec8c-4f15-a108-10e02c6e937c.png">

<img width="765" alt="Screen Shot 2022-09-22 at 3 44 29 PM" src="https://user-images.githubusercontent.com/84707645/191775175-66f0ee42-123a-4877-bd3b-02fafe690aca.png">

<img width="765" alt="Screen Shot 2022-09-22 at 3 50 44 PM" src="https://user-images.githubusercontent.com/84707645/191775197-1da7b3a1-9af8-4d98-aee1-b929bde24411.png">

<img width="765" alt="Screen Shot 2022-09-22 at 3 51 14 PM" src="https://user-images.githubusercontent.com/84707645/191775212-31b7a87d-c98c-43c0-993b-a994ab51b100.png">

<img width="765" alt="Screen Shot 2022-09-22 at 3 51 32 PM" src="https://user-images.githubusercontent.com/84707645/191775234-137746c5-571f-4e3a-8be0-6023ef7e6bbc.png">


```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">

    <context:property-placeholder location="classpath:musicPlayer.properties"/>

    <bean id="musicBean"
          class="edu.school21.ioc.music.ClassicalMusic">
    </bean>

    <bean id="musicPlayer"
          class="edu.school21.ioc.music.MusicPlayer"
            scope="prototype">
        <property name="music" ref="musicBean"/>

        <property name="name" value="${musicPlayer.name}"/>
        <property name="volume" value="${musicPlayer.volume}"/>
    </bean>
</beans>
```

```
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
```

<img width="438" alt="Screen Shot 2022-09-22 at 5 33 22 PM" src="https://user-images.githubusercontent.com/84707645/191775627-0f245a73-e5fe-43b7-b5f7-423b293a73ec.png">

Если писать scope="prototype", то результат вывода будет false(хэши двух объектов разные), 70-1000(значит, что операция musicPlayer.setVolume(1000) произошла только над одним объектом)
