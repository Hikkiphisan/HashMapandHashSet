import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("aadasd",12,"Adadad");
        Students student2 = new Students("hikkkikiki",22,"wdqddad");
        Students student3 = new Students("hikkr2342",232,"cfdgrdsxc");
        Students student4 = new Students("vwrgfed",53,"cfewfwefwefxc");

        Map<Integer, Students> hashMapStudent = new HashMap<>();
        hashMapStudent.put(1,student1);
        hashMapStudent.put(2,student2);
        hashMapStudent.put(3,student3);
        hashMapStudent.put(4,student4);

        for (Map.Entry<Integer,Students> student : hashMapStudent.entrySet()) {
                    //studentMap.entrySet() không trả về từng Map mà trả về các Entry. Mỗi Entry chứa một khóa và một giá trị, và ta duyệt qua các Entry này.
            System.out.println(student.toString());
        }

        System.out.println("...........Set");
        Set<Students> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Students student : students){
            System.out.println(student.toString());
        }
    }
}
    
