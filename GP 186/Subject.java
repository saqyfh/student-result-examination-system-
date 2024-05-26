public class Subject
{
    //instance data members
    private String subjectName;
    private String grade;
    private int creditHour;
    private double gradePoint;
    
    //constructor
    public Subject (String sn, int ch, double GP){
        this.subjectName = sn;
        this.creditHour = ch;
        this.gradePoint = GP;
    }

    //mutator
    public void setSubjectName(String n){this.subjectName = n; }
    public void setGrade(String g){this.grade = g;}
    public void setCreditHour(int ch){this.creditHour = ch;}
    
    //accessor
    public double getGradePoint(){return this.gradePoint;}
    public String getSubjectName(){return this.subjectName;}
    public String getGrade(){return this.grade;}
    public final int getCreditHour(){return this.creditHour;}

    //processor
    public String calcGradePoint(){
         gradePoint = 0.00;
            if (gradePoint == 4.00)
                grade = "A+";
            else if(gradePoint < 4.00)
                grade = "A";
            else if(gradePoint < 3.67)
                grade = "A-";
            else if(gradePoint < 3.33)
                grade = "B+";
            else if (gradePoint < 3.00)
                grade = "B";
            else if(gradePoint < 2.67)
                grade = "B-";
            else if (gradePoint < 2.33)
                grade = "C+";  
            else if(gradePoint < 2.00)
                grade = "C";
            else if (gradePoint < 1.67)
                grade = "C-";
            else if(gradePoint < 1.33)
                grade = "D+";
            else 
                grade = "F";  
            setGrade(grade);
            return grade;
        }
    //printers
    public String toString() {
       return "Subject Name: "+this.getSubjectName() +
              "Grade: " +this.getGrade() + "\n" +
              "Credit Hour: "+ getCreditHour();
   
    }

}

