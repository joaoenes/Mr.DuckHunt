package org.academiadecodigo.codecadets.gameobjects.enemies;

import org.academiadecodigo.codecadets.Position;
import org.academiadecodigo.codecadets.enums.EnemyTypes;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Duck extends Enemy {

    public Duck(){
        super(EnemyTypes.DUCK);
        init();
    }

    public void init() {
        setPosition(new Position(0, 100 + (int) (Math.random() * 300)));
        setPicture(new Picture(this.getPosition().getX(), this.getPosition().getY(),
                "resources/small_pp_bison_render_front_off.png"));
    }
}
