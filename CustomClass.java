import java.util.List;
import java.util.function.Predicate;

class Course{
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String toString(){
        return name + "." + noOfStudents  + ":" + reviewScore;
    }

}


public class CustomClass {

    public static void main(String[] args) {

        List<Course> courses =  List.of(
                new Course("Spring", "Framework", 98,20000),
                new Course("Spring Boot", "Framework", 95,18000),
                new Course("API", "Framework", 97,22000),
                new Course("FullStack", "FullStack", 96,25000),
                new Course("AWS", "Cloud", 92,14000),
                new Course("Azure", "Cloud", 99,21000),
                new Course("Docker", "Cloud", 92,21000),
                new Course("Kubernetes", "Cloud", 91,20000)
        );



        //allMatch, noneMatch , anyMatch
        Predicate<Course> reviewScoreSuppA95Predicate = course -> course.getReviewScore() > 95;

        Predicate<Course> reviewScoreInfA95Predicate = course -> course.getReviewScore() > 95;

        Predicate<Course> reviewScoreSuppA90Predicate = course -> course.getReviewScore() > 90;

        Predicate<Course> reviewScoreInfA90Predicate = course -> course.getReviewScore() < 90;


        System.out.println(courses.stream()
                .allMatch(reviewScoreSuppA95Predicate)); // false


        System.out.println(courses.stream()
                .allMatch(reviewScoreSuppA90Predicate)); //true


        System.out.println(courses.stream()
                .noneMatch(reviewScoreInfA90Predicate)); //true


        System.out.println(courses.stream()
                .noneMatch(reviewScoreSuppA95Predicate)); //false

        System.out.println(courses.stream()
                .anyMatch(reviewScoreSuppA95Predicate)); //true

        System.out.println(courses.stream()
                .anyMatch(reviewScoreInfA95Predicate)); //true

        System.out.println(courses.stream()
                .anyMatch(reviewScoreInfA90Predicate)); //false



    }
}
