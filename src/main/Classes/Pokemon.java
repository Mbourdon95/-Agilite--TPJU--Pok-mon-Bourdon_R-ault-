
public class Pokemon {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private int niveau;
    private TypePokemon type;

    /**
     * Constructeur d'objets de classe masterPokemon.Pokemon
     */
    public Pokemon(String nom, int niveau, TypePokemon type)
    {
        this.nom = nom;
        this.niveau = niveau;
        this.type = type;
        this.type.addPokemonList(this);
    }

    public void nouveauNom(String nouveauNom)
    {
        this.nom = nouveauNom;
    }

    public void superBonbon()
    {
        this.niveau++;
    }

    public String getNom()
    {
        // Insérez votre code ici
        return this.nom;
    }

    public int getNiveau()
    {
        // Insérez votre code ici
        return this.niveau;
    }

    public String getFaiblesse()
    {
        // Insérez votre code ici
        return this.type.getFaiblesse();
    }
}
