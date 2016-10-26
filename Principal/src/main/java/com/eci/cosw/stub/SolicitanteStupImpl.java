/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.stub;

import com.eci.cosw.model.Solicitante;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author jose
 */
@Service
public class SolicitanteStupImpl implements SolicitanteStub{
    
    private final List<Solicitante> solicitantes= new ArrayList<>();

    public SolicitanteStupImpl() {
        solicitantes.add(
            new Solicitante(
                223, "José", "Usme", "Monje", 01234, 
                22, new Date(), 56789, "Calle 12-12", "País", "Municipio",
                98760
            )
        );
    }
    
    @Override
    public Solicitante getSolicitante(int idSolicitante) {        
        for(Solicitante s : solicitantes){if(idSolicitante == s.getIdSolicitante()){return s;}}     
        return null;
    }

    @Override
    public List<Solicitante> getListaSolicitantes() {
        return solicitantes;
    }

    @Override
    public void addSolicitante(Solicitante solicitante) {
        
        solicitantes.add(solicitante);
    }
}
