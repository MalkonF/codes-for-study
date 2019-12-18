package polimorfismo;

public class App {

    public static void main(String[] args) {
        
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = plant1; //isso é valido pq plant1 e 2 são objetos do mesmo tipo ref(Class Plant)
        Plant plant3 = tree; //polimorfismo, funciona pq Tree estendeu Plant

        plant3.grow(); //vai chamar grow de tree pq plant3 atualmente aponta para 3, essa é a sacada do polimorfismo

        tree.shedLeaves();

        Plant plant4 = new Plant();
        plant4.grow();/*aqui vai chamar grow() de Plant pq é uma nova referência, se for uma variável q 
        ja foi inicializada n daria certo*/

        doGrow(tree);//Tree estende Plant por isso se torna um tipo Plant

    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }

}
/*O centro do polimorfismo é poder usar uma child class sempre onde vc poderia usar uma super*/
