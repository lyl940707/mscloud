package com.bridge;


public abstract class JavaBridge {
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public abstract void use();
}
