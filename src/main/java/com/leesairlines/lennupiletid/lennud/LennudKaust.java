package com.leesairlines.lennupiletid.lennud;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LennudKaust {

    private List<Lend> lennud = new ArrayList<>();

    List<Lend> leiaKõik() {
        return lennud;
    }

    @PostConstruct
    private void init() {

    }
}
