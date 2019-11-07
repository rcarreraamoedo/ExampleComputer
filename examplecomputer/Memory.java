/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplecomputer;

/**
 * A class called Memory is created, with it´s Speed and Memory attributes
 *
 * @author rcarreraamoedo
 */
public class Memory {

    private int speed;
    private int memory;

    /**
     * Empty public method, shows memory value
     */
    public Memory() {
    }

    /**
     *Public method builder with memory parameters is assigned the
     * speed and memory attributes
     * @param speed fast data transfer
     * @param memory the capacity that occupies the data
     */
    public Memory(int speed, int memory) {
        this.speed = speed;
        this.memory = memory;
    }
    //Access methods

    /**
     * Empty public method, shows speed int value
     * @param speed fast data transfer
     */
    public void setspeed(int speed) {
        this.speed = speed;
    }

    /**
     * Int method, returns the speed value
     * @return
     */
    public int setspeed() {
        return speed;
    }

    /**
     * Empty public method, shows memory int value
     * @param memory the capacity that occupies the data
     */
    public void setmemory(int memory) {
        this.memory = memory;
    }

    /**
     * Int method, returns the speed value
     * @return
     */
    public int getmemory() {
        return memory;
    }

}
