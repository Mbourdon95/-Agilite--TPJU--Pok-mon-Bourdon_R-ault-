
import java.util.ArrayList;

public class TypePokemon {
    private String faiblesse;
    private ArrayList<Pokemon> listePokemonType;

    /**
     * Constructeur d'objets de classe Type
     */
    public TypePokemon(String faiblesse)
    {
        this.faiblesse = faiblesse;
        this.listePokemonType = new ArrayList<>();
    }

    public String getFaiblesse()
    {
        return this.faiblesse;
    }

    public void addPokemonList(Pokemon poke){
        this.listePokemonType.add(poke);
    }

    public ArrayList<Pokemon> getListeType(){
        return this.listePokemonType;
    }
}
