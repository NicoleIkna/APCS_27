public class StepTracker{
    private int minSteps;
    private int totalSteps;
    private int totalDays;
    private int active;

    public StepTracker(int minimum){
        minSteps = minimum;
        totalSteps = 0;
        totalDays = 0;
        active = 0;
    }

    public void addDailySteps(int steps){
        totalSteps += steps;
        totalDays++;
        if(steps>=minSteps){
            active++;
        }
    }

    public int activeDays(){
        return active;
    }

    public double averageSteps(){
        if(totalDays==0){
            return 0.0;
        }
        return totalSteps/totalDays;
    }
}