/**
 * 5) Переписать код в соответствии с Dependency Inversion Principle:
 * public class Car {
 * private PetrolEngine engine;
 * public Car(PetrolEngine engine) {
 * this.engine = engine;
 * }
 * public void start() {
 * this.engine.start();
 * }
 * }
 * public class PetrolEngine {
 * public void start() {
 * }
 * }
 * Разорвать зависимость классов Car и PetrolEngine. У машины же может быть
 * DieselEngine.
 */

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

public class Engine {
    public void start() {
    }
}

public class PetrolEngine extends Engine {
    @Override
    public void start() {

    }
}