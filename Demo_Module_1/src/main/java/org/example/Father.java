package org.example;

public class Father implements FatherObject{
    public String name = "Biden";
//    private String name = "Biden";

    @Override
    public void method_1() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
