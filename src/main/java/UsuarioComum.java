public class UsuarioComum extends UsuarioComCadastro {
    public UsuarioComum(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.listarFuncoesUsuarioComum(this);
    }
}
