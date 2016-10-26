package com.eci.cosw.controller;

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

@RestController
@RequestMapping(value = "/solicitante")
public class SolicitanteController {

    @Autowired
    SolicitanteStub solicitanteStub;
    @Autowired
    MensajeroStub mensajeroStub;
    
    @RequestMapping(value = "/{idSolicitante}", method = RequestMethod.GET)
    public Solicitante getSolicitanteById(@PathVariable ("idSolicitante") int id) {return solicitanteStub.getSolicitante(id);}
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Solicitante> getListaSolicitante() {return solicitanteStub.getListaSolicitantes();}
    
    @RequestMapping(method = RequestMethod.POST)
    public void addSolicitante(@RequestBody Solicitante s) {solicitanteStub.addSolicitante(s);}
}
