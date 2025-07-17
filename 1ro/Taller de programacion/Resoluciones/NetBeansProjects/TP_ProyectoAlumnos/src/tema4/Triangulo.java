

package tema4;


public class Triangulo extends Figura {
    private double lado1,lado2,lado3;

    public Triangulo(double lado1, double lado2, double lado3, String colorRelleno, String colorLinea) {
        super(colorRelleno,colorLinea);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    public double calcularPerimetro (){
        return this.getLado1()+ this.getLado2() + this.getLado3();
    }
    
    public double calcularArea (){
        double s = this.calcularPerimetro() / 2;
        double intermedio = s*(s-this.getLado1())*(s-this.getLado2())*(s-this.getLado3());
        return Math.sqrt(intermedio);
    }

    @Override
    public String toString() {
        String aux;
        aux = super.toString(); 
        return "Triangulo{" + aux + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
    
    
}
