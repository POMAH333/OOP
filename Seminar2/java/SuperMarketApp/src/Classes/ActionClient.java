package Classes;

public class ActionClient extends Actor {

    private String actionName;
    private int idClient;
    private static int actionNumber;

    /**
     * @param name
     * @param idClient
     *                 Класс описывающий акционного клиента
     */
    public ActionClient(String name, int idClient) {
        super(name);
        this.idClient = idClient;
        this.actionName = "New Action";
        ActionClient.actionNumber = 3;

        // Установка флага заказа товара при превышении количества участников акции
        if (this.idClient > actionNumber) {
            setMakeOrder(true);
        }
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public boolean isMakeReturn() {
        return super.isMakeReturn;
    }

    public boolean isTakeReturn() {
        return super.isTakeReturn;
    }

    public void setMakeReturn(boolean val) {
        super.isMakeReturn = val;
    }

    public void setTakeReturn(boolean val) {
        super.isTakeReturn = val;
    }

    public Actor getActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

}
