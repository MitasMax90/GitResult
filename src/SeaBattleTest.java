public class SeaBattleTest {
    public static void main(String[] args) {
        int numOfGuess = 0; // Переменная для подсчёта количества ходов User'а
        GameHelper helper = new GameHelper(); // Спецкласс с методом для приёма ввода числа от User'а
        SeaBattle ship = new SeaBattle(); // Создаём объект - кораблик
        int random = (int) (Math.random() * 5); // Генер-м случайное число для первой ячейки корабля
        int[] locations = {random, random + 1, random + 2}; // Создаём корабль
        ship.setLocationCells(locations); // Передаём кораблю его местоположение
        boolean isAlive = true; // Переменная для хранения состояния игры

        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число"); // Получаем строку, вводимую User'ом
            String result = ship.checkYourself(guess); // Просим кораблик проверить рез-т, и возвращаем его в result
            numOfGuess++; // Инкрементируем количество попыток
            if (result.equals("Потопил")) { // Если корабль потоплен, выводим "Потопил" и Кол-во попыток
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuess + " попыток(и)");
            }
        }
    }
}
