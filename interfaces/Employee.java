package interfaces;

//Employee declara implementação de Payable porém n implementa o método, por isso é declarada como abstract
public abstract class Employee implements Payable {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName,
            String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

}

/*Na herança única uma classe deriva da superclasse, na herança múltipla uma classe é derivada de mais de uma superclasse direta.
O java nao suporta herança multipla

Cada objeto de uma subclasse tb é um objeto da superclasse dessa classe. Entretanto, um obj de superclasse n é um objeto de subclasse de sua classe. Para realizar a atribuição de uma var que ref uma superclasse p uma subclasse tem que fazer downcast

O relacionamento é um representa herança. Um objeto de uma subclasse tb pode ser tratado como um objeto de superclasse

Um relacionamento tem um representa composição. Em um relacionamento tem um, um objeto de classe contem referencias a objetos de outras
classes*/
