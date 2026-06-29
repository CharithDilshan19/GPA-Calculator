
package gpacalculator;


public class GPAcalculator {

 public static double getGradePoint(double mark) {
        
        
        if (mark >= 80) return 4.00;
        else if (mark >= 75) return 3.70;
        else if (mark >= 70) return 3.30;
        else if (mark >= 65) return 3.00;
        else if (mark >= 60) return 2.70;
        else if (mark >= 55) return 2.30;
        else if (mark >= 50) return 2.00;
        else if (mark >= 45) return 1.70;
        else if (mark >= 40) return 1.30;
        else if (mark >= 35) return 1.00;
        else return 0.00;
        
        
    }
  

    public static double calculateOverallGpa(int[] marks) {
        
        
        if (marks.length == 0) return 0.0;
        
        double totalGP = 0;
        for (int i = 0; i < marks.length; i++) { 
            
            
            int mark = marks[i]; 
            totalGP += getGradePoint(mark); 
            
            
        } 
        
        return totalGP / marks.length; 
    }
    public static void main(String[] args) {
         System.out.println("--- Calculate Grade ---");
        
        
        int[] semesterMarks = {80, 70, 55, 33}; 
        
        for (int i = 0; i < semesterMarks.length; i++) {
            int mark = semesterMarks[i];
            double gp = getGradePoint(mark);
            System.out.println("Subject " + (i+1) + ": Mark=" + mark + " GP=" + gp);
        }
        
     
        double overallGPA = calculateOverallGpa(semesterMarks); 
        System.out.println("\nOverall GPA = " + String.format("%.2f", overallGPA));
    }
    }
    

