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

    @Transactional(readOnly = true)
    public ClientDto findById(Long id) {
        Client entity = repository.findById(id).get();

        return new ClientDto(entity);
    }

    @Transactional
    public ClientDto insert(ClientDto dto) {
        Client entity = new Client();
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirtDate(dto.getBirtDate());
        entity.setChildren(dto.getChildren());

        entity = repository.save(entity);

        return new ClientDto(entity);
    }

    @Transactional
    public ClientDto update(Long id, ClientDto dto) {
        Client entity = repository.getOne(id);
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirtDate(dto.getBirtDate());
        entity.setChildren(dto.getChildren());

        entity = repository.save(entity);

        return new ClientDto(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}