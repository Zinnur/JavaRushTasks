package com.javarush.task.task25.task2515;

/**
 * Created by Alexey Vedensky on 07.04.2017.
 * MAIL: avedensky@gmail.com
 */

/*Давай напишем новую компьютерную игрушку.
У нас будет космический корабль, который стреляет ракетами в НЛО.
А НЛО в свою очередь сбрасывает на корабль бомбы.
Ну и, конечно, всё дело происходит в космосе.

Нам понадобятся классы: Space(космос), SpaceShip(космический корабль) и Ufo(НЛО).
Создай классы: Space, SpaceShip, Ufo.
Добавь метод main в класс Space.


Требования:
1. Создай в отдельном файле класс Space.
2. Создай в отдельном файле класс SpaceShip.
3. Создай в отдельном файле класс Ufo.
4. Добавь метод main в класс Space.*/
public class Ufo extends BaseObject{
    public Ufo(double x, double y, double radius) {
        super(x, y, radius);
    }
}
