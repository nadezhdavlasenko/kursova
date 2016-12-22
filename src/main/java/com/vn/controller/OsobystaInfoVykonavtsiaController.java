package com.vn.controller;

import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.service.OsobystaInfoVykonavtsiaService;
import com.vn.service.PidrozdilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Таня on 21.12.2016.
 */
@RestController
@RequestMapping(path = "/osobystaInfoVykonavtsia")
public class OsobystaInfoVykonavtsiaController {
    @Autowired
    private OsobystaInfoVykonavtsiaService osobystaInfoVykonavtsiaService;

    @Autowired
    private PidrozdilService pidrozdilService;

    @RequestMapping(path = "/{idVykonavcia}")
    public OsobystaInfoVykonavtsia getById(@PathVariable long idVykonavcia) {
        return osobystaInfoVykonavtsiaService.getById(idVykonavcia);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public OsobystaInfoVykonavtsia addOsobystaInfoVykonavtsia(@RequestBody OsobystaInfoVykonavtsia osobystaInfoVykonavtsia) {
        return osobystaInfoVykonavtsiaService.addOsobystaInfoVykonavtsia(osobystaInfoVykonavtsia);
    }

    @RequestMapping(value = "/delete/{idVykonavcia}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idVykonavcia") Long idVykonavcia) {

        osobystaInfoVykonavtsiaService.delete(idVykonavcia);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public OsobystaInfoVykonavtsia editOsobystaInfoVykonavtsia(@RequestBody OsobystaInfoVykonavtsia osobystaInfoVykonavtsia) {
        return osobystaInfoVykonavtsiaService.editOsobystaInfoVykonavtsia(osobystaInfoVykonavtsia);
    }

    @RequestMapping
    public List<OsobystaInfoVykonavtsia> getAll() {
        return osobystaInfoVykonavtsiaService.getAll();}

    @RequestMapping(path = "/{identyfKod}")
    public List<OsobystaInfoVykonavtsia> getAllByIdentyfKod(@PathVariable long identyfKod) {
        return osobystaInfoVykonavtsiaService.getAllByIdentyfKod(identyfKod);}

    @RequestMapping(path = "/korotkaNazva/{korotkaNazva}")
    public List<OsobystaInfoVykonavtsia> getAllByPib(@PathVariable String pib) {
        return osobystaInfoVykonavtsiaService.getAllByPib(pib);}

    @RequestMapping(path = "/{vydVydannia}")
    public List<OsobystaInfoVykonavtsia> getAllByDataPryiomuNaRobotuBetween(@PathVariable Date dataPryiomuNaRobotu1,
                                                                    @PathVariable Date dataPryiomuNaRobotu2) {
        return osobystaInfoVykonavtsiaService.getAllByDataPryiomuNaRobotuBetween(dataPryiomuNaRobotu1, dataPryiomuNaRobotu2);}

    @RequestMapping(path = "/{idPidrozdilu}")
    public List<OsobystaInfoVykonavtsia> getAllByPidrozdil(@PathVariable long idPidrozdilu) {
        return osobystaInfoVykonavtsiaService.getAllByPidrozdil(pidrozdilService.getById(idPidrozdilu));
    }

}
