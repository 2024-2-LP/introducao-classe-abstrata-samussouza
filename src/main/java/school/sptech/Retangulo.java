package school.sptech;

public class Retangulo extends Figura {
    private Double base;
    private Double altura;


    public Retangulo(){

    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    public Retangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
