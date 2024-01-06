package Classes;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.logging.*;

import Interfaces.iActorBehaviour;
import Interfaces.iMarcketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarcketBehaviour, iQueueBehaviour {

    /*
     * Основной класс интернет-магазина
     */

    private List<iActorBehaviour> queue;

    // Создание логгера
    Logger logger = Logger.getLogger(Market.class.getName());

    /**
     * @throws SecurityException
     * @throws IOException
     *                           Конструктор класса
     */
    public Market() throws SecurityException, IOException {
        this.queue = new ArrayList<iActorBehaviour>();

        // Создание лог-файла и форматирование логгера
        FileHandler log = new FileHandler("log.txt");
        SimpleFormatter sFormat = new SimpleFormatter();
        log.setFormatter(sFormat);
        logger.addHandler(log);
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        logger.info(actor.getActor().getName() + " клиент пришел в магазин "); // Логгирование события
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
        logger.info(actor.getActor().getName() + " клиент добавлен в очередь "); // Логгирование события
    }

    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            logger.info(actor.getName() + " клиент ушел из магазина "); // Логгирование события
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
                logger.info(actor.getActor().getName() + " клиент получил свой заказ "); // Логгирование события
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
                logger.info(actor.getActor().getName() + " клиент ушел из очереди "); // Логгирование события
            }
        }
        releseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
                logger.info(actor.getActor().getName() + " клиент сделал заказ "); // Логгирование события
            } else { // Отказ в обслуживании, при превышении количества участников акции
                System.out.println(actor.getActor().getName() + " отказ в обслуживании ");
                logger.info(actor.getActor().getName() + " отказ в обслуживании "); // Логгирование события
            }
        }

    }

    /**
     * @param actor
     *              Метод-заглушка реализующий записи о возврате товара клиентом.
     *              Для реализации всех возможностей интерфейса iReturnOrder,
     *              требуется формирование методов обработки заявки на возврат
     *              товара,
     *              и собственно оформления возврата, в виде очереди, либо в
     *              каком-либо другом виде.
     */
    public void acceptForReturn(iReturnOrder actor) {
        System.out.println(actor.getActor().getName() + " произведён возврат товара клиенту");
        logger.info(actor.getActor().getName() + " произведён возврат товара клиенту"); // Логгирование события
    }

}
