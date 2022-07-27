public class UsuarioSemCadastro implements Usuario{
    public UsuarioSemCadastro() {
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.listarFuncoesSemCadastro(this);
    }
}
