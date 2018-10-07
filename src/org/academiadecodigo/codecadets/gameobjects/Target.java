package org.academiadecodigo.codecadets.gameobjects;

public abstract class Target extends GameObject {

    private boolean destroyed;

    public Target() {
        destroyed = false;
    }

    public abstract void hit(int damage);

    public boolean isDestroyed() {
        return destroyed;
    }

    public void destroy() {
        this.destroyed = true;
    }
}
