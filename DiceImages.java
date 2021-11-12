import javafx.scene.image.Image;

public class DiceImages
{
    Image pic1 = new Image("file:Die1.png");
    Image pic2 = new Image("file:Die2.png");
    Image pic3 = new Image("file:Die3.png");
    Image pic4 = new Image("file:Die4.png");
    Image pic5 = new Image("file:Die5.png");
    Image pic6 = new Image("file:Die6.png");

    private int value;
    private Image diceImage = pic1;

    public Image getDiceImage()
    {
        return diceImage;
    }

    public void setDiceImage(int sides)
    {
        int value = sides;
        if(value == 1)
            diceImage = pic1;
        if(value == 2)
            diceImage = pic2;
        if(value == 3)
            diceImage = pic3;
        if(value == 4)
            diceImage = pic4;
        if(value == 5)
            diceImage = pic5;
        if(value == 6)
            diceImage = pic6;
    }
}
