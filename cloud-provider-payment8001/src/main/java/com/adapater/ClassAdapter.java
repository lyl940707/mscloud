package com.adapater;

public class ClassAdapter extends Adaptee implements Adapter {
    @Override
    public void provide() {
        run();
    }
}
