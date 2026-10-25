package org.example;

public class TecnicoN2 extends Tecnico {

    public TecnicoN2(Tecnico superior) {
        listaProblemas.add(TipoProblemaRede.getTipoProblemaRede());
        setTecnicoSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Técnico N2";
    }
}