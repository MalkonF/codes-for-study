package example;

public class AutoPolicyTeste {

    public static void main(String[] args) {

        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NU");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(AutoPolicy policy) {//Usa-se um método para receber objetos do tipo AutoPolicy para evitar repetição de cód. Ex: n precisa fazer policy1.get...policy2.get...

        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
    }
}
