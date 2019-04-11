
import me.malkon.interfac3.Person;

public class Constants {

    public static final int COM_2 = 2;//const públicas boa prática, static tb já que ela n vai mudar o valor em cada instanciação
    public static final Person P1 = new Person("Malkon");//a ref da const P1 n pode mudar uma vez atribuída, mas os dados que ela referencia no objeto podem mudar

    public static void main(String[] args) {

        System.out.println(Math.PI);//PI é uma const static
        System.out.println(Constants.COM_2);
    }
}
