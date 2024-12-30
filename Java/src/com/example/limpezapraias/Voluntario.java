public class Voluntario extends Usuario {

    public Voluntario(String nome, String email) {
        super(nome, email);
    }

    public Relatorio reportar(Praia praia, String descricao) {
        praia.setSuja(true);
        return new Relatorio(praia, descricao, this);
    }
}
