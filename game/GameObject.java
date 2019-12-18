package game;

public abstract class GameObject {

    public abstract void draw();

    /*método abstrato só vai declarar mas n vai implementar. Vc implementa na
classe que estender essa*/
    public static void main(String[] args) {

        /*GameObject s = new GameObject(); classes abastratam existem p serem estendidas e n p serem instanciadas. 
        Vc tb pode colocar métodos e var q n são abstratas numa classe que é abstrata*/
        Player player = new Player();
        player.someMethod();
        player.draw();

        GameObject menu = new Menu();
        menu.draw();

        GameObject[] gameObject = new GameObject[2];//guarda as 2 ref q GameObject têm, polimorfismo. 
        gameObject[0] = player; //Como as 2 classes extenderam GameObject, pode se fazer isto
        gameObject[1] = menu;

        for (GameObject obj : gameObject) {
            obj.draw();
        }
    }

}
