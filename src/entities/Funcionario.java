package entities;

public class Funcionario implements Usuarios {

    private String usuario;
    private String senha;
    public Funcionario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void logar(String usuario, String senha) {
        System.out.printf("Login de funcionário feito com sucesso! Usuário: %s Senha: %s", usuario, senha);
    }

}
