package bean;

import java.time.format.DateTimeFormatter;

public class Aluno extends PessoaValidator {

    private String ra;
    private float ira;

    public Aluno() {
        super(); 
    }

    public Aluno(String nome, String cpf, int dia, int mes, int ano, char sexo, String telefone, String ra, float ira) {
        super(nome, cpf, dia, mes, ano, sexo, telefone); 
        this.ra = ra;
        this.ira = ira;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public float getIra() {
        return ira;
    }

    public void setIra(float ira) {
        this.ira = ira;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", dataNasc=" + getDataNasc().format(formatter) +
                ", sexo=" + getSexo() +
                ", telefone='" + getTelefone() + '\'' +
                ", ra='" + ra + '\'' +
                ", ira=" + ira +
                '}';
    }
}