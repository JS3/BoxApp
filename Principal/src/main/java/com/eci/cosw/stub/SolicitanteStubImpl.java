package com.eci.cosw.stub;

import com.eci.cosw.model.Solicitante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SolicitanteStubImpl implements SolicitanteStub {

    private List<Solicitante> solicitanteList= new ArrayList<>();


    @Override
    public List<Solicitante> getSolicitantes() {

        return this.solicitanteList;
    }

    @Override
    public Solicitante getSolicitanteById(int id) {
        Solicitante solicitante = null;

        for(int i=0; i <= solicitanteList.size(); i++) {
            Solicitante s = solicitanteList.get(i);
            if (s.getIdSolicitante() == id) {
                solicitante = s;
            }
        }
        return solicitante;
    }

    @Override
    public Solicitante getSolicitanteByCedula(int cedula) {
        Solicitante solicitante = null;

        for(int i=0; i <= solicitanteList.size(); i++) {
            Solicitante s = solicitanteList.get(i);

            if (s.getCedula() == cedula) {
                solicitante = s;
            }
        }
        return solicitante;
    }

    @Override
    public void addSolicitante(Solicitante solicitante) {
        solicitanteList.add(solicitante);
    }
}
