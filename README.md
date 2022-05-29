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

**Program use's [SAX parser](https://docs.oracle.com/javase/tutorial/jaxp/sax/parsing.html "Documentation")**

## To run program: ## 
1) download repository to your computer
2) At cmd go to program file: _cd your_path\XML-parser_
3) Enter: _mvn clean install_
4) Go to _\target_
5) Enter: _**java -jar XML-parser-1.0.jar [put_your_path] [choose_sort_method]**_

In sort_method you can choose between age and name, besides you can print nothing, then they will be displayed in the sequence 
in which they went in an xml file

