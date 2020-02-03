package com.pokeapi.pokedex.models;

import java.util.ArrayList;

public class PokemonRespuesta {

    private ArrayList<Pokemon> resultados;

    public ArrayList<Pokemon> getResultados() {
        return resultados;
    }

    public void setResultados(ArrayList<Pokemon> resultados) {
        this.resultados = resultados;
    }
}
