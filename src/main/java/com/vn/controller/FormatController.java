package com.vn.controller;

import com.vn.entity.Format;
import com.vn.entity.Techcard;
import com.vn.service.FormatService;
import com.vn.service.TechcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nadezhda on 20.12.16.
 */
@RestController
@RequestMapping(path = "/formaty")
public class FormatController {

    @Autowired
    private FormatService formatService;

    @RequestMapping(path = "/{idFormatu}")
    public Format getById(@PathVariable long idFormatu) {
        return formatService.getById(idFormatu);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public Format addFormat(@RequestBody Format format) {
        return formatService.addFormat(format);
    }

    @RequestMapping(value = "/delete/{idFormatu}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idFormatu") Long idFormatu) {

        formatService.delete(idFormatu);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public Format editFormat(@RequestBody Format format) {
        return formatService.editFormat(format);
    }

    @RequestMapping
    public List<Format> getAll() {
        return formatService.getAll();}

    @RequestMapping(path = "/nazvaFormatu")
    public List<Format> getOneByNazvaFormatu(@RequestParam(value="nazvaFormatu", required=true) String nazvaFormatu) {
        return formatService.getOneByNazvaFormatu(nazvaFormatu);}
}
