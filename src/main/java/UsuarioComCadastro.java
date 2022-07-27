public abstract class UsuarioComCadastro implements Usuario{
    private String nomeUsuario;
    private String login;
    private String senha;

    public UsuarioComCadastro(String nomeUsuario, String login, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.login = login;
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public abstract String aceitar(Visitor visitor);
}
