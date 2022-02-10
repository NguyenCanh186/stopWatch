public class stopWatch {
    double startTime, endTime, count;
    boolean check = false;
    public stopWatch(){
    }
    public stopWatch(double startTime, double endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void start(){
        check = true;
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        check = false;
        endTime = System.currentTimeMillis();
    }
    public double dem(){
        if(check){
            count = System.currentTimeMillis() - startTime;
        } else {
            count = endTime - startTime;
        }
        return count;
    }
}
