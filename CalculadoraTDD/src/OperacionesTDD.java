import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperacionesTDD {
    public int operacion (String numero) {
        int fin = Integer.parseInt(numero);
        if (numero.equals("")) {
            return 0;
        }
        return fin;

    }

}
