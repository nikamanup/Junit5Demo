package org.example;

public class Passenger {
    private String name;
    private boolean isVip;

    public  Passenger(String name,boolean isVip){
        this.isVip=isVip;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", isVip=" + isVip +
                '}';
    }
}
