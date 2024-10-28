package com.rolw.mycounttable;

import javafx.beans.property.SimpleStringProperty;

public class CountItem {
    private final SimpleStringProperty cpu;
    private final SimpleStringProperty ram;
    private final SimpleStringProperty gpu;

    public CountItem(String cpu, String ram, String gpu) {
        this.cpu = new SimpleStringProperty(cpu);
        this.ram = new SimpleStringProperty(ram);
        this.gpu = new SimpleStringProperty(gpu);
    }

    public String getCpu() { return cpu.get(); }
    public void setCpu(String cpu) { this.cpu.set(cpu); }

    public String getRam() { return ram.get(); }
    public void setRam(String ram) { this.ram.set(ram); }

    public String getGpu() { return gpu.get(); }
    public void setGpu(String gpu) { this.gpu.set(gpu); }
}
