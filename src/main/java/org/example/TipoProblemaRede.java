package org.example;

public class TipoProblemaRede implements TipoProblema {
    private static final TipoProblemaRede instancia = new TipoProblemaRede();

    private TipoProblemaRede() {}

    public static TipoProblemaRede getTipoProblemaRede() {
        return instancia;
    }
}