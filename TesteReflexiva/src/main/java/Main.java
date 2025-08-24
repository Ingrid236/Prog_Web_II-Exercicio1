public class Main {

    public static void main(String[] args) {

        // Instanciando o objeto com os parâmetros necessários
        Filho filho = new Filho("Pedro", "Escola Municipal");

        // Chamando o método de reflexão para analisar o objeto
        Reflexao.analisarObjeto(filho);
    }
}