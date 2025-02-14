package bean;

import java.time.LocalDate;
import primeirojava.Pessoa;

public class PessoaValidator {
    private int cod;
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private char sexo;
    private String telefone;

    
    public PessoaValidator() {
    }

    
    public PessoaValidator(String nome, String cpf, int dia, int mes, int ano, char sexo, String telefone) {
        this.nome = nome;
        setCpf(cpf);
        this.dataNasc = LocalDate.of(ano, mes, dia);
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        int status = Pessoa.validaCpf(cpf);

        switch (status) {
            case 0:
                this.cpf = cpf; // CPF válido
                break;

            case 1:
                throw new CpfInvalidoException("Erro: CPF deve conter exatamente 11 dígitos.");

            case 2:
                throw new CpfInvalidoException("Erro: CPF deve conter apenas números.");

            case 3:
                throw new CpfInvalidoException("Erro: CPF não pode ter todos os dígitos iguais.");

            case 4:
                throw new CpfInvalidoException("Erro: CPF inválido. Os dígitos verificadores não conferem.");

            default:
                throw new CpfInvalidoException("Erro desconhecido ao validar CPF.");
        }
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}