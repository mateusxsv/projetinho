package entities;

public class Cliente implements Usuarios {
    private String usuario;
    private String senha;

    public Cliente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public void logar(String usuario, String senha) {
        System.out.printf("Login de cliente feito com sucesso! Usuário: %s Senha: %s", usuario, senha);
    }

}
