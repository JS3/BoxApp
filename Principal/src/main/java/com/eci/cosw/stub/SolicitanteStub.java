/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.stub;


import com.eci.cosw.model.Solicitante;
import java.util.List;

/**
 * @author Santiago Carrillo
 */
public interface SolicitanteStub {

    Solicitante getSolicitante(int idSolicitante);
    
    List<Solicitante> getListaSolicitantes();

    void addSolicitante(Solicitante solicitante);
}
