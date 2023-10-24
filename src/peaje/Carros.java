package peaje;

public class Carros {
    private int automovil;
    private int bus;
    private int camion;

    /**
     * CONSTRUCTORES
     */
    public Carros() {
    }

    public Carros(int auto, int bus, int camion) {
        this.automovil = auto;
        this.bus = bus;
        this.camion = camion;
    }

    /**
     * GETTER AND SETTER
     * @return 
     */
    public int getAutomovil() {
        return automovil;
    }

    public void setAutomovil(int auto) {
        this.automovil++;
    }
    
    

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus++;
    }

    public int getCamion() {
        return camion;
    }

    public void setCamion(int camion) {
        this.camion++;
    }
    
    /**
     * METODOS
     * @param automovil
     * @param bus
     * @param camion
     * @return 
     */
    public int TotalRecaudado (int automovil, int bus, int camion){
        automovil = automovil*7000;
        bus = bus*10000;
        camion = camion*15000;
        return automovil+bus+camion;
    }
    
    public void restAutomovil(int automovil) {
        this.automovil= automovil-automovil;
    }
    
    public void restBus(int bus) {
        this.bus= bus-bus;
    }
    
    public void restCamion(int camion) {
        this.camion= camion-camion;
    }
    
}
