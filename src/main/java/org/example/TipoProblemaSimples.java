package org.example;

public class TipoProblemaSimples implements TipoProblema {
    private static final TipoProblemaSimples instancia = new TipoProblemaSimples();

    private TipoProblemaSimples() {}

    public static TipoProblemaSimples getTipoProblemaSimples() {
        return instancia;
    }
}