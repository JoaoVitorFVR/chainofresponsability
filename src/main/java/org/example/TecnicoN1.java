package org.example;

public class TecnicoN1 extends Tecnico {

    public TecnicoN1(Tecnico superior) {
        listaProblemas.add(TipoProblemaSimples.getTipoProblemaSimples());
        setTecnicoSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Técnico N1";
    }
}