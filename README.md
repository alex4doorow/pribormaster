# PRIBORMASTER
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
"Бэк офис интернет-магазина" «приборМАСТЕР» является приложением полного цикла. 
Приложение обслуживает физических и юридических лиц (резиденты/нерезиденты). Делает:
 1) ввод заявок, контроль и расход товарных остатков склада через web интерфейс. 
 2) формирование первичных документов и основной отчетной документации.
 3) выгрузка данных в Excel
 4) интеграция с фронтом – сайтом интернет-магазина pribormaster.ru (на нем пользователи просматривают карточки товара, 
перемещают выбранные товары в корзину и делают покупки).
 5) интеграция с маркетплейсами (сейчас это Яндекс-Маркет м ОЗОН), где также размещены товары нашего магазина. 
 6) интеграция с транспортными компаниями (СДЭК, Почта России, Деловые Линии).
 7) интеграция с поставщиками
 8) email рассылки по информированию 

Приложение позволяет работать пользователям с несколькими ролями.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Начало разработки: март 2017 года. 
Первая версия внедрена в ноябре 2017 года.
В настоящее время, в продакшене: 4.3.0. В разработке: 5.0.1.

Изначально разрабатывался под spring boot 2.0.1, java 8. Сейчас это 2.7.4, java 18.
Было
    war под external tomcat: mysql + spring template + spring security + jsp + bootstrap + jquery + javascript
Стало
    jar in embedded tomcat: postgres + spring jpa (hibernate) + spring security + thymeleaf + bootstrap + jquery + javascript

Детали реализации
01. jdk 18.0.2.1
02. spring boot 2.7.4 with starters: web, actuator, devtools, cashe, jpa, jdbc, validation, tomcat      
03. lombok 1.18.24
04. sl4j, logback 1.2.11
05. jackson 2.4.12 
06. junit 5.8
07. postgres sql 15
08. apache poi 5.2
09. jasper reports, studio 6.20.1
10. WEB
   a. tomcat 9.0.67 
   b. thymeleaf 2.7.4
   c. bootstrap 4.2.1
   d. jQuery 3.3.1
  
11. Сборка: maven 3.8.7
12. Subversion: git, github
13. Среда разработки: JetBrains IntelliJ IDEA 
14. Отчёты и первичные документы: УПД, счета, товарные и транспортные накладные формируются в pdf с помощью jasperReports
15. Экспорт и импорт данных: Apache POI
16. Интеграция с внешними системами: REST with spring web client + jackson

Реализованы 2 имплементации:
1. web - интерфейс для работы пользователей
2. rest - взаимодействие через rest

Реальные application.properties в проект не заложены из-за соображений безопасности. В них присутствуют параметры 
интеграций с CDEK, OZON, Яндекс Маркет и т.п.
в git залиты пустые application-etalon.properties, в которых данные вычищены.
Нужно скопипастить application-etalon.properties в application.properties и заполнить данными для настроек.

Два варианта настроек для запуска:
    application-production.properties боевая
    application-test.properties тестовая

В application-production.properties находится важный парамер: application.production
Если он в true, то запускаются шедулеры и обращаются через интеграцию во внешние системы: передают данные, обновляют данные.
Для тестовой среды этот параметр сброшен

В каталоге /db находятся файлы построения бд. структура данных разработана для postgres

