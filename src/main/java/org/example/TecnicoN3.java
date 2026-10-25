package org.example;

public class TecnicoN3 extends Tecnico {

    public TecnicoN3(Tecnico superior) {
        listaProblemas.add(TipoProblemaBancoDeDados.getTipoProblemaBancoDeDados());
        setTecnicoSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Técnico N3";
    }
}