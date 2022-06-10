# metodos-java-teceira-aula
Retornos
return  lado1 * lado2;
}

 public static double area(double baseMaior, double baseMenor, double altura) {

     return ((baseMaior + baseMenor) * altura) / 2;
 }

 public static void xpto() {

        System.out.println("Antes");
        return;
 }

   public static double abc() {
        return 1.6;
   }
}

# package dio.com.br;

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

# Resultado
Exercicios retornos
Area do quadrado:9.0
Area do retangulo:25.0
Area do trapezio:67.5

Process finished with exit code 0
