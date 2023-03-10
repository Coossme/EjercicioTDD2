import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperacionesTDD {
    public int operacion (String numero) {
        if (numero.substring(0, 1).equals(",") || numero.substring(numero.length() - 1, numero.length()).equals(",")){
            return -1;
        }
        if (numero.equals("")) {
            return 0;
        }
        String coma[] = numero.split(",");
        int suma=0;
        for (int i = 0; i < coma.length; i++) {
            if (coma[i].equals("")){
                return -1;
            }
            int total = Integer.valueOf(coma[i]);
            suma = suma + total;
        }

        return suma;
    }

}
