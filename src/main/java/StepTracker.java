import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int minSteps, totalSteps;
 private int totaldays, actdays;

 public StepTracker(int goal)
 {
  minSteps = goal;
  totalSteps = 0;
  totaldays = 0;
  actdays = 0;
 }
 public void addDailySteps(int steps)
 {
  totalSteps += steps;
  totaldays++;
  if(steps >= minSteps)
   actdays++;
 }
 public int activeDays()
 {
  return actdays;
 }
 public double averageSteps()
 {
  if(totalDays == 0)
   return 0.0;
    else
   return (double)totalSteps/totaldays;
 }
} 
