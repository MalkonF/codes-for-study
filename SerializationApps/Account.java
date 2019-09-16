package SerializationApps;

import java.io.Serializable;

/*A interface serializable é uma interface de tags. Ela não contém nenhum método. Qlqr classe
que implementa ela é marcada com tags como um obj serializable. Ai o ObjectOutpuStream so vai
enviar p saída objs que implementem Serializable.*/
public class Account implements Serializable {

    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    public Account() {
        this(0, "", "", 0.0); // chama outro construtor com esses valores
    }

    public Account(int account, String firstName,
            String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public void setAccount(int acct) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
/*Um obj serializado é representado como uma sequencia de bytes que inclui os dados do obj, 
bem como o tipo e a natureza dos dados.Depois que o obj serializado foi gravado em disco, ele
pode ser lido a partir do arquivo e deserializado.

Em uma classe serializable, cada var de instancia deve ser serializable. Var não serializable devem
ser declaradas transient p indicar que elas devem ser ignoradas durante o processo de serialização.
Todas as var primitivas são serializadas. String, array que são referencia tb são serializaveis
 */
