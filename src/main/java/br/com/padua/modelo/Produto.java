package br.com.padua.modelo;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Produto {
    private Integer id;
    private String nome;
    private String desString;
}