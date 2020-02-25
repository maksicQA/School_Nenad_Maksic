
package computer;

/**
 *
 * @author qa
 */
public class Computer {
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;
    
    
    
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    public void setOperatingSystem(String customOperatingSystem) {
        this.operatingSystem = customOperatingSystem;
    }
    
    public double getProcessTact() {
        return this.processTact;
    }
    
    public void setProcessTact(double customProcessTact) {
        this.processTact = customProcessTact;
    }
    
    public double getMemory() {
        return this.memory;
    }
    
    public void setMemory(double customMemory) {
        this.memory = customMemory;
    }
    
    public int getHardDrive() {
        return this.hardDrive;
    }
    
    public void setHardDrive(int customHardDrive) {
        this.hardDrive = customHardDrive;
    }
    
    public Computer() {
        
    }
    
    public Computer(String customOperatingSystem, double customProcessTact, double customMemory, int customHardDrive) {
        this.operatingSystem = customOperatingSystem;
        this.processTact = customProcessTact;
        this.memory = customMemory;
        this.hardDrive = customHardDrive;
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
}
