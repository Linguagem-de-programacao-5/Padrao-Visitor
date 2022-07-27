import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioVisitorTest {

    @Test
    void deveExibirFuncoesUsuarioSemCadastro(){
        UsuarioSemCadastro usuarioSemCadastro = new UsuarioSemCadastro();

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Usuario sem cadastro só pode assistir a live!", visitor.listaFuncoes(usuarioSemCadastro));
    }

    @Test
    void deveExibirFuncoesUsuarioComum(){
        UsuarioComum usuarioComum = new UsuarioComum("Jose", "jose0102", "semSenha");

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Olá Jose, suas opções são : \n" +
                "Curtir \n" +
                "Comentar", visitor.listaFuncoes(usuarioComum));
    }

    @Test
    void deveExibirFuncoesUsuarioPrime(){
        UsuarioPrime usuarioPrime = new UsuarioPrime("Maria", "jose0102", "semSenha", "Anual", 90.0, "01/01/2023");

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Olá Maria, suas opções são : \n" +
                "Curtir \n" +
                "Comentar \n" +
                "Chat Privado \n" +
                "Participação em sorteios", visitor.listaFuncoes(usuarioPrime));
    }
}