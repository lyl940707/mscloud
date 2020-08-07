package com.chain;

public abstract class Handle {
    private Handle nextHandle;

    public Handle getNextHandle() {
        return nextHandle;
    }

    public void setNextHandle(Handle nextHandle) {
        this.nextHandle = nextHandle;
    }
    abstract void request(int i);
}
