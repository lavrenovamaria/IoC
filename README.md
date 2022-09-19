# IoC
Инверсия контейнеров управления и шаблон внедрения зависимостей
 
 ![image](https://user-images.githubusercontent.com/84707645/190913049-c16f467b-d095-43ef-9584-5d4486e6ed02.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913062-bd7fe18e-28fc-4482-a4c0-3c71409d545a.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913501-f928b357-1de2-4cc4-901e-2e1950562f78.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913532-c3180b3c-9e04-4ee9-bb1d-76386b8f1f0e.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913602-acb50771-494e-4f07-9ff5-8bbe3c09ef86.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913583-7bf0382c-239e-4609-803e-545c85b2b48d.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913631-ea5b9cd7-77ef-4383-8b1a-89e8cb7f33f7.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913662-d62295d5-78bb-4a00-88dc-33900b173a54.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913673-2125c337-9ae2-42e2-ae81-9279b08b7e23.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913730-8f51d04e-dd26-4b82-a129-76279add979f.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913722-0a9107d3-4525-42b0-90d7-800637e5b737.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913768-757ae88d-1353-49d9-959e-13908b24927d.png)
 
 ![image](https://user-images.githubusercontent.com/84707645/190913818-b5546045-51ad-43fa-b19b-1e1ba00d3dd2.png)
 
 ```
 <?xml version="1.0" encoding="UTF-8"?>
 <beans  xmlns="http://www.springframework.org/schema/beans"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://www.springframework.org/schema/beans
         http://www.springframework.org/schema/beans/spring-beans.xsd">
 
     <bean id="musicBean"
           class="edu.school21.ioc.music.ClassicalMusic"/>
 //меняем вручную ClassicalMusic или RockMusic
 //сам файл надо переписать в yaml(?)
 </beans>
 ```
 
 [Spring Framework. Урок 4: Инверсия управления. Inversion of Control (IoC).](https://www.youtube.com/watch?v=Ns0IxBXDbWw)
 
 [Inversion of Control Containers and the Dependency Injection pattern by Martin Fowler](https://www.martinfowler.com/articles/injection.html)
