public class Superhero 
{
    private String name;
    private String ability;
    private int powerLevel;

public Superhero(String name, String ability, int powerLevel) // constructor
{
    this.name = name;
    this.ability = ability;
    this.powerLevel = powerLevel;
}

public void displayHero() // display method
{
    System.out.println("Hero name: " + name);
    System.out.println("Hero ability: " + ability);
    System.out.println("Power Level: " + powerLevel);
    System.out.println("............................");
}

public String getName() //getters
{
    return name;
}

public int getPowerLevel()
{
    return powerLevel;
}

}