package com.puppy.pengtg.abstractfactorymode;

public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
