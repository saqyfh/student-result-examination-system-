import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class GPACalculator extends Student 
{
    public static void main(String[] args) throws IOException
    {   
        // 1. user tu ada: existingUser() => goodbye()
        //      Y => addSubject()
        //      N => habis
        
        // 2. user tu takde: newUser() => addSubject() => goodbye()
        //      Y => addSubject() => goodbye()
        //      N => habis
        
        // 3. user tu salah password: => habis
        
        Scanner scanner = new Scanner(System.in);
        
        int numOfSubjects = 7; 
        int count = 0;
        Subject[] subjects = new Subject[numOfSubjects];
        
        System.out.println("+---------------------------------------+");
        System.out.println("|    WELCOME TO STUDENT RESULT SYSTEM   |");
        System.out.println("+---------------------------------------+");
        System.out.print("Username: "); //username = ic
        String username = scanner.nextLine();
        System.out.print("Password: "); //password = student id
        String password = scanner.nextLine();

        // function login() akan return value int 1=existing user, 2=new user, 3=wrong password)
        int credentialsExist = login(username, password); 

        if (credentialsExist == 1) {
            existingUser(username, password);
        } else if (credentialsExist == 2) {
            System.out.println("No profile found. Please register a new profile below." + "\n\n");
            newUser();
        }
        else if (credentialsExist == 3)  {
            System.out.println("Incorrect password. Please re-enter the system again.");
        }
    }
    
    // 1=existing user, 2=new user, 3=wrong password
    public static int login(String username, String password) 
    {
        // login (ic,student id) --> existing user
        Scanner scanner = new Scanner(System.in);
        
        // Path to the input and output files
        String file = "students.txt";
        int status = 0;
        
        try 
        {
            //read file to compare user exist or not
            FileReader fr = new FileReader(file);
            BufferedReader infile = new BufferedReader(fr);
            String indata = null;
            
            while((indata = infile.readLine()) != null)
            {
                StringTokenizer st = new StringTokenizer(indata, ";");
                String name = st.nextToken();
                String email = st.nextToken();
                String address = st.nextToken();
                String course = st.nextToken();
                double GPA = Double.parseDouble(st.nextToken()); //convert token to double
                String ic = st.nextToken();
                String id = st.nextToken();
                String subject1 = st.nextToken();
                int credit1 = Integer.parseInt(st.nextToken());//convert token to integer
                double grade1 = Double.parseDouble(st.nextToken());
                String subject2 = st.nextToken();
                int credit2 = Integer.parseInt(st.nextToken());
                double grade2 = Double.parseDouble(st.nextToken());
                String ubject3 = st.nextToken();
                int credit3 = Integer.parseInt(st.nextToken());
                double grade3 = Double.parseDouble(st.nextToken());
                String subject4 = st.nextToken();                  //7 subject
                int credit4 = Integer.parseInt(st.nextToken());
                double grade4 = Double.parseDouble(st.nextToken());
                String subject5 = st.nextToken();
                int credit5 = Integer.parseInt(st.nextToken());
                double grade5 = Double.parseDouble(st.nextToken());
                String subject6 = st.nextToken();
                int credit6 = Integer.parseInt(st.nextToken());
                double grade6 = Double.parseDouble(st.nextToken());
                String subject7 = st.nextToken();
                int credit7 = Integer.parseInt(st.nextToken());
                double grade7 = Double.parseDouble(st.nextToken());
                
                //username = ic
                //password = student id
                
                // user condition:
                // 1 - profile ada => true
                // 2 - profile takde => false
                // 3 - salah password => false
                if (username.equalsIgnoreCase(ic) && password.equalsIgnoreCase(id)) 
                {
                    status = 1;
                    break; // break sbb dia dah jumpa value dlm file(ic,id)
                } else if (username.equalsIgnoreCase(ic) && !password.equalsIgnoreCase(id)) { 
                    status = 3;
                    break; // break sbb dia dah jumpa value dlm file(ic)
                } else if (!username.equalsIgnoreCase(ic)) { //kalau ic user takde dalam file = newprofile
                    //newProfile = true;//will go to *a*
                    status = 2;
                }
            }
            infile.close();
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        return status;
    }
    
    public static void existingUser(String username, String password)
    {
        // Path to the input and output files
        // read data
        String file = "students.txt";
        
        try 
        {
            //read file to compare user exist or not
            FileReader fr = new FileReader(file);
            BufferedReader infile = new BufferedReader(fr);
            String indata = null;
            
            while((indata = infile.readLine()) != null)
            {
                StringTokenizer st = new StringTokenizer(indata, ";");
                String name = st.nextToken();
                String email = st.nextToken();
                String address = st.nextToken();
                String course = st.nextToken();
                double GPA = Double.parseDouble(st.nextToken()); //convert token to double
                String ic = st.nextToken();
                String id = st.nextToken();
                String subject1 = st.nextToken();
                int credit1 = Integer.parseInt(st.nextToken());//convert token to integer
                double grade1 = Double.parseDouble(st.nextToken());
                String subject2 = st.nextToken();
                int credit2 = Integer.parseInt(st.nextToken());
                double grade2 = Double.parseDouble(st.nextToken());
                String subject3 = st.nextToken();
                int credit3 = Integer.parseInt(st.nextToken());
                double grade3 = Double.parseDouble(st.nextToken());
                String subject4 = st.nextToken();                  //7 subject
                int credit4 = Integer.parseInt(st.nextToken());
                double grade4 = Double.parseDouble(st.nextToken());
                String subject5 = st.nextToken();
                int credit5 = Integer.parseInt(st.nextToken());
                double grade5 = Double.parseDouble(st.nextToken());
                String subject6 = st.nextToken();
                int credit6 = Integer.parseInt(st.nextToken());
                double grade6 = Double.parseDouble(st.nextToken());
                String subject7 = st.nextToken();
                int credit7 = Integer.parseInt(st.nextToken());
                double grade7 = Double.parseDouble(st.nextToken());
                
                if (username.equalsIgnoreCase(ic) && password.equalsIgnoreCase(id)) 
                {
                    System.out.print("\u000C");
                    System.out.println("+---------------------------------------------+");
                    System.out.println("+------------RESULT STUDENT SYSTEM------------+");
                    System.out.println("+---------------------------------------------+");
                    System.out.println("Name: " + name);
                    System.out.println("Student Id: " + id);
                    System.out.println("E-mail: " + email);
                    System.out.println("NRIC : " + ic);
                    System.out.println("Address : " + address);
                    System.out.println("Course: " + course);
                    System.out.println("Subject 1: " + subject1);
                    System.out.println("Subject 2: " + subject2);
                    System.out.println("Subject 3: " + subject3);
                    System.out.println("Subject 4: " + subject4);
                    System.out.println("Subject 5: " + subject5);
                    System.out.println("Subject 6: " + subject6);
                    System.out.println("Subject 7: " + subject7);
                    System.out.println("GPA: " + GPA + "\n");
                    System.out.println("--------------------------\n");
                    
                    // Student students = new Student(name, id, email, ic, address, course);
                    // return students;
                    goodbye(name, id, email, ic, address, course);
                    break;
                }
            }
            infile.close();
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        
    }
    
    public static void newUser()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\u000C");
        System.out.println("No profile found. Please register a new profile below." + "\n\n");
        
        System.out.print("| Enter Full name : ");
        String name = scanner.nextLine();
        System.out.print("| Enter Student ID :  ");
        String id = scanner.nextLine();
        System.out.print("| Enter Email :  ");
        String email = scanner.nextLine();
        System.out.print("| Enter IC :  ");
        String ic = scanner.nextLine();
        System.out.print("| Enter address :  ");
        String address = scanner.nextLine();
        System.out.print("| Enter course :  ");
        String course = scanner.nextLine();
        
        System.out.print("\u000C");
        Student students = new Student(name, id, email, ic, address, course);
        
        addSubject(name, id, email, ic, address, course);
    }
    
    public static void addSubject(String name, String id, String email, String ic, String address, String course) // write file
    {
        Scanner scanner = new Scanner(System.in);
        
        String file = "students.txt";
        
        int numOfSubjects = 7;
        Subject[] subjects = new Subject[numOfSubjects];
        
        System.out.print("\u000C");
        System.out.println("+---------------------------------------+");
        System.out.println("|               SUBJECT                 |");
        System.out.println("+---------------------------------------+");
        for(int i =0;i<subjects.length;i++)
        {
            Scanner subjectInput = new Scanner(System.in);
            System.out.println("  Subject #" + (i+1));
            System.out.println("+---------------------------------------+");
            System.out.print("| Enter Subject Name : ");
            String SN = subjectInput.nextLine();
            System.out.print("| Enter Credit hours  : ");
            int CH = subjectInput.nextInt();
            System.out.print("| Enter Grade point [0-4]  : ");
            double GP = subjectInput.nextDouble();
            System.out.println("+---------------------------------------+");
            
            subjects[i] = new Subject(SN,CH,GP); //assign in array
        }
        
        double totalCreditPoints = 0;
        int totalCredits = 0;
        for (int i = 0; i < subjects.length; i++)
        {
            totalCreditPoints += subjects[i].getCreditHour() * subjects[i].getGradePoint();
            totalCredits += subjects[i].getCreditHour();
        }
        String subject1 = subjects[0].getSubjectName();
        int credit1 = subjects[0].getCreditHour();
        double grade1 = subjects[0].getGradePoint();
        String subject2 = subjects[1].getSubjectName();
        int credit2 = subjects[1].getCreditHour();
        double grade2 = subjects[1].getGradePoint();
        String subject3 = subjects[2].getSubjectName();
        int credit3 = subjects[2].getCreditHour();
        double grade3 = subjects[2].getGradePoint();
        String subject4 = subjects[3].getSubjectName(); //7 subject
        int credit4 = subjects[3].getCreditHour();
        double grade4 = subjects[3].getGradePoint();
        String subject5 = subjects[4].getSubjectName();
        int credit5 = subjects[4].getCreditHour();
        double grade5 = subjects[4].getGradePoint();
        String subject6 = subjects[5].getSubjectName();
        int credit6 = subjects[5].getCreditHour();
        double grade6 = subjects[5].getGradePoint();
        String subject7 = subjects[6].getSubjectName();
        int credit7 = subjects[6].getCreditHour();
        double grade7 = subjects[6].getGradePoint();
    
        double GPA = totalCreditPoints / totalCredits;
        // System.out.println("\nGPA: " + GPA + "\n");
        
        // Print result slip and Write the student result to the output file
        // user key in subject (new)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) 
        {
            System.out.print("\u000C");
            System.out.println("+---------------------------------------------+");
            System.out.println("+------------RESULT STUDENT SYSTEM------------+");
            System.out.println("+---------------------------------------------+");
            System.out.println("Name: " + name);
            System.out.println("Student Id: " + id);
            System.out.println("E-mail: " + email);
            System.out.println("NRIC : " + ic);
            System.out.println("Address : " + address);
            System.out.println("Course: " + course);
            System.out.println("Subject 1: " + subject1);
            System.out.println("Subject 2: " + subject2);
            System.out.println("Subject 3: " + subject3);
            System.out.println("Subject 4: " + subject4);
            System.out.println("Subject 5: " + subject5);
            System.out.println("Subject 6: " + subject6);
            System.out.println("Subject 7: " + subject7);
            System.out.println("GPA: " + GPA + "\n");
            System.out.println("--------------------------\n");
            
            writer.write("\n" + name + ";" + email + ";" + address + 
                        ";" + course + ";" + GPA + ";" + ic + ";" + id + 
                        ";" + subject1 + ";" + credit1 + ";" + grade1 + 
                        ";" + subject2 + ";" + credit2 + ";" + grade2 + 
                        ";" + subject3 + ";" + credit3 + ";" + grade3 + 
                        ";" + subject4 + ";" + credit4 + ";" + grade4 + //7 subject
                        ";" + subject5 + ";" + credit5 + ";" + grade5 +
                        ";" + subject6 + ";" + credit6 + ";" + grade6 +
                        ";" + subject7 + ";" + credit7 + ";" + grade7);
            writer.close();
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        
        goodbye(name, id, email, ic, address, course);
    }
    
    public static void goodbye(String name, String id, String email, String ic, String address, String course)
    {
        // boolean Continue = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Continue using system ? [Y]/[N]: ");
        String input = scanner.nextLine();
        
        if(input.toUpperCase().charAt(0) == 'Y')
        {
            addSubject(name, id, email, ic, address, course);
        }
        else 
        {
            System.out.print("\u000C");
            System.out.println("+---------------------------------------------+");
            System.out.println("|     Thank you for using the system !        |");
            System.out.println("|             Have a nice day !               |");
            System.out.println("+---------------------------------------------+");
        }
    }
}