package com.flow.ramasfuncion.ramasfuncion.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Country implements Serializable {

    private final long serialVersionUID = 1L;
    private String name;
    private String code;
}
