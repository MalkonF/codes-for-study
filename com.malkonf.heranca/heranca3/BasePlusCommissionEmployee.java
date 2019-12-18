package heranca3;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {

        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + (commissionRate * grossSales); //comisionRate e grossSales sao var da superclasse
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary);
    }
}
/*as chamadas implícitas ocorrem qnd o construtor da superclasse é sem argumentos. Se a superclasse tiver
um construtor com argumentos a chamada tem que ser explicita*/
 /*Utilizar var protected somente qnd uma superclasse precisar fornecer um método somente para suas subclasses
e outras classes no mesmo pact e n p outros clientes. Se precisar fornecer serviços p classes de outro pct,
é melhor tornar var private e utilizar metodos set e get. 
Problemas ao usar protected:

*obj da subclasse podem definir valores dessas var sem as validação do set e get

As subclasses tem que depender somente dos serviços da superclasse(metodos get e set) e n de sua implementação. Pq se a implementação mudar na superclasse
aí vc vai te que mudar na subclasse*/
