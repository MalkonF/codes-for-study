package polimorfismo;

public class Tree extends Plant {

    @Override
    public void grow() {
        System.out.println("Tree Growing");
    }

    public void shedLeaves() {
        System.out.println("Leaves shedding");
    }

}
