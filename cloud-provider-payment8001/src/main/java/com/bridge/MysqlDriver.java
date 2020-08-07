package com.bridge;

public class MysqlDriver implements Driver {
    @Override
    public void use() {
        System.out.println("使用了mysql数据库");
    }
}
