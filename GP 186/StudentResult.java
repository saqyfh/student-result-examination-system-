public class StudentResult extends GPACalculator{
    protected int sem;
    protected int creditHour;
    
    private Result result; //to access Result class
    
    public StudentResult(int s, int ch, Result result){
        //this.sem = s;
        //this.creditHour = ch;
        setSem(s);
        setCreditHour(ch);
        this.result = result;
    }
    
    //mutator
    public void setSem(int s) {this.sem = s;}
    public void setCreditHour(int ch){this.creditHour = ch;}
    
    //accessor
    public int getSem() {return this.sem;}
    public int getCreditHour(){return this.creditHour;}    
    
    //toString() printer
    @Override
    public String toString() {
        return  "Semester: " + this.getSem() + "\n" +
                super.toString() /*from student class*/ +result.getResultDetails();
                //"CGPA: " + this.calcCGPA();
    }
}