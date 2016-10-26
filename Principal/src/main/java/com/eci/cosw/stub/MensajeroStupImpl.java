/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.stub;

import com.eci.cosw.model.Mensajero;
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
public class MensajeroStupImpl implements MensajeroStub{

    private final List<Mensajero> mensajeros= new ArrayList<>();
    
    public MensajeroStupImpl() {
//        mensajeros.add(
//            new Mensajero(
//                1, "José", "Usme", "Monje", 01234, 
//                22, new Date(), 56789, "Calle 12-12", "País", "Municipio",
//                98760
//            )
//        );
    }
    
    @Override
    public Mensajero getMensajero(int idMensajero) {
        for(Mensajero m : mensajeros){if(idMensajero == m.getIdSolicitante()){return m;}}     
        return null;
    }
    
    @Override
    public List<Mensajero> getListaMensajeros() {
        return mensajeros;
    }

    @Override
    public void addMensajero(Solicitante solicitante) {
        mensajeros.add(
            new Mensajero(
                solicitante.getIdSolicitante(), solicitante.getNombre(), solicitante.getPrimerApellido(), solicitante.getSegundoApellido(), 
                solicitante.getCedula(), solicitante.getEdad(), solicitante.getFechaNacimiento(), solicitante.getTelefono(), 
                solicitante.getDireccion(), solicitante.getPais(), solicitante.getMunicipio(), solicitante.getCodigoPostal()
            )
        );
    }
    
}
