import Classes.ActionClient;
import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

public class App {

    /*
     * Программа работы интернет-магазина
     */
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Market magnit = new Market();

        Actor client1 = new OrdinaryClient("boris");
        Actor client2 = new OrdinaryClient("masha");
        Actor client3 = new SpecialClient("prezident", 1);
        iActorBehaviour client4 = new TaxInspector();

        // Создание акционных клиентов
        Actor client5 = new ActionClient("elena", 1);
        Actor client6 = new ActionClient("ivan", 2);
        Actor client7 = new ActionClient("darya", 3);
        Actor client8 = new ActionClient("gennadiy", 4);

        // Создание клиентов для возврата товара
        Actor client9 = new OrdinaryClient("sergey");
        Actor client10 = new ActionClient("oksana", 5);
        Actor client11 = new SpecialClient("anna", 2);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        // Добавление акционных клиентов в магазин
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);
        magnit.acceptToMarket(client8);

        magnit.update();

        // Возвраты товаров
        magnit.acceptForReturn(client9);
        magnit.acceptForReturn(client10);
        magnit.acceptForReturn(client11);
    }
}
