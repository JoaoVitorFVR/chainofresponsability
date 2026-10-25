package org.example;

public class TipoProblemaBancoDeDados implements TipoProblema {
    private static final TipoProblemaBancoDeDados instancia = new TipoProblemaBancoDeDados();

    private TipoProblemaBancoDeDados() {}

    public static TipoProblemaBancoDeDados getTipoProblemaBancoDeDados() {
        return instancia;
    }
}