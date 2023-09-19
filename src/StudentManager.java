import java.util.Arrays;

public class StudentManager extends Student {
    private Student[] listStudent = new Student[0];
    Student students = new Student();

    public StudentManager(int id, String name, double[] point, String gender, Student[] listStudent) {
        super(id, name, point, gender);
        this.listStudent = listStudent;
    }

    public StudentManager() {
    }

    public void showAll() {
        for (Student item : listStudent) {
            System.out.println(item);
        }
    }

    public void add(int id, String name, double[] point, String gender) {
//        Student[] listNewStudent = Arrays.copyOf(listStudent, listStudent.length+1);
        Student[] listNewStudent = new Student[listStudent.length + 1];
        for (int i = 0; i < listStudent.length; i++) {
            listNewStudent[i] = listStudent[i];
        }
        listNewStudent[listNewStudent.length - 1] = new Student(id, name, point, gender);
        listStudent = listNewStudent;
    }

    public void edit(int index, String name, double[] array, String gender) {
        Student studentEdit = search(index);
        studentEdit.setName(name);
        studentEdit.setPoint(array);
        studentEdit.setGender(gender);
    }

    public void delete(int idDelete) {
        Student[] listNewStudentDelete = new Student[listStudent.length - 1];
        int index = 0;
        for (int i = 0; i < listStudent.length; i++) {
            if (idDelete == listStudent[i].getId()) {
                index = i;
            }
        }
        for (int i = 0; i < listStudent.length - 1; i++) {
            listNewStudentDelete[i] = listStudent[i];
        }
        for (int i = index; i < listStudent.length - 1; i++) {
            listNewStudentDelete[i] = listStudent[i + 1];
        }
        listStudent = listNewStudentDelete;
    }

    public double averageList() {
        double Sum = 0;
        for (int i = 0; i < listStudent.length; i++) {
            Sum += listStudent[i].Average();
        }
        return Sum / listStudent.length;
    }

    public Student search(int id) {
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i].getId() == id) {
                return listStudent[i];
            }
        }
        return null;
    }

    public Student searchName(String name) {
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i].getName() == name) {
                return listStudent[i];
            }
        }
        return null;
    }

    public Student maxPoint() {
        double max = 0;
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i].Average() > max) {
                max = listStudent[i].Average();
            }
        }
        int index = 0;
        for (int i = 0; i < listStudent.length; i++) {
            if (max == listStudent[i].Average()) {
                index = i;
            }
        }
        return listStudent[index];

    }
    public boolean check(int id){
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i].getId() == id){
                return true;
            }
        }
        return false;
    }
}
