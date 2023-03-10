import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperacionesTDD {
    public int operacion (String numero) {
        if (numero.length()==0) {
            return 0;
        }
        if (numero.substring(0, 1).equals(",") || numero.substring(numero.length() - 1, numero.length()).equals(",")){
            return -1;
        }
        String coma[] = numero.split(",");
        int suma=0;
        for (int i = 0; i < coma.length; i++) {
            if (coma[i].equals("")){
                return -1;
            }
            int total = Integer.valueOf(coma[i]);
            if (total < 0){
                System.out.println("Número negativo no permitido");
                return -1;
            }
            suma = suma + total;
        }

        return suma;
    }

}
