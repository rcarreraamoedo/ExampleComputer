/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplecomputer;

/**
 *A class called Computer is created, with its attributes associated with the secondary classes
 *
 *
 * @author rcarreraamoedo
 */
public class Computer {

    private Mouse mouse;
    private Window Window;
    private Memory CPU;

    /**
     *Constructor method without parameters with content of the attributes adding objects
     */
    public Computer() {
        mouse = new Mouse();
        Window = new Window();
        CPU = new Memory();
    }

    /**
     *Constructor with parameters
     *
     * @param Mouse class with your Mouse attributes
     * @param Window class with your Window attributes
     * @param CPU class with your CPU attributes
     */
    public Computer(Mouse Mouse, Window Window, Memory CPU) {
        this.mouse = Mouse;
        this.Window = Window;
        this.CPU = CPU;
    }

    /**
     * Empty public method, shows Mouse value
     *
     * @param mouse class with your Mouse attributes
     */
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Mouse method, return the Mouse value
     *
     * @return
     */
    public Mouse getMouse() {
        return mouse;
    }

    /**
     * Empty public method, shows Window value
     *
     * @param Window class with your Window attributes
     */
    public void setWindow(Window Window) {
        this.Window = Window;
    }

    /**
     * Window method, return the Window value
     *
     * @return
     */
    public Window getWindow() {
        return Window;
    }

    /**
     * Public method empty, shows CPU value
     *
     * @param CPU class with your CPU attributes
     */
    public void setCPU(Memory CPU) {
        this.CPU = CPU;
    }

    /**
     * Memory method, returns the Memory value
     *
     * @return
     */
    public Memory getCPU() {
        return CPU;
    }

    /**
     *Empty public method called amosar, the attributes are displayed by calling with getters
     */
    public void amosar() {
        System.out.println("Rato: " + mouse.getMouse() + "\nPantalla marca: " + Window.setbrands() + "\nPantalla pulgadas: " + Window.getbrinch() + "\nCPU velocidade: " + CPU.setspeed() + "\nCPU memoria: " + CPU.getmemory());
    }
}
