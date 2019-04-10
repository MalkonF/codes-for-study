package me.malkon.interfac3;

public class Machine implements Info {

    private int id = 7;

    public void start() {
        System.out.println("Machine starting...");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine id is" + id);

    }

}//uma classe pode implementar várias interfaces
