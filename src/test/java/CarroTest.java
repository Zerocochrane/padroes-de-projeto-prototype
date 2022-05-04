import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Carro carro = new Carro("Ford Fiesta", 35000);

        Carro carroClone = carro.clone();
        carroClone.setNomeModelo("Ford Focus");

        assertEquals("Carro{nomeModelo='Ford Fiesta', preco=35000}", carro.toString());
        assertEquals("Carro{nomeModelo='Ford Focus', preco=35000}", carroClone.toString());
    }

}