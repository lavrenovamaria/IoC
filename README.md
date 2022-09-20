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
