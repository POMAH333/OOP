package java.src.Calculator;

import java.src.Calculator.Argument.Argument;
import java.src.Calculator.Argument.Complex;
import java.src.Calculator.Interface.iCalculable;

/**
 * Класс калькулятора комплексных чисел
 */
public final class CalculatorComplex implements iCalculable {

    private Complex primaryArg;
    private Complex secondArg;
    private Complex result;

    /**
     * Конструктор класса
     * 
     * @param primaryArg - первый аргумент
     * @param secondArg  - второй аргумент
     */
    public CalculatorComplex(Complex primaryArg, Complex secondArg) {
        this.primaryArg = primaryArg;
        this.secondArg = secondArg;
    }

    /**
     * Вычисление суммы комплексных чисел
     */
    @Override
    public iCalculable sum() {
        double valid1 = primaryArg.getValid();
        double imagin1 = primaryArg.getImagin();
        double valid2 = secondArg.getValid();
        double imagin2 = secondArg.getImagin();
        result.setValid(valid1 + valid2);
        result.setImagin(imagin1 + imagin2);
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
        double valid1 = primaryArg.getValid();
        double imagin1 = primaryArg.getImagin();
        double valid2 = secondArg.getValid();
        double imagin2 = secondArg.getImagin();
        result.setValid(valid1 - valid2);
        result.setImagin(imagin1 - imagin2);
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
