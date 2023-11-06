package domains;

public class Circulo {
    public static final double PI = 3.14;
    double raio;

    public Circulo(){}


    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void area(){
        double area =  PI * Math.pow(raio, 2);
        System.out.println("Area do circulo: " + area);
    }

    public void perimetro(){
        double perimetro = (2 * PI) * raio;
        System.out.println("Perimetro circulo: " + perimetro);
    }
}
