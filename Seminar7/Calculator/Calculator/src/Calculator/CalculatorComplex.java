package Calculator;

import Calculator.Argument.Argument;
import Calculator.Argument.Complex;
import Calculator.Interface.iCalculable;

/**
 * Класс калькулятора комплексных чисел
 */
public final class CalculatorComplex implements iCalculable {

    private Complex primaryArg; // Первый аргумент вычислений
    private Complex secondArg; // Второй аргумент вычислений
    private Complex result; // Результат вычислений

    /**
     * Конструктор класса
     * 
     * @param primaryArg - первый аргумент
     * @param secondArg  - второй аргумент
     */
    public CalculatorComplex(Complex primaryArg, Complex secondArg) {
        this.primaryArg = primaryArg;
        this.secondArg = secondArg;
        this.result = new Complex(0, 0);
    }

    /**
     * Вычисление суммы комплексных чисел
     */
    @Override
    public iCalculable sum() {
        double valid = primaryArg.getValid();
        double imagin = primaryArg.getImagin();
        valid += secondArg.getValid();
        imagin += secondArg.getImagin();
        result.setValid(valid);
        result.setImagin(imagin);
        return this;
    }

    /**
     * Вычисление произведения комплексных чисел
     */
    @Override
    public iCalculable multi() {
        double valid1 = primaryArg.getValid();
        double imagin1 = primaryArg.getImagin();
        double valid2 = secondArg.getValid();
        double imagin2 = secondArg.getImagin();
        result.setValid(valid1 * valid2 - imagin1 * imagin2);
        result.setImagin(imagin1 * valid2 + valid1 * imagin2);
        return this;
    }

    /**
     * Вычисление разности комплексных чисел
     */
    @Override
    public iCalculable sub() {
        double valid = primaryArg.getValid();
        double imagin = primaryArg.getImagin();
        valid -= secondArg.getValid();
        imagin -= secondArg.getImagin();
        result.setValid(valid);
        result.setImagin(imagin);
        return this;
    }

    /**
     * Вычисление результата от деления комплексных чисел
     */
    @Override
    public iCalculable div() {
        double valid1 = primaryArg.getValid();
        double imagin1 = primaryArg.getImagin();
        double valid2 = secondArg.getValid();
        double imagin2 = secondArg.getImagin();
        if (imagin1 == 0 && imagin2 == 0) {
            System.out.println("Деление на ноль, результат не определён");
            System.out.println("Возвращён предыдущий результат");
        } else {
            result.setValid((valid1 * valid2 + imagin1 * imagin2) / (imagin1 * imagin1 + imagin2 * imagin2));
            result.setImagin((imagin1 * valid2 + valid1 * imagin2) / (imagin1 * imagin1 + imagin2 * imagin2));
        }
        return this;
    }

    /**
     * Геттер первого аргумента
     */
    @Override
    public Argument getPrimaryArg() {
        return primaryArg;
    }

    /**
     * Геттер второго аргумента
     */
    @Override
    public Argument getSecondArg() {
        return secondArg;
    }

    /**
     * Геттер результата
     */
    @Override
    public Argument getResult() {
        return result;
    }

    /**
     * Сеттер первого аргумента
     * 
     * @param primaryArg - первый аргумент
     */
    public void setPrimaryArg(Complex primaryArg) {
        this.primaryArg = primaryArg;
    }

    /**
     * Сеттер второго аргумента
     * 
     * @param secondArg - второй аргумент
     */
    public void setSecondArg(Complex secondArg) {
        this.secondArg = secondArg;
    }
}
