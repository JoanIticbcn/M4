public static String PotenciaMesAlta (pokemonsList){
    int potenciaMesAlta=0, totalPotencia =0;
    String PokemonAmbMesPotencia="";
    for (int i=0; i<pokemonsList.lenght; i++){
        totalPotencia(i,pokemonsList);
        if (totalPotencia>potenciaMesAlta) {
         potenciaMesAlta=totalPotencia;
         pokemonAmbMesPotencia=pokemonsList[i].["Nom"];
    
    }
    }
    return pokemonAmbMesPotencia;
}
public static int totalPotencia (int i, pokemonList){
    for(int j=0;j<pokemonsList[i].["moviments"].length){
        totalPotencia += polemonsList.["moviments"].[ j ].["potencia"];
    }
    return totalPotencia;
}
        
    