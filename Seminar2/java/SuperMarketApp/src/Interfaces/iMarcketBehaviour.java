package Interfaces;

import java.util.List;

import Classes.Actor;

/*
 * Интерфейс входа-выхода в магазин
 */

public interface iMarcketBehaviour {
    public void acceptToMarket(iActorBehaviour actor);

    public void releseFromMarket(List<Actor> actors);

    public void update();
}
