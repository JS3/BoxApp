package com.eci.cosw.controller;

import com.eci.cosw.model.Mensajero;
import com.eci.cosw.model.Solicitante;
import com.eci.cosw.stub.MensajeroStub;
import com.eci.cosw.stub.SolicitanteStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/mensajero")
public class MensajeroController {

    @Autowired
    SolicitanteStub solicitanteStub;
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

//    @RequestMapping(method = RequestMethod.POST)
//    public void addMensajero(Mensajero mensajero){
//        mensajeroStub.addMensajeros(mensajero);
//    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addMensajero(@RequestBody Mensajero mensajero){
        mensajeroStub.addMensajeros(mensajero);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    
//    @RequestMapping(method = RequestMethod.POST)
//    public void addMensajeroId(@RequestBody Solicitante s) {mensajeroStub.addMensajeroBySolicitante(solicitanteStub.getSolicitanteById(s.getIdSolicitante()));}    

//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<?> addSolicitante(@RequestBody Solicitante solicitante){
//        solicitanteStub.addSolicitante(solicitante);
//        return new ResponseEntity<>(HttpStatus.ACCEPTED);
//    }


}
