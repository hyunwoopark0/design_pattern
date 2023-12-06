package pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Student student1 = new Student("학생1",170);
        Student student2 = new Student("학생2",160);
        Student student3 = new Student("학생3",180);

        SchoolClass schoolClass = new SchoolClass();
        AcademyClass academyClass = new AcademyClass();

        schoolClass.add(student1);
        schoolClass.add(student2);
        schoolClass.add(student3);

        academyClass.add(student3);
        academyClass.add(student2);
        academyClass.add(student1);

        List<AbstractClass> classList = new ArrayList<>();
        classList.add(schoolClass);
        classList.add(academyClass);

        for (AbstractClass abstactClass : classList){
            Iterator<Student> studentIterator = abstactClass.createIterator();
            while (studentIterator.hasNext()){
                System.out.println(studentIterator.next().getName());
            }
        }

    }

}