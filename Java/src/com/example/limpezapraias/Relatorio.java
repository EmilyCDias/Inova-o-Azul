public class Relatorio {
    private Praia praia; // Agregação
    private String descricao;
    private Usuario responsavel; // Composição: Relatorio é composto por um Usuario

    public Relatorio(Praia praia, String descricao, Usuario responsavel) {
        this.praia = praia;
        this.descricao = descricao;
        this.responsavel = responsavel;
    }

    public Praia getPraia() {
        return praia;
    }

    public String getDescricao() {
        return descricao;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }
}
