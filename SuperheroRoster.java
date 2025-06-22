public class SuperheroRoster 
{
    public static void main(String[] args)
    {
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
        int[] powerLevels = {85, 90, 80};
    

    System.out.println("....Hero Roster...."); // display hero's details
    for (int i = 0; i < heroNames.length; i++)
    {
        System.out.println("Hero name: " + heroNames[i]);
        System.out.println("Hero ability: " + abilities[i]);
        System.out.println("Power Level: " + powerLevels[i]);
        System.out.println("............................\n");
    }

    System.out.println("....Search for Hero...."); // search for hero
    searchHero(heroNames, abilities, powerLevels, "Black Widow");

    
    double avgPower = calculateAveragePower(powerLevels); // calculate and display avg power level
    System.out.println("Average Power Level: " + avgPower + "\n");

        
    System.out.println(".... Object-oriented Hero Roster ...."); // array of Superhero objects
    Superhero[] heroObjects = new Superhero[heroNames.length];
    for (int i = 0; i < heroNames.length; i++) 
    {
        heroObjects[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
        heroObjects[i].displayHero();
    }

    System.out.println(); 
    System.out.println(".... Sorted by Power Level (descending) ...."); // sorting by power level (descending)
    sortHeroesByPower(heroObjects);
    for (Superhero hero : heroObjects) 
    {
        hero.displayHero();
    }
    }

    
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) // method to search for a hero
    {
        boolean found = false;
        for (int i = 0; i < names.length; i++) 
        {
            if (names[i].equalsIgnoreCase(target)) 
            {
                System.out.println("Hero Found!");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) 
        {
            System.out.println("Hero not found: " + target);
        }
    }

    
    public static double calculateAveragePower(int[] powerLevels) // method to calculate avg power level
    {
        int sum = 0;
        for (int power : powerLevels) 
        {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }

    
    public static void sortHeroesByPower(Superhero[] heroes) // sorting by power level (descending)
    {
    for (int i = 0; i < heroes.length - 1; i++) 
    {
        for (int j = i + 1; j < heroes.length; j++) 
        {
            if (heroes[j].getPowerLevel() > heroes[i].getPowerLevel()) 
            {
                Superhero temp = heroes[i];
                heroes[i] = heroes[j];
                heroes[j] = temp;
            }
        }
    }
}
}

