## Lekce 8 - Domácí úkol

V poslední lekci jsme si ukázali, jak použít JUnit 5 pro psaní unit testů. Tentokrát vaším domácím úkolem je napsat jak implementaci tak unit testy.

Napište třídu s následující funkcionalitou:
- Metoda na výpočet aritmetického průměru
- Metoda na spojení listu Stringů do řetězce pomocí volitelného oddělovače

A další třídu, která ma v sobě seznam zaparkovaných aut (rz, barva, datum a čas příjezdu, kontakt na majitele).
Barvu udělejte jako enum se výčtem několika barev. Při vytvoření definujte maximální kapacitu.

- Příjezd auta (vytvoření záznamu a uloženi do seznamu)
- Odjezd auta podle RZ (odstranění ze seznamu podle RZ)
- Dotaz na zbývající kapacitu 
- Dotaz na obsazenost

Vaším úkolem je navrhnout a naprogramovat unit testy jednotlivých metod. V prvním kroku udělejte alespoň základní test, že to funguje. V dalším pak zkuste vymyslet nějaké situace, kde by mohl nastat problém.

Hotový program potom dejte do gitu (fork tohoto repozitáře) a vytvořte pull request.
