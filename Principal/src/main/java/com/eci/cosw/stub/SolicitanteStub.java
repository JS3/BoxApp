package com.eci.cosw.stub;

import com.eci.cosw.model.Solicitante;

import java.util.List;

public interface SolicitanteStub {

    List<Solicitante> getSolicitantes();

    Solicitante getSolicitanteById(Integer id);

    Solicitante getSolicitanteByCedula(Integer cedula);

    void addSolicitante(Solicitante solicitante);
}
