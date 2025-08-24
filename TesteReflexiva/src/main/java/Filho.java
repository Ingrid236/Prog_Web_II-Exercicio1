public class Filho extends Pessoa {

    private String escola;

    public Filho(String nome, String escola) {
        super(nome);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }
    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String getTipoVoz() {
        return "Voz aguda e animada";
    }
}