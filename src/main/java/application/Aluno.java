package application;

public class Aluno implements Observavel {
    private String nome;
    private int idade;

    public Aluno (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String getClassStatus() {
        return "Nome: " + this.nome + ", Idade: " + this.idade;   
    }
        
}
