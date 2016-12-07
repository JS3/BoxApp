package com.eci.cosw.stub;

import com.eci.cosw.model.Solicitante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SolicitanteStubImpl implements SolicitanteStub {

    private List<Solicitante> solicitanteList= new ArrayList<>();

    public SolicitanteStubImpl(){
        solicitanteList.add(
            new Solicitante(
                223, "José", "Usme", "Monje", 01234, 
                22, new Date(), 56789, "Calle 12-12", "País", "Municipio",
                98760
            )
        );
//        Solicitante solicitante = new Solicitante(12, "José");
//        solicitanteList.add(solicitante);
    }

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
                return s;
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
