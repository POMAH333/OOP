package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {

    /*
     * Абстрактный класс посетителей
     */

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isTakeReturn; // Оформление возврата
    protected boolean isMakeReturn; // Заявка на возврат

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

    public abstract void setName(String name);
}

// package Interfeices;

// public interface iActorBehaviour {

// }

// package Interfeices;

// public interface iQueueBehaviour {
// public void takeInQueue() {

// }

// public void velcaseFromQueue() {

// }

// public void tekeQueue () {

// }

// public void getActor () {

// }
// }

// package Interfeices;

// import java.awt.List;

// import Classes.Actor;

// public interface isMarketBehaviour {
// public void acceptToMarket(Actor actor) {

// }

// public void releseFromMarket(List<Actor> actors) {

// }

// public void upDate() {

// }
// }