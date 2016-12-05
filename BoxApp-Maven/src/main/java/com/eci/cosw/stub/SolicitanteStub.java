package com.eci.cosw.stub;

import com.eci.cosw.model.Solicitante;

import java.util.List;

public interface SolicitanteStub {

    List<Solicitante> getSolicitantes();

    Solicitante getSolicitanteById(int id);

    Solicitante getSolicitanteByCedula(int cedula);

    void addSolicitante(Solicitante solicitante);
}
