import java.util.ArrayList; // имапортировали ArrayList

public class SeaBattle {

    private ArrayList<String> locationCells; // Изменили строковый массив на ArrayList, *

    public void setLocationCells(ArrayList<String> loc) { // * чтобы хранить объекты String
        locationCells = loc;
    }

    public String checkYourself(String userInput) { // Новое им яаргумента метода
        String result = "Мимо"; // Создали переменную для хранения результата действия
        int index = locationCells.indexOf(userInput); // Проверяем, есть ли заданная User'ом ячейка по индексу, если нет, то indexOf возвращает -1
        if (index >= 0) { // Если index >= 0, то заданная User'ом ячейка определенно находится в списке, *
            locationCells.remove(index); // Поэтому, удаляем её

            if (locationCells.isEmpty()) { // Если ArrayList пуст, значит это последнее попадание
               result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
