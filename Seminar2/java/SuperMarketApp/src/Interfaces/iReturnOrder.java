package Interfaces;

import Classes.Actor;

/*
 * Интерфейс возврата товара
 */

public interface iReturnOrder {
    public boolean isTakeReturn();

    public boolean isMakeReturn();

    public void setTakeReturn(boolean val);

    public void setMakeReturn(boolean val);

    public Actor getActor();
}
