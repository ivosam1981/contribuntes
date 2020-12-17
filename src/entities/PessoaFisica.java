package entities;

public class PessoaFisica extends Pessoa{
    private Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String name, double renda, Double gastosSaude) {
        super(name, renda);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        double total = 0d;
        if (gastosSaude == 0) {
            if(renda < 20000.00){
                total = renda * 0.15;
            }else{
                total = renda * 0.25;
            }

        }else{
            if(renda < 20000.00){
                total = renda * 0.15 - (gastosSaude * 0.50);
            }else{
                total = renda * 0.25 - (gastosSaude * 0.50);
            }
        }
        return total;
    }
}
