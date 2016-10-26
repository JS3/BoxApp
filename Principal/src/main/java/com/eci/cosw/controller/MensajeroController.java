package com.eci.cosw.controller;

import com.eci.cosw.model.Mensajero;
import com.eci.cosw.model.Solicitante;
import com.eci.cosw.stub.MensajeroStub;
import com.eci.cosw.stub.SolicitanteStub;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose
 */
@RestController
@RequestMapping(value = "/mensajero")
public class MensajeroController {
    
    @Autowired
    SolicitanteStub solicitanteStub;
    @Autowired
    MensajeroStub mensajeroStub;
    
    @RequestMapping(value = "/{idMensajero}", method = RequestMethod.GET)
    public Mensajero getMensajeroeById(@PathVariable ("idMensajero") int id) {return mensajeroStub.getMensajero(id);}
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Mensajero> getListaMensajero() {return mensajeroStub.getListaMensajeros();}

    @RequestMapping(method = RequestMethod.POST)
    public void addMensajeroId(@RequestBody Solicitante s) {mensajeroStub.addMensajero(solicitanteStub.getSolicitante(s.getIdSolicitante()));}    
}
