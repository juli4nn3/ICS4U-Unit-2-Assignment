/**
 * This class defines the fox subclass for the Animal superclass.
 * It defines the actions and characteristics of the fox character
 * within the main file story.

 * @author Julianne Leblanc-Peltier
 * @version 1.0
 * @since December 1, 2025
 */
public class Fox extends Animal {
    /**
     * This variable is for the speed value of the fox.
     */
    private int foxSpeed;

    /**
     * This is the constructor for the fox class.
     * @param foxName
     * @param foxSpecies
     * @param foxColour
     * @param foxSpecialAbility
     * @param foxMaxSpeed
     */
    public Fox(final String foxName, final String foxSpecies,
    final String foxColour, final String foxSpecialAbility,
    final int foxMaxSpeed) {
        super(foxName, foxSpecies, foxColour,
        foxSpecialAbility, foxMaxSpeed);
    }

    /**
     * This method polymorphs the abstract superclass.
     */
    public void specialAbility() {
        int newSpeed;
        int currentSpeed = super.getSpeed();
        double twentyPercent = 0.20;
        System.out.print(super.getName() + " uses Special Ability: ");
        System.out.println(super.getSpecialAbility());

        System.out.println("""
        \nThis ability allows the fox to increase its speed by 20% when it's
        in last place!
        """);

        newSpeed = currentSpeed + (int)(currentSpeed * twentyPercent);

        super.setSpeed(newSpeed);
        System.out.println("New Speed: " + super.getSpeed());
    }

    /**
     * This method calculates new speed after acceleration.
     * @param pawPower
     * @param foxTime
     */
    public void accelerate(final int pawPower,
    final int foxTime) {
        foxSpeed = super.getSpeed();
        if ((foxSpeed + (pawPower * foxTime)) > super.getMaxSpeed()) {
            foxSpeed = super.getMaxSpeed();
        } else {
            foxSpeed += (pawPower * foxTime);
        }

        super.setSpeed(foxSpeed);
    }

    /**
     * this method calculates new speed after brake.
     * @param breakPower
     * @param breakTime
     */
    public void brake(final int breakPower, final int breakTime) {
        foxSpeed = super.getSpeed();
        if (foxSpeed - (breakPower * breakTime) < 0) {
            foxSpeed = 0;
        } else {
            foxSpeed = foxSpeed - (breakPower * breakTime);
        }

        super.setSpeed(foxSpeed);
    }
}
