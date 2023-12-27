package Domain;

public class HotDrink extends Product {

    /**
     * Класс Горячих Напитков - наследник класса Product.
     * Содержит дополнительное целочисленное поле temperature, для указания температуры продукта.
     * Поле введено в конструктор класса, для него определён getter и setter, переопределён метод toString.
     */

    private int temperature;

    public HotDrink(int price, int place, String name, long id, int temp) {
        super(price, place, name, id);
    }

    @Override
    public String toString() {
        return super.toString() + "temperature=" + temperature + "\n";
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
