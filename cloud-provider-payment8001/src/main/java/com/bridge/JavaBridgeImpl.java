package com.bridge;

public class JavaBridgeImpl extends JavaBridge {
    @Override
    public void use() {
        getDriver().use();
    }
}
