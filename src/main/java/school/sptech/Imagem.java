package school.sptech;


import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private  List<Figura> figuras;

    public Imagem(){}

    public Imagem(List<Figura> figuras) {
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura){
        figuras.add(figura);
    }
    public Double calcularSomaDasAreas(){
        Double somaAreas = 0.0;
        for (Figura figura : figuras){
            somaAreas += figura.calcularArea();
        }
        return somaAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasArea = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20){
                figurasArea.add(figura);
            }
        }
        return figurasArea;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> figurasQuadrados = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                figurasQuadrados.add(figura);
            }
        }

        return figurasQuadrados;
    }
}
