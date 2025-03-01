import java.util.*;

class StudentOrder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentNumber = 6;
        List<Integer> studentList = new ArrayList<>();
        
        for(int i = 0; i<studentNumber; i++){
            int newNumber = sc.nextInt();
            studentList.add(newNumber);
        }

        System.out.println(solution(studentList));
        sc.close();
    }

    public static int solution (List<Integer> studentList){
        int count = 0;
        List<Integer> orderList = new ArrayList<>(studentList);
        Collections.sort(orderList);
        
        for(int i = 0; i<studentList.size(); i++){
            if(!studentList.get(i).equals(orderList.get(i)))
                count++;
        }
        
        return count;
    }
}