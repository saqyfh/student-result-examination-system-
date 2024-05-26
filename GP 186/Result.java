public class Result extends Student
{
    private char grade; 
    private double marks;
    private int creditHour;
    protected int sem;

    //constructor
    public Result(String n,String id,String e, String nic, String a, String c, char g, double m, int ch, int s){
        super(n,id,e,nic,a,c);
        this.grade = g;
        this.marks = m;
        this.creditHour = ch;
        this.sem = s;
    }

    //mutator
    public void setGrade(char g) {this.grade = g; }
    public void setMarks(double m){this.marks = m; }
    public void setCreditHour(int ch){this.creditHour = ch;}
    public void setSem(int s) {this.sem = s;}

    //accessor
    public char getGrade() {return this.grade;}
    public double getMarks(){return this.marks;}
    public int getCreditHour(){return this.creditHour;}
    public int getSem() {return this.sem;} 

    //processor
    public int calcTotalGrade(char grade){
        int gradePoint = 0;

        if (grade == 'A'){
            gradePoint = 4;
        }
        else if(grade == 'B'){
            gradePoint = 3;
        }
        else if(grade == 'C'){
            gradePoint = 2;
        }
        else if(grade == 'D'){
            gradePoint = 1;
        }
        else if(grade == 'F'){
            gradePoint = 0;
        }
        
        return gradePoint;
    }
    
    //information of the student
    public String getResultDetails(){
        return super.toString(); //taken from student class
    }
    
    //printers
    public String toString(){
        return "Grade: " +this.getGrade() + "\n"+
              "Marks: " +this.getMarks() + "\n" +
              "Credit Hour: "+this.getCreditHour() + "\n" +
              "Sem: " + this.getSem();
    }
}
        
