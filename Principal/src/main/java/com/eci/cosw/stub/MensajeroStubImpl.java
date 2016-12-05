package com.eci.cosw.stub;


import com.eci.cosw.model.Mensajero;
import com.eci.cosw.model.Solicitante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MensajeroStubImpl implements MensajeroStub{

    private List<Mensajero> mensajeros = new ArrayList<>();

    @Override
    public List<Mensajero> getMensajeros() {
        return mensajeros;
    }

    @Override
    public Mensajero getMensajeroById(int id) {
        Mensajero mensajero = null;

        for(int i=0; i <= mensajeros.size(); i++) {
            Mensajero m = mensajeros.get(i);

            if (m.getIdSolicitante() == id) {
                mensajero = m;
            }
        }
        return mensajero;
    }

    @Override
    public Mensajero getMensajeroCedula(int cedula) {
        Mensajero mensajero = null;

        for(int i=0; i <= mensajeros.size(); i++) {
            Mensajero m = mensajeros.get(i);

            if (m.getCedula() == cedula) {
                mensajero = m;
            }
        }
        return mensajero;
    }

    @Override
    public void addMensajeros(Mensajero mensajero) {
        mensajeros.add(mensajero);
    }
    
//    @Override
//    public void addMensajeroBySolicitante(Solicitante solicitante) {
//        mensajeros.add(new Mensajero(
//                solicitante.getIdSolicitante(), solicitante.getNombre(), solicitante.getPrimerApellido(), solicitante.getSegundoApellido(), 
//                solicitante.getCedula(), solicitante.getEdad(), solicitante.getFechaNacimiento(), solicitante.getTelefono(), 
//                solicitante.getDireccion(), solicitante.getPais(), solicitante.getMunicipio(), solicitante.getCodigoPostal(), 0
//            ));
//    }
}
