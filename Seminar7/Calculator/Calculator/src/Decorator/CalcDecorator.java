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

        logger.log("Вычисление " + firstArg + " + " + secondArg);
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

        logger.log(String.format("Вычисление %d * %d", firstArg, secondArg));
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

        logger.log(String.format("Вычисление %d - %d", firstArg, secondArg));
        logger.log("Вызов функции sub");
        iCalculable result = oldCalc.sub();
        logger.log(String.format("Вызова метода sub произошел"));
        return result;
    }

    /**
     * Метод вычисления результата от деления с логгированием
     */
    @Override
    public iCalculable div() {

        Argument firstArg = oldCalc.getPrimaryArg();
        Argument secondArg = oldCalc.getSecondArg();

        logger.log(String.format("Вычисление %d / %d", firstArg, secondArg));
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
        logger.log(String.format("Получение результата %d", arg));
        return arg;
    }

    /**
     * Метод выдачи второго аргумента с логгированием
     */
    @Override
    public Argument getSecondArg() {
        Argument arg = oldCalc.getSecondArg();
        logger.log(String.format("Получение результата %d", arg));
        return arg;
    }

    /**
     * Метод выдачи результата с логгированием
     */
    @Override
    public Argument getResult() {
        Argument result = oldCalc.getResult();
        logger.log("Получение результата %d" + result);
        return result;
    }

    @Override
    public void setPrimaryArg(Complex complex) {
        oldCalc.setPrimaryArg(complex);
    }

    @Override
    public void setSecondArg(Complex complex) {
        oldCalc.setSecondArg(complex);
    }
}
