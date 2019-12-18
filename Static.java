
class Thing {

    public String name;/*variavel de instância, faz parte de cada objeto q é criado a partir da classe, pode 
    ter vários valores*/
    public static String description;/*faz parte da classe só pode ter um valor associado a classe. 
    description será a mesma para todos objetos*/

    public static int count = 0;

    public int id;

    public Thing() {

        id = count;
        count++;
    }

    public void showName() {//nao é método static senão n acessa var instância
        System.out.println("Obj id:" + id + "," + description + name);
    }

    public static void showInfo() {
        System.out.println("Hello");
    }
}

public class Static {

    public static void main(String[] args) {

        Thing.description = "Description"; // var só pode ser acessada referenciando a classe, pois é static

        Thing.showInfo();

        System.out.println(Thing.count);

        System.out.println(Thing.description);
        //System.out.println(Thing.id); erro! pq uma variável n estática só pode ser acessada por objetos e n pela classe

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println(Thing.count);

        thing1.name = "Bob";
        thing2.name = "Sue";

        //System.out.println(thing1.name); bad practice, use get/show methods
        //System.out.println(thing2.name);
        thing1.showName();
        thing2.showName();
    }
}
//métodos static podem acessar var static, mas nao var de instância.
/*Se o método for static e vc tentar por dentro dele ref a uma var instância, vai dar erro, pq n faz sentido
pq var de instância n existe antes de criar objeto, e métodos static existe*/
//Métodos de instância podem acessar tanto dados n static e dados static
