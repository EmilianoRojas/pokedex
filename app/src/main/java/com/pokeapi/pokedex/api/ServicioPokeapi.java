package com.pokeapi.pokedex.api;

import com.pokeapi.pokedex.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicioPokeapi {
    @GET("pokemon")
    Call<PokemonRespuesta> getListaPokemon();
}
