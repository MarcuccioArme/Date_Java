import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProvaData {

    public static void main(String[] args) {

        Date d1 = null, d2 = null;
        double oraArrivo, oraPartenza, oraAttuale, tempoTrascorso;

        String d1Str = "17/01/2023 10:00";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm");

        try {

            d1 = formato.parse(d1Str);
            oraArrivo = d1.getTime();

            d2 = new Date();
            oraAttuale = d2.getTime();

            System.out.println("Arrivo: "+d1);
            System.out.println("Partenza: "+d2);
            tempoTrascorso = oraAttuale-oraArrivo;
            double numOre = tempoTrascorso/3600000;
            System.out.println("Tempo trascorso in ore: "+numOre);
            numOre = Math.ceil(numOre);
            System.out.println("Tempo trascorso in ore (arr.): "+numOre);

        } catch (ParseException e) {
            System.out.println("Formato data non valido.");
        }

    }

}