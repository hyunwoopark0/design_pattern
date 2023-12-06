package pattern.behavioral.iterator;

import java.util.Iterator;

public class AcademyClass implements AbstractClass{
    Student[] studentlist = new Student[6];
    int index = 0;

    public void add(Student student){
        studentlist[index] = student;
        index++;
    }

    public Student[] getStudentlist(){
        return this.studentlist;
    }

    @Override
    public Iterator<Student> createIterator() {
        return new NomalIterator(this.studentlist);
    }
}