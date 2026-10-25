package org.example;

import java.util.ArrayList;

public abstract class Tecnico {

    protected ArrayList listaProblemas = new ArrayList();
    private Tecnico tecnicoSuperior;

    public Tecnico getTecnicoSuperior() {
        return tecnicoSuperior;
    }

    public void setTecnicoSuperior(Tecnico tecnicoSuperior) {
        this.tecnicoSuperior = tecnicoSuperior;
    }

    public abstract String getDescricaoCargo();

    public String resolverTicket(Ticket ticket) {
        if (listaProblemas.contains(ticket.getTipoProblema())) {
            return getDescricaoCargo();
        } else {
            if (tecnicoSuperior != null) {
                return tecnicoSuperior.resolverTicket(ticket);
            } else {
                return "Não resolvido";
            }
        }
    }
}