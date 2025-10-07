package learnings.oops.interfaces;

public class NiceCar {
    private Engine engine;
    private Media Player = new CDPlayer();

    public NiceCar(){
        this.engine = new PowerEngine();
    }

//    public NiceCar(Engine engine) {
//        this.engine = engine;
//    }

    public void UpgradeEngine(){
        this.engine = new ElectricEngine();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        Player.start();
    }

    public void stopMusic(){
        Player.stop();
    }

}
