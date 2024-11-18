public class ExerciseOne {
    public static int moltiplica (int x, int y){
        int result =  x*y;
        System.out.println(result);
        return result;
    };

    public static String concatena(String stringa, int x){
        String stringaFinale = stringa + x;
        System.out.println(stringaFinale);
                return stringaFinale;
    }

    public static String[] inserisciInArray (String[] array, String stringa){
        if(array.length > 5){
            System.out.println("inserisci 5 valori, ne più ne meno");
        }

        String[] arrayFinale = new String[6];

        for (int i = 0; i < 2 ; i++) {
            arrayFinale[i] = array[i];
        }

        arrayFinale[2] = stringa;

        for (int i = 2; i < array.length ; i++) {
            arrayFinale[i + 1] = array[i];
        }
        for (int i = 0; i < arrayFinale.length; i++) {
            System.out.println(arrayFinale[i]);
        }


        return arrayFinale;
    }

    public static void main(String[] args) {
      String [] arrayDiCinque = {"prima", "seconda", "terza", "quarta", "quinta"}; //array per l'ultima funzione
      moltiplica(5,6);
      concatena("Ciao sono il numero ", 5 );
      inserisciInArray(arrayDiCinque, "nuova");
    }
}
