package vehicles;

import products.IProduct;

public class Speedboat extends Vehicle implements IWaterVehicle, IMotorised {
    private String hullType;
    private IMotorised engine;

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, IMotorised engine){
        super(weight, maxSpeed, baseProduct);
        this.hullType = "round";
        this.engine = engine;
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    @Override
    public String startEngine(){
        return this.engine.startEngine();
    }

    @Override
    public String stopEngine(){
        return this.engine.stopEngine();
    }

    @Override
    public int getHp(){
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp){
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel(){
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel){
        this.engine.setFuel(fuel);
    }
}

