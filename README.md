# IoC
Инверсия контейнеров управления и шаблон внедрения зависимостей

[Spring Framework. Урок 6: Внедрение зависимостей. Dependency Injection (DI). Часть 2.](https://www.youtube.com/watch?v=dBxRmUH3Af8)

<img width="862" alt="Screen Shot 2022-09-20 at 6 24 31 PM" src="https://user-images.githubusercontent.com/84707645/191303353-12403e90-5a0a-485b-bf62-e76fc178e610.png">

<img width="862" alt="Screen Shot 2022-09-20 at 6 25 06 PM" src="https://user-images.githubusercontent.com/84707645/191303383-ae3bccc9-4213-42f5-b6f3-78f31796a22e.png">


Как подставляется bean:
1. У нас есть метод setMusic

```
fun setMusic(music: Music) {
        this.music = music
    }
```
2. В ApplicationContext есть name="music"
```
    <bean id="musicPlayer"
          class="edu.school21.ioc.music.MusicPlayer">
        <property name="music" ref="musicBean"/>
    </bean>
```
3. Spring видит setMusic, удаляет set, Music переводит в lower case - music

## Под капотом когда мы внедряем зависимость с помощью setter

1. Spring создаёт объект класса MusicPlayer, использует пустой конструктор(не передает ничего при создании объекта MusicPlayer();)
```
MusicPlayer musicPlayer = new MusicPlayer();
```
2. У MusicPlayer вызывает setter setMusic, соответсвующий названию зависимости name="music" и в этот setMusic в качестве аргумента передает тот bean, который бл создан ранее(id="musicBean")
```
musicPlayer.setMusic();
```

```
<?xml version="1.0" encoding="UTF-8"?>
<beans  xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="musicBean"
          class="edu.school21.ioc.music.ClassicalMusic">
    </bean>

    <bean id="musicPlayer"
          class="edu.school21.ioc.music.MusicPlayer">
        <property name="music" ref="musicBean"/>
    </bean>
</beans>
```

```
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
```

## Внедряем зависимость с помощью setter

```
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
```

```
<bean id="musicPlayer"
          class="edu.school21.ioc.music.MusicPlayer">
        <property name="music" ref="musicBean"/>

        <property name="name" value="Some name"/>
        <property name="volume" value="10"/>
    </bean>
```

<img width="515" alt="Screen Shot 2022-09-20 at 7 15 07 PM" src="https://user-images.githubusercontent.com/84707645/191310715-dc1f3a0d-3c76-4760-8e2a-e172e83ef592.png">
