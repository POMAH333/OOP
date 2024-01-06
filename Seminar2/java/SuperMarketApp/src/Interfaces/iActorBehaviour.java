package Interfaces;

import Classes.Actor;

/*
 * Интерфейс для работы с посетителем
 */

public interface iActorBehaviour {
    public boolean isTakeOrder();

    public boolean isMakeOrder();

    public void setTakeOrder(boolean val);

    public void setMakeOrder(boolean val);

    public Actor getActor();
}
