package entities;

public class Operacoes implements Usuarios {

    private String usuario;
    private String senha;

    public Operacoes(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public void logar(String usuario, String senha) {
        System.out.printf("Login feito com sucesso! Usuário: %s Senha: %s", usuario, senha);
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
