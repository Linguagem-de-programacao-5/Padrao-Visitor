public class UsuarioPrime extends UsuarioComCadastro {
    private String tipoAssinatura;
    private double precoAssinatura;
    private String dataVencimento;

    public UsuarioPrime(String nome, String login , String senha, String tipoAssinatura, double precoAssinatura, String dataVencimento) {
        super(nome, login, senha);
        this.tipoAssinatura = tipoAssinatura;
        this.precoAssinatura = precoAssinatura;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.listarFuncoesUsuarioPrime(this);
    }
}
