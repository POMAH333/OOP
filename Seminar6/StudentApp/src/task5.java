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
    private iStartEngine engine;

    public Car(iStartEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

public interface iStartEngine {
    public void start();
}

public class PetrolEngine implements iStartEngine {
    @Override
    public void start() {

    }
}