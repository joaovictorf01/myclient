package com.devsuperior.myclient.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.myclient.entities.Client;

public class ClientDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private Instant birtDate;
    private Integer children;

    public ClientDto() {

    }

    public ClientDto(Long id, String name, String cpf, Double income, Instant birtDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birtDate = birtDate;
        this.children = children;
    }

    public ClientDto(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.birtDate = entity.getBirtDate();
        this.children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Instant getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Instant birtDate) {
        this.birtDate = birtDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

}
