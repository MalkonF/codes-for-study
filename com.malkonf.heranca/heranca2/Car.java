package heranca2;

public class Car extends Machine {

    //n é obrigatório mas se vc errar o nome do método o compilador vai avisar
    @Override
    public void start() {
        //System.out.println("Car starting...");
        super.start();
    }

    @Override
    public void stop() {

        super.stop();
    }//quando colocar extends machine, vc pode instanciar essa classe aqui e chamar os metodos da superclasse??

}
