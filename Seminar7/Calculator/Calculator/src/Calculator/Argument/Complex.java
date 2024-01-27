package Calculator.Argument;

/**
 * Класс комплексного аргумента для калькулятора
 */
public class Complex extends Argument {
    private double imagin; // Мнимая вещественная часть комплексного числа

    /**
     * Конструктор класса комплесного числа
     * 
     * @param valid  - действителяная часть комплексного числа
     * @param imagin - мнимая часть комаплексного числа
     */
    public Complex(double valid, double imagin) {
        super(valid);
        this.imagin = imagin;
    }

    /**
     * Геттер мнимой части комплексного числа
     * 
     * @return
     */
    public double getImagin() {
        return imagin;
    }

    /**
     * Сеттер мнимой части комплексного числа
     * 
     * @param imagin - мнимая часть комплексного числа
     */
    public void setImagin(double imagin) {
        this.imagin = imagin;
    }

    /**
     * Переопределение метода строкового вывода для комплексного числа
     */
    @Override
    public String toString() {
        return super.getValid() + " + i" + imagin;
    }

}
