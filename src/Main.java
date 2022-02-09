public class Main
{

    public static void main(String[] args)
    {
        String yourParty = "R";

        if (yourParty == "D")
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (yourParty == "R")
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (yourParty == "I")
        {
            System.out.println("You get an Independent Man.");
        }
        else
        {
            System.out.println("Not a party affiliation: " + yourParty);
        }

    }
}
