import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperacionesTDD {
    public int operacion (String numero) {
        if (numero.equals("")) {
            return 0;
        }
        String coma[] = numero.split(",");
        int suma=0;
        for (int i = 0; i < coma.length; i++) {
            int total = Integer.valueOf(coma[i]); ;
            suma = suma + total;
        }
        return suma;
    }

}
