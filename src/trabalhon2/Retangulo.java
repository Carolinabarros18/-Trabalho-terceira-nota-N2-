
package trabalhon2;


public class Retangulo extends FiguraGeometrica {
            private double base ;
            private double area;
            private double altura;
            private double perimetro;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    @Override 
    public double calculararea(){
        this.area = this.getAltura() * this.getAltura();
        return this.area;
    }
   @Override 
   public double calcularperimetro (){
       this.perimetro = this.getAltura() *2 + this.getBase()*2;
               return this.perimetro;
   }
}
