package pattern.behavioral.iterator;

import java.util.Iterator;
public class NomalIterator implements Iterator<Student>{
    private Student[] students;
    int index = 0;

    public NomalIterator(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        if(index >= students.length || students[index] == null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Student next() {
        Student student = students[index];
        index += 1;
        return student;
    }
}
