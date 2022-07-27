public interface Visitor {
    String listarFuncoesUsuarioComum(UsuarioComum usuarioComum);
    String listarFuncoesUsuarioPrime(UsuarioPrime usuarioPrime);
    String listarFuncoesSemCadastro(UsuarioSemCadastro usuarioSemCadastro);
}
