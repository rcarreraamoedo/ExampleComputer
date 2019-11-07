/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplecomputer;

/**
 * A class called Mouse is created, with its Mouse attribute
 * @author rcarreraamoedo
 */
public class Mouse {

    private String mouse;

    /**
     * Parameter constructor method
     */
    public Mouse() {
    }

    /**
     * Public method constructor with mouse parameters is assigned mouse attributes
     * @param mouse the type of time that is implemented
     */
    public Mouse(String mouse) {
        this.mouse = mouse;
    }
    //access methods

    /**
     * Empty public method, show Mouse string value
     * @param mouse the type of time that is implemented
     */
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    /**
     *String method, returns the mouse value
     * @return
     */
    public String getMouse() {
        return mouse;
    }
}
