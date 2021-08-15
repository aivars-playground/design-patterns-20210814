package examples.creational.prototype;

import java.time.LocalDateTime;

public class ExpensiveToCreateClass implements Cloneable {

    private TimeWrapper created;

    public ExpensiveToCreateClass(){
        for (long i = 0;i<10001L;i++) {
            if (i % 1000 ==0) {
                System.out.println("---@"+i);
            }
        }
        created = new TimeWrapper(LocalDateTime.now());
    }

    //is this right, this is not exact signature (missing "throws ExpensiveToCreateClass")...
    //is it correct to call overriden clone?
    @Override
    protected ExpensiveToCreateClass clone() {
        try {
            return (ExpensiveToCreateClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "ExpensiveToCreateClass{" +
                "created=" + created +
                "}@" + System.identityHashCode(this);
    }
}

class TimeWrapper {
    LocalDateTime time;
    TimeWrapper(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TimeWrapper{" +
                "time=" + time +
                " @wrapperHashCode:" + System.identityHashCode(this) +
                " @timeHashCode:" + System.identityHashCode(time)+
                '}';
    }
}
