

public class Checker {
    
    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun"))
            return true;
        else {
            return false;
        }
    }
    
    public boolean allVowels(String string) {
        if (string.matches("((a)*(e)*(i)*(o)*(u)*)*")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean timeOfDay(String string) {
        if (string.matches("(0[0-9]|1[0-9]|2[0-3])" +":" 
                +"(0[0-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9])" +":" +"(0[0-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9])")) {
            return true;
        } else {
            return false;
        }
    }
}
