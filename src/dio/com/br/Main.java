package dio.com.br;

public class Main {

    public static void main(String[] args) {

        //retornos
        System.out.println("Exercicios retornos");

        double areaQuadrado = Quadrilatero.area(3);
System.out.println("Area do quadrado:" + areaQuadrado);

double areaRetangulo = Quadrilatero.area(5,5);
System.out.println("Area do retangulo:" + areaRetangulo);

double areaTrapezio = Quadrilatero.area(7,8,9);
System.out.println("Area do trapezio:" + areaTrapezio);

}
}