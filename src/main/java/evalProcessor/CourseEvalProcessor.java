package evalProcessor;

import java.util.ArrayList;
import java.util.HashSet;

public class CourseEvalProcessor {
    private Reader reader;
    private ArrayList<ArrayList<String>> offerings;

    public HashSet<String> getInstructorsForCourse(String course) {
        return new HashSet<String>();
    }

    public AverageEnrollment getAverageEnrollmentForCourse(String course) {
        return new AverageEnrollment();
    }
}
