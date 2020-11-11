import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;

public class DriverProject {

    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();
        ArrayList<CourseProgramme> programmes = new ArrayList<>();

        //3 students
        Student student1 = new Student("Angel Barquin", 26, "17/08/1994", 1234);
        Student student2 = new Student("Legna Niuqrab", 19, "18/08/2002", 1235);
        Student student3 = new Student("Mary Smith", 21, "06/08/1978", 1236);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        //3 modules
        Module module1 = new Module("Math", "MA101");
        Module module2 = new Module("Biology", "BI102");
        Module module3 = new Module("English", "AC101");

        module1.addStudentToModule(student1);
        module1.addStudentToModule(student2);
        module1.addStudentToModule(student3);

        module2.addStudentToModule(student1);
        module2.addStudentToModule(student3);

        module3.addStudentToModule(student2);

        modules.add(module1);
        modules.add(module2);
        modules.add(module3);

        DateTime start = new DateTime(2020,9,30,12,00);
        DateTime finish = new DateTime(2021, 6, 30, 12,00);

        //3 programmes
        CourseProgramme programme1 = new CourseProgramme("Math&BiologyCourse", modules, students, start, finish);
        CourseProgramme programme2 = new CourseProgramme("EmptyCourse", start, finish);
        CourseProgramme programme3 = new CourseProgramme("AdminCourse", start, finish);

        programmes.add(programme1);
        programmes.add(programme2);
        programmes.add(programme3);

        //looping through all the courses, modules each course has, and third loop for students of each module.
        for(int i = 0; i < programmes.size(); i++){
            System.out.println("Course Name: " + programmes.get(i).getCourseName());
            for(int j = 0; j < programmes.get(i).getModules().size(); j++){
                System.out.println("Module Name: " + programmes.get(i).getModules().get(j).getModuleName());
                for(int k = 0; k < programmes.get(i).getModules().get(j).getStudents().size(); k++){
                    System.out.println("Student : " + programmes.get(i).getModules().get(j).getStudents().get(k).getName());
                }
            }
            System.out.println();
        }

    }

}
