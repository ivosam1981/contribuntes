package entities;

public class PessoaJuridica extends Pessoa{
    private Integer numeroFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String name, double renda, Integer numeroFuncionarios) {
        super(name, renda);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double imposto() {
        if(numeroFuncionarios > 10){
           return renda * 0.14;
        }else{
            return renda * 0.16;
        }
    }
}
