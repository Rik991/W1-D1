public class ExerciseThree {

    public static double perimetroRettangolo (double lato, double altezza){
        double perimetro = (lato * 2) + (altezza * 2);
        System.out.println(perimetro);
        return  perimetro;
    }

    public static int pariDispari (int numero){
        if(numero % 2 == 0){
            System.out.println("Il numero è pari");
            return 0;
        }else { System.out.println("Il numero è dispari");return 1; }
    }

    public static double areaTriangolo (double base, double altezza){
        double areaTriangolo = (base * altezza)/2;
        System.out.println("L'area del triangolo è " + areaTriangolo);
        return areaTriangolo;
    }

    public static void main(String[] args) {
        perimetroRettangolo(5.4,4);
        pariDispari(4);
    areaTriangolo(50.5,42.8);

    }
}
