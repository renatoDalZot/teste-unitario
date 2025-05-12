import org.db.DescontoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DescontoServiceTest {

    private final DescontoService descontoService = new DescontoService();

    @Test
    void deveRetornarValorSemDescontoQuandoCompraMenorQue100() {
        double resultado = descontoService.aplicarDesconto(50.0);
        assertEquals(50.0, resultado);
    }

    @Test
    void deveAplicar10PorCentoDeDescontoQuandoCompraEntre100e500() {
        double resultado = descontoService.aplicarDesconto(200.0);
        assertEquals(180.0, resultado);
    }

    @Test
    void deveAplicar20PorCentoDeDescontoQuandoCompraMaiorQue500() {
        double resultado = descontoService.aplicarDesconto(1000.0);
        assertEquals(800.0, resultado);
    }

    @Test
    void deveLancarExcecaoQuandoValorForZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            descontoService.aplicarDesconto(0);
        });
    }

    @Test
    void deveLancarExcecaoQuandoValorForNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            descontoService.aplicarDesconto(-50);
        });
    }
}



