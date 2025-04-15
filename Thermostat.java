class Thermostat {
    private Integer temperature = null;
    private Integer lastTemperature = null;

    public void setTemperature(int temp) {
        lastTemperature = temperature;
        temperature = temp;
        System.out.println("[Thermostat] Setting temperature to " + temp + "°C");
    }

    public void revertTemperature() {
        temperature = lastTemperature;
        System.out.println("[Thermostat] Reverting to previous temperature");
    }
}