public class Student
{
    //attributes @ data member 
    private String Name;
    private String StudentId;
    private String Email;
    private String Nric;
    private String Address;
    private String course;

    public Student() {}

    //normal contructor 
    public Student (String n,String id, String e, String nic, String a, String c)
    {
        this.Name =n;
        this.StudentId =id;
        this.Email =e;
        this.Nric =nic;
        this.Address =a;
        this.course = c;
    }
    
    //mutator
    public void setName(String n) {this.Name =n;}
    public void setStudentId(String id){this.StudentId =id;}
    public void setEmail(String e){this.Email =e;}
    public void setNric(String nic){this.Nric =nic;}
    public void setAddress(String a){this.Address =a;}
    public void setCourse(String c){this.course = c;}
    
    //accessor 
    public String getName (){return this.Name;}
    public String getStudentId () {return this.StudentId ;}
    public String getEmail (){return this.Email;}
    public String getNric() { return this.Nric;}
    public String getAddress (){return this.Address;}
    public String getCourse() {return this.course;}

    public String toString () 
    {
        return " Name : " + this.getName () + 
               "\nStudent ID : " + this.getStudentId () + 
               "\nEmail : " + this.getEmail () + 
               "\nNRIC : " + this.getNric () + 
               "\nAddress : " + this.getAddress () +
               "\nCourse : " + this.getCourse ();
    }
}