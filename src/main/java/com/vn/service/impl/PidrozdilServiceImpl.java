package com.vn.service.impl;

import com.vn.entity.Pidrozdil;
import com.vn.repository.PidrozdilRepository;
import com.vn.service.PidrozdilService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public class PidrozdilServiceImpl implements PidrozdilService {

    @Autowired
    private PidrozdilRepository pidrozdilRepository;

    @Override
    public Pidrozdil addPidrozdil(Pidrozdil pidrozdil) {
        Pidrozdil savedPidrozdil = pidrozdilRepository.saveAndFlush(pidrozdil);

        return savedPidrozdil;
    }

    @Override
    public void delete(long idPidrozdilu) {
        pidrozdilRepository.delete(idPidrozdilu);
    }

    @Override
    public Pidrozdil getById(long idPidrozdilu) {
        return pidrozdilRepository.findById(idPidrozdilu);
    }

    @Override
    public Pidrozdil editPidrozdil(Pidrozdil pidrozdil) {
        return pidrozdilRepository.saveAndFlush(pidrozdil);
    }

    @Override
    public List<Pidrozdil> getAll() {
        return pidrozdilRepository.findAll();
    }
}
