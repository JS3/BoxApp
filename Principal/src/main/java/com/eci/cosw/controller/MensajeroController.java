package com.eci.cosw.controller;

import com.eci.cosw.model.Mensajero;
import com.eci.cosw.stub.MensajeroStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mensajero")
public class MensajeroController {

    @Autowired
    private MensajeroStub mensajeroStub;

    @RequestMapping(method = RequestMethod.GET)
    public List<Mensajero> getMensajeros() {
        return mensajeroStub.getMensajeros();
    }

    @RequestMapping(value = "/{idMensajero}", method = RequestMethod.GET)
    public Mensajero getMensajeroById(@PathVariable("idMensajero") Integer idMensajero) {
        return mensajeroStub.getMensajeroById(idMensajero);
    }

    @RequestMapping(value = "/{cedulaMensajero}", method = RequestMethod.GET)
    public Mensajero getMensajeroByCedula(@PathVariable("cedulaMensajero") Integer cedulaMensajero) {
        return mensajeroStub.getMensajeroCedula(cedulaMensajero);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addMensajero(Mensajero mensajero){
        mensajeroStub.addMensajeros(mensajero);
    }

}
