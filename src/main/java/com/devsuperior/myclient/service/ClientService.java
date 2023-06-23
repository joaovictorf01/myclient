package com.devsuperior.myclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.myclient.dto.ClientDto;
import com.devsuperior.myclient.entities.Client;
import com.devsuperior.myclient.repositories.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public Page<ClientDto> findAllPaged(PageRequest pageRequest) {
        Page<Client> list = repository.findAll(pageRequest);

        return list.map(x -> new ClientDto(x));
    }
}
