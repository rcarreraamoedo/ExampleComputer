/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplecomputer;

/**
 * A class called Window is created, with the respective attributes
 *
 * @author rcarreraamoedo
 */
public class Window {

    private String brands;
    private float brinch;

    /**
     * Parameter constructor method
     */
    public Window() {
    }

    /**
     * Public constructor method with Screen parameters is assigned brand and brinch attributes
     *
     * @param brands screen maker
     * @param brinch screen size
     */
    public Window(String brands, float brinch) {
        this.brands = brands;
        this.brinch = brinch;
    }

    //access methods
    /**
     * Empty public method, shows brand string value
     *
     * @param brands
     */
    public void setbrands(String brands) {
        this.brands = brands;
    }

    /**
     * String method, returns the mark value
     *
     * @return
     */
    public String setbrands() {
        return brands;
    }

    /**
     * Empty public method, shows brinch float value
     *
     * @param brinch
     */
    public void setbrinch(float brinch) {
        this.brinch = brinch;
    }

    /**
     * Float method, returns the brinch value
     *
     * @return
     */
    public float getbrinch() {
        return brinch;
    }
}

