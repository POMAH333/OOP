package Classes;

public class OrdinaryClient extends Actor {

    /**
     * @param name
     *             Класс описания обычного клиента
     */
    public OrdinaryClient(String name) {
        super(name);
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