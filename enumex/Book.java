package enumex;

//const enum são implicitamente final
//const enum são implicitamente static
//a tentativa de criar um obj do tipo enum com o operador new resulta em um erro d compilação
/*As const enum podem ser utilizadas em qlqr lugar em q const padrão podem ser utilizadas, 
como nos rótulos case das instruções switch e p controlar instruções for aprimoradas*/
public enum Book {

    JHTP("Java", "2015"), //construtor enum . Pode ser sobrecarregado
    CHTP("C", "2013"), /*cada const é um obj do tipo Book e tem sua propria cópia das variaveis d instancia
    title e copyright*/
    IW3HTP("Internet", "2009");

    private final String title;
    private final String copyrightYear;

    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
