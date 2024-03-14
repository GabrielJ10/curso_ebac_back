abstract class Pessoa {
    String nome;
    String endereco;

    Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
}

class PessoaFisica extends Pessoa {
    String cpf;

    PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }
}

class PessoaJuridica extends Pessoa {
    String cnpj;

    PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }
}
