
public class ThisTest {

    public static void main(String[] args) {

        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

class SimpleTime {

    private int hour;
    private int minute;
    private int second;

    public SimpleTime(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String buildString() {

        return String.format("%24s: %s%n%24s: %s",
                "this.toUniversalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    } //this implícito e explícito p chamar o método

    public String toUniversalString() {

        return String.format("%02d:%02d:%02d",
                this.hour, this.minute, this.second);
    }
}
/*cada obj pode acessar 1 ref de si próprio com this. Quando 1 método de instância é chamado por um obj 
particular, o corpo do método utiliza implicitamente this para referenciar as var d instância do objeto 
e outos métodos. Isso permite que o código da classe saiba qual obj manipular*/

 /*Vc pode declarar várias classes em um único arquivo, mas só uma deve ser pública. Vai ser gerado varios
.class de acordo com cada classe*/
