import java.util.Random;

public class DiceRoll
{
    int numRoll;
    int sides = 6;

    public void roll()
    {
        Random ran = new Random();
        numRoll = ran.nextInt(sides) + 1;
    }

    public int getRoll()
    {
        return numRoll;
    }
}
