package Exe12;

public class DatePersoanei extends Persoana {

     private String faculty;

     public DatePersoanei(String nume, int varsta, String personalID){
         super(nume,varsta,personalID);
         this.faculty = faculty;
     }
     public String getFaculty() {
         return faculty;
     }
}
