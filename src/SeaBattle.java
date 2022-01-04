public class SeaBattle {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess); // Преобразовали тип String в int
        String result = "Мимо"; // Создали переменную для хранения результата
        for (int cell : locationCells) { // Повторим с каждым элементом массива
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) { // Выходим из цикла и прверяем, потоплен ли корабль
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
