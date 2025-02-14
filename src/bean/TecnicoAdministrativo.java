package bean;

public class TecnicoAdministrativo extends Funcionario {

    private String departamento;
    
    public TecnicoAdministrativo() {
        super();
    }
   
    public TecnicoAdministrativo(String nome, String cpf, int diaNasc, int mesNasc, int anoNasc, char sexo, int codFuncional, String departamento, String telefone) {
        super(nome, cpf, diaNasc, mesNasc, anoNasc, sexo, codFuncional, telefone);
        this.setDepartamento(departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Departamento não pode ser nulo ou vazio.");
        }
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        String resultado = super.toString();
        resultado += "\nDepartamento: " + departamento;
        return resultado;
    }
}