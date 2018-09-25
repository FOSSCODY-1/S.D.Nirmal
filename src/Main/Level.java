/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Dhanushka
 */
public class Level {
    private Link headLink;
    private Level nextLevel;

    public Level() {
    }

    public Level(Link headLink, Level nextLevel) {
        this.headLink = headLink;
        this.nextLevel = nextLevel;
    }

    /**
     * @return the headLink
     */
    public Link getHeadLink() {
        return headLink;
    }

    /**
     * @param headLink the headLink to set
     */
    public void setHeadLink(Link headLink) {
        this.headLink = headLink;
    }

    /**
     * @return the nextLevel
     */
    public Level getNextLevel() {
        return nextLevel;
    }

    /**
     * @param nextLevel the nextLevel to set
     */
    public void setNextLevel(Level nextLevel) {
        this.nextLevel = nextLevel;
    }
    
    
}
