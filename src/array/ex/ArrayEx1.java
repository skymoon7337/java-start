package array.ex;
public class ArrayEx1 {
    public static void main(String[] args) {

        int[] students={90,80,70,60,50};

        int total=0;

//        for (int i=0;i<5;i++) {
//            total += students[i];
//        }

        for(int student:students){
            total += student;
        }

        double average = (double) total / 5;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}