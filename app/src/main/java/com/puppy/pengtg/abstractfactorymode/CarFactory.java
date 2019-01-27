package com.puppy.pengtg.abstractfactorymode;

public abstract class CarFactory {
    /*
    *生产轮胎
    *
    *@return 轮胎
    * */
    public abstract ITire createTire();
    /*
    *生产发动机
    *
    *@return 发动机
    * */
    public abstract IEngine createEngine();
    /*
    *生产刹车
    *
    *@return 刹车
    * */
    public abstract IBrake createBrake();
}
