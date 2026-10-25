package org.example;

public class TipoProblemaDesconhecido implements TipoProblema {
    private static final TipoProblemaDesconhecido instancia = new TipoProblemaDesconhecido();

    private TipoProblemaDesconhecido() {}

    public static TipoProblemaDesconhecido getTipoProblemaDesconhecido() {
        return instancia;
    }
}