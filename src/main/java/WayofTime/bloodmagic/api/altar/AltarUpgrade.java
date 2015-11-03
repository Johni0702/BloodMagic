package WayofTime.bloodmagic.api.altar;

import lombok.Getter;

@Getter
public class AltarUpgrade
{
    private int speedCount;
    private int efficiencyCount;
    private int sacrificeCount;
    private int selfSacrificeCount;
    private int displacementCount;
    private int capacityCount;
    private int orbCapacityCount;
    private int betterCapacityCount;
    private int accelerationCount;

    public AltarUpgrade()
    {

    }

    // Adders

    public AltarUpgrade addSpeed()
    {
        speedCount++;
        return this;
    }

    public AltarUpgrade addEfficiency()
    {
        efficiencyCount++;
        return this;
    }

    public AltarUpgrade addSacrifice()
    {
        sacrificeCount++;
        return this;
    }

    public AltarUpgrade addSelfSacrifice()
    {
        selfSacrificeCount++;
        return this;
    }

    public AltarUpgrade addDisplacement()
    {
        displacementCount++;
        return this;
    }

    public AltarUpgrade addCapacity()
    {
        capacityCount++;
        return this;
    }

    public AltarUpgrade addOrbCapacity()
    {
        orbCapacityCount++;
        return this;
    }

    public AltarUpgrade addBetterCapacity()
    {
        betterCapacityCount++;
        return this;
    }

    public AltarUpgrade addAcceleration()
    {
        accelerationCount++;
        return this;
    }

}
