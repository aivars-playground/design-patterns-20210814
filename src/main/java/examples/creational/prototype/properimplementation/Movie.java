package examples.creational.prototype.properimplementation;

import java.time.Duration;

public class Movie extends Item{

    //The International Standard Audiovisual Number.
    private String isan;
    private Duration runtime;

    public String getIsan() {
        return isan;
    }

    public void setIsan(String isan) {
        this.isan = isan;
    }

    public Duration getRuntime() {
        return runtime;
    }

    public void setRuntime(Duration runtime) {
        this.runtime = runtime;
    }
}
