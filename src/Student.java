import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private double[] point;
    private String gender;

    public Student(int id, String name, double[] point,String gender) {
        this.id = id;
        this.name = name;
        this.point = point;
        this.gender = gender;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getPoint() {
        return point;
    }

    public void setPoint(double[] point) {
        this.point = point;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double Average(){
        double Sum = 0;
        for (int i = 0; i < this.point.length; i++) {
            Sum+=this.point[i];
        }
        return Sum/this.point.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", point=" + Arrays.toString(point) +
                ", gender='" + gender + '\'' +
                '}';
    }
}
