package entities;

public abstract class Pessoa {
    protected String name;
    protected Double renda;

    public Pessoa(){

    }

    public Pessoa(String name, double renda) {
        this.name = name;
        this.renda = renda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public abstract double imposto();
}
