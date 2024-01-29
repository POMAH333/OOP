package Decorator;

import Calculator.Argument.Argument;
import Calculator.Argument.Complex;
import Calculator.Interface.iCalculable;
import Logger.*;

/**
 * Декоратор для подключения логгера к существующему калькулятору
 */
public class CalcDecorator implements iCalculable {
    private iCalculable oldCalc; // Подключение существующего калькулятора
    private Logger logger; // Подключение логгера

    /**
     * Конструктор декоратора
     * 
     * @param oldCalc - существующий калькулятор
     * @param log     - логгер
     */
    public CalcDecorator(iCalculable oldCalc, Logger log) {
        this.oldCalc = oldCalc;
        this.logger = log;
    }

    /**
     * Метод вычисления суммы с логгированием
     */
    @Override
    public iCalculable sum() {

        Argument firstArg = oldCalc.getPrimaryArg();
        Argument secondArg = oldCalc.getSecondArg();

        logger.log(String.format("Вычисление %s + %s", firstArg.toString(), secondArg.toString()));
        logger.log("Вызов функции sum");
        iCalculable result = oldCalc.sum();
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    /**
     * Метод вычисления произведения с логгированием
     */
    @Override
    public iCalculable multi() {

        Argument firstArg = oldCalc.getPrimaryArg();
        Argument secondArg = oldCalc.getSecondArg();

        logger.log(String.format("Вычисление %s * %s", firstArg.toString(), secondArg.toString()));
        logger.log("Вызов функции multi");
        iCalculable result = oldCalc.multi();
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    /**
     * Метод вычисления разности с логгированием
     */
    @Override
    public iCalculable sub() {

        Argument firstArg = oldCalc.getPrimaryArg();
        Argument secondArg = oldCalc.getSecondArg();

        logger.log(String.format("Вычисление %s - %s", firstArg.toString(), secondArg.toString()));
        logger.log("Вызов функции sub");
        iCalculable result = oldCalc.sub();
        logger.log(String.format("Вызова метода sub произошел"));
        return result;
    }

    /**
     * Метод вычисления частного с логгированием
     */
    @Override
    public iCalculable div() {

        Argument firstArg = oldCalc.getPrimaryArg();
        Argument secondArg = oldCalc.getSecondArg();

        logger.log(String.format("Вычисление %s / %s", firstArg.toString(), secondArg.toString()));
        logger.log("Вызов функции div");
        iCalculable result = oldCalc.div();
        logger.log(String.format("Вызова метода div произошел"));
        return result;
    }

    /**
     * Метод выдачи первого аргумента с логгированием
     */
    @Override
    public Argument getPrimaryArg() {
        Argument arg = oldCalc.getPrimaryArg();
        logger.log(String.format("Первый аргумент %s", arg.toString()));
        return arg;
    }

    /**
     * Метод выдачи второго аргумента с логгированием
     */
    @Override
    public Argument getSecondArg() {
        Argument arg = oldCalc.getSecondArg();
        logger.log(String.format("Второй аргумент %s", arg.toString()));
        return arg;
    }

    /**
     * Метод выдачи результата с логгированием
     */
    @Override
    public Argument getResult() {
        Argument result = oldCalc.getResult();
        logger.log(String.format("Получение результата %s", result.toString()));
        return result;
    }

    /**
     * Установка первого аргумента с логгированием
     */
    @Override
    public void setPrimaryArg(Complex complex) {
        oldCalc.setPrimaryArg(complex);
        logger.log(String.format("Установлен первый аргумент %s", complex.toString()));
    }

    /**
     * Установка второго аргумента с логгированием
     */
    @Override
    public void setSecondArg(Complex complex) {
        oldCalc.setSecondArg(complex);
        logger.log(String.format("Установлен второй аргумент %s", complex.toString()));
    }
}
