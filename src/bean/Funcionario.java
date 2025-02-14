package bean;

public abstract class Funcionario extends PessoaValidator {

    private int codFuncional; 
    
    
    public Funcionario() {
        super();
    }

   
    public Funcionario(String nome, String cpf, int diaNasc, int mesNasc, int anoNasc, char sexo, int codFuncional, String telefone) {
        super(nome, cpf, diaNasc, mesNasc, anoNasc, sexo, telefone);
        this.setCodFuncional(codFuncional); 
    }

  

    
    public int getCodFuncional() {
        return codFuncional;
    }

  
    public void setCodFuncional(int codFuncional) {
        if (codFuncional <= 0) {
            throw new IllegalArgumentException("Código funcional deve ser maior que zero.");
        }
        this.codFuncional = codFuncional;
    }

    @Override
    public String toString() {
        String resultado = super.toString();
        resultado += "\nCódigo Funcional: " + codFuncional;
        return resultado;
    }
} 