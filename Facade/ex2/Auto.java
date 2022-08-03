package patterns.Facade.ex2;

public class Auto {
    Transmissiom transmissiom;
    Clutch clutch;

    public Auto(Transmissiom transmissiom, Clutch clutch) {
        this.transmissiom = transmissiom;
        this.clutch = clutch;
    }

    void up() {
        clutch.release();
        if (true) {
            transmissiom.up();
        }
        clutch.engage();
    }

    void down() {
        clutch.release();
        transmissiom.down();
        clutch.engage();
    }

    public void drive() {

    }
}
