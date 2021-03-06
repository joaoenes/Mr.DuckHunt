package org.academiadecodigo.codecadets.gameobjects.powerups;

import org.academiadecodigo.codecadets.Game;
import org.academiadecodigo.codecadets.enums.PowerUpTypes;

public class Ammo extends PowerUp {

    private int ammoValue = 2;

    public Ammo() {
        super(PowerUpTypes.AMMO);
    }

    @Override
    public void activate(Game game) {

        game.getPlayer().getWeapon().changeClips(ammoValue);
    }

    public int getAmmoValue() {
        return ammoValue;
    }
}
