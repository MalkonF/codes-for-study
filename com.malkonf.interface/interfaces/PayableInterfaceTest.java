package interfaces;

public class PayableInterfaceTest {

    public static void main(String[] args) {

        Payable[] payableObjects = new Payable[4];

        // obj que implementam payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.println("Invoices and Employees processed polymorphically:");

        for (Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount());
        }
    }
}
/*Atribuir uma ref de subclasse a uma var de superclasse é seguro, pq o obj de subclasse é um obj de sua superclasse. A var da supeclasse, porém pode ser utilizada p ref apenas membros da superclasse

Métodos finais n podem ser sobrescritos.
Classe finais n podem ser estendidas

N chame métodos que podem ser sobrescritos a partir de construtores. Ao criar um obj de subclasse, o construtor chama primeiramente um dos construtores da superclasse direta. Se o construtor da superclasse chama um método q pode ser sobrescrito, a versão da subclasse desse método será chamada pelo construtor da superclasse, antes de o corpo do construtor da subclasse ter a chance de executar.

Só é aceitável chamar um método static a partir de construtores. Se o cod de validação no construtor e no método get set for curto, é aceitavel duplicá-lo no construtor e no método set. Se n for, define um método de validação static private e então chame do construtor e método set. Método de instância final tb são aceitáveis.*/
