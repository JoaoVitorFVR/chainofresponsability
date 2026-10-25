package org.example;

public class TecnicoEspecialista extends Tecnico {

    public TecnicoEspecialista(Tecnico superior) {
        listaProblemas.add(TipoProblemaSeguranca.getTipoProblemaSeguranca());
        setTecnicoSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Especialista";
    }
}
