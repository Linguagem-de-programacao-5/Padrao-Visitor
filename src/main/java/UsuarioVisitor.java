public class UsuarioVisitor implements Visitor{

    public String listaFuncoes(Usuario usuario){
        return usuario.aceitar(this);
    }

    @Override
    public String listarFuncoesUsuarioComum(UsuarioComum usuarioComum) {
        return "Olá " + usuarioComum.getNomeUsuario() + ", suas opções são : \nCurtir \nComentar";
    }

    @Override
    public String listarFuncoesUsuarioPrime(UsuarioPrime usuarioPrime) {
        return "Olá " + usuarioPrime.getNomeUsuario() + ", suas opções são : \nCurtir \nComentar \nChat Privado \nParticipação em sorteios";
    }

    @Override
    public String listarFuncoesSemCadastro(UsuarioSemCadastro usuarioSemCadastro) {
        return "Usuario sem cadastro só pode assistir a live!";
    }
}
