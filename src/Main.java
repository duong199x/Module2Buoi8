import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager clazz = new StudentManager();
        do {
            System.out.println("--------Menu--------");
            System.out.println("Press 0: show all student");
            System.out.println("Press 1: add");
            System.out.println("Press 2: edit");
            System.out.println("Press 3: delete");
            System.out.println("Press 4: average class");
            System.out.println("Press 5: search student id");
            System.out.println("Press 6: search student name");
            System.out.println("Press 7: get student max point");
            System.out.println("Press 8: Exit");
            Scanner input = new Scanner(System.in);
            int key = input.nextInt();
            switch (key) {
                case 0:
                    clazz.showAll();
                    break;
                case 1:
                    System.out.println("nhập id học sinh");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("nhập tên học sinh");
                    String name = input.nextLine();
                    double[] array = new double[3];
                    System.out.println("nhập điểm 1:");
                    double point1 = input.nextDouble();
                    System.out.println("nhập điểm 2:");
                    double point2 = input.nextDouble();
                    System.out.println("nhập điểm 3:");
                    double point3 = input.nextDouble();
                    input.nextLine();
                    array[0] = point1;
                    array[1] = point2;
                    array[2] = point3;
                    System.out.println("nhập gioi tinh học sinh");
                    String gender = input.nextLine();
                    clazz.add(id, name, array, gender);
                    break;
                case 2:
                    double[] arrayEdit = new double[3];
                    System.out.println("nhập id muốn sửa");
                    int idEdit = input.nextInt();
                    if (clazz.check(idEdit)) {
                        input.nextLine();
                        System.out.println("sửa name");
                        String editName = input.nextLine();
                        System.out.println("sửa điểm 1");
                        double pointEdit1 = input.nextDouble();
                        System.out.println("sửa điểm 2");
                        double pointEdit2 = input.nextDouble();
                        System.out.println("sửa điểm 3");
                        double pointEdit3 = input.nextDouble();
                        arrayEdit[0] = pointEdit1;
                        arrayEdit[1] = pointEdit2;
                        arrayEdit[2] = pointEdit3;
                        System.out.println("sửa giới tính");
                        input.nextLine();
                        String genderEdit = input.nextLine();
                        clazz.edit(idEdit, editName, arrayEdit, genderEdit);
                    } else {
                        System.out.println("không tìm thấy id");
                    }
                    break;
                case 3:
                    System.out.println("nhập id muốn xóa");
                    int idDelete = input.nextInt();
                    if (clazz.check(idDelete)) {
                        clazz.delete(idDelete);
                    } else {
                        System.out.println("không tìm thấy id");
                    }
                    break;
                case 4:
                    System.out.println("điểm trung bình cả lớp");
                    System.out.println(clazz.averageList());
                    break;
                case 5:
                    System.out.println("nhập id muốn tìm");
                    int idSearch = input.nextInt();
                    if (clazz.search(idSearch) != null) {
                        System.out.println(clazz.search(idSearch));
                    } else {
                        System.out.println("không tìm thấy");
                    }
                    break;
                case 6:
                    System.out.println("nhập tên muốn tìm");
                    String nameSearch = input.nextLine();
                    if (clazz.searchName(nameSearch) != null) {
                        System.out.println(clazz.searchName(nameSearch));
                    } else {
                        System.out.println("không tìm thấy");
                    }
                    break;
                case 7:
                    System.out.println("học sinh điểm cao nhất");
                    System.out.println(clazz.maxPoint());
                    break;
                case 8:
                    return;
            }
        } while (true);
    }

}