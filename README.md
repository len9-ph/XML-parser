# XML-Parser #

** This program parse files like this: **

    <patients>
        <patient>
            <first_name>Иван</first_name>
            <middle_name>Иванович</middle_name>
            <last_name>Иванов</last_name>
            <birthday>1980-06-01</birthday>
            <gender>male</gender>
            <phone>+7-905-680-4476</phone>
        </patient>

** Program use's [SAX parser](https://docs.oracle.com/javase/tutorial/jaxp/sax/parsing.html "Documentation") **

## To run program: ## 
1) download repository to your computer
2) At cmd go to program file: * cd your_path\XML-parser *
3) Enter: * mvn clean install *
4) Go to \target\
5) Enter: * java -jar XML-parser-1.0.jar [put_your_path]("for example: ..\src\main\resources\file.xml" [sort_method]*

After that you get result at the console:
* example *
  +------------------------------+-------+----+---------------+
  |ФИО                           |Возраст|Пол |Телефон        |
  +------------------------------+-------+----+---------------+
  |Иванов Иван Иванович          |41     |М   |+7-905-680-4476|
  |Петров Петр Петрович          |36     |М   |+7-920-230-1756|
  |Лисицина Лариса Ивановна      |32     |Ж   |+7-980-719-1668|
  |Волкова Мария Петровна        |34     |Ж   |+7-903-220-7681|
  |Медведев Михаил Викторович    |27     |М   |+7-920-670-9643|
  +------------------------------+-------+----+---------------+
