package org.example;

public class TestBean {//в Spring bean и объект это примерно одно и то же
    // когда мы передадим спрингу этот класс, он из этого класса создаст, bean
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public TestBean(String name){
        this.name = name;
    }
}
