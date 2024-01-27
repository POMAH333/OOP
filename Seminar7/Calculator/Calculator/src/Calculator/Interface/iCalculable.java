package Calculator.Interface;

import Calculator.Argument.Argument;
import Calculator.Argument.Complex;

/**
 * Интерфейс калькулятора
 */
public interface iCalculable {

    /**
     * Метод сложения
     * 
     * @param arg - вещественный аргумент для сложения
     * @return
     */
    iCalculable sum();

    /**
     * Метод умножения
     * 
     * @param arg - вещественный аргумент для умножения
     * @return
     */
    iCalculable multi();

    /**
     * Метод вычитания
     * 
     * @param arg - вещественный аргумент для вычитания
     * @return
     */
    iCalculable sub();

    /**
     * Метод деления
     * 
     * @param arg - вещественный аргумент для деления
     * @return
     */
    iCalculable div();

    /**
     * Метод выдачи первого аргумента
     * 
     * @return
     */
    Argument getPrimaryArg();

    /**
     * Метод выдачи второго аргумента
     * 
     * @return
     */
    Argument getSecondArg();

    /**
     * Метод выдачи результата
     * 
     * @return
     */
    Argument getResult();

    /**
     * Метод установки первого аргумента
     * 
     * @param complex - комплексное число
     */
    void setPrimaryArg(Complex complex);

    /**
     * Метод установки второго аргумента
     * 
     * @param complex - комплексное число
     */
    void setSecondArg(Complex complex);
}
