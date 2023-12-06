package pattern.behavioral.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class DescHeightIterator  implements Iterator<Student>{
    private Iterator<Student> studentIterator;

    public DescHeightIterator(List<Student> studentList) {
        Collections.sort(studentList,(p1,p2)-> Integer.compare(p2.getHeight(), p1.getHeight()));
        this.studentIterator = studentList.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.studentIterator.hasNext();
    }

    @Override
    public Student next() {
        return this.studentIterator.next();
    }
}
