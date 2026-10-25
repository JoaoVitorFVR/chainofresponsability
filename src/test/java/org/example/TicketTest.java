package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    TecnicoEspecialista especialista;
    TecnicoN3 n3;
    TecnicoN2 n2;
    TecnicoN1 n1;

    @BeforeEach
    void setUp() {
        especialista = new TecnicoEspecialista(null);
        n3 = new TecnicoN3(especialista);
        n2 = new TecnicoN2(n3);
        n1 = new TecnicoN1(n2);
    }

    @Test
    void deveRetornarN1ParaProblemaSimples() {
        assertEquals("Técnico N1", n1.resolverTicket(new Ticket(TipoProblemaSimples.getTipoProblemaSimples())));
    }

    @Test
    void deveRetornarN2ParaProblemaRede() {
        assertEquals("Técnico N2", n1.resolverTicket(new Ticket(TipoProblemaRede.getTipoProblemaRede())));
    }

    @Test
    void deveRetornarN3ParaProblemaBancoDeDados() {
        assertEquals("Técnico N3", n1.resolverTicket(new Ticket(TipoProblemaBancoDeDados.getTipoProblemaBancoDeDados())));
    }

    @Test
    void deveRetornarEspecialistaParaProblemaSeguranca() {
        assertEquals("Especialista", n1.resolverTicket(new Ticket(TipoProblemaSeguranca.getTipoProblemaSeguranca())));
    }

    @Test
    void deveRetornarNaoResolvidoParaProblemaDesconhecido() {
        assertEquals("Não resolvido", n1.resolverTicket(new Ticket(TipoProblemaDesconhecido.getTipoProblemaDesconhecido())));
    }
}