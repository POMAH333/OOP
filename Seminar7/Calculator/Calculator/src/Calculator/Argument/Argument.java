package Calculator.Argument;

/**
 * Класс аргумента для калькулятора
 */
public class Argument {
    private double valid; // Действительный вещественный аргумент

    /**
     * Конструктор класса
     * 
     * @param valid - вещественное значение аргумента
     */
    public Argument(double valid) {
        this.valid = valid;
    }

    /**
     * Геттер аргумента
     * 
     * @return
     */
    public double getValid() {
        return valid;
    }

    /**
     * Сеттер аргумента
     * 
     * @param valid - вещественное значение аргумента
     */
    public void setValid(double valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Argument [valid=" + valid + "]";
    }
}
