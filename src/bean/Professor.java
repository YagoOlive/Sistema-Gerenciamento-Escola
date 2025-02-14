package bean;

public class Professor extends Funcionario {

    private String areaAtuacao; 
    
    public Professor(){
        super(); 
    }

    public Professor(String nome, String cpf, int diaNasc, int mesNasc, int anoNasc, char sexo, int codFuncional, String areaAtuacao, String telefone) {
        super(nome, cpf, diaNasc, mesNasc, anoNasc, sexo, codFuncional, telefone);
        this.setAreaAtuacao(areaAtuacao); 
    }
  
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        if (areaAtuacao == null || areaAtuacao.trim().isEmpty()) {
            throw new IllegalArgumentException("Área de atuação não pode ser nula ou vazia.");
        }
        this.areaAtuacao = areaAtuacao;
    }

    
    @Override
    public String toString() {
        String resultado = super.toString();
        resultado += "\nÁrea de Atuação: " + areaAtuacao;
        return resultado;
    }
}