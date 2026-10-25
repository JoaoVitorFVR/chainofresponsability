package org.example;

public class TipoProblemaSeguranca implements TipoProblema {
    private static final TipoProblemaSeguranca instancia = new TipoProblemaSeguranca();

    private TipoProblemaSeguranca() {}

    public static TipoProblemaSeguranca getTipoProblemaSeguranca() {
        return instancia;
    }
}