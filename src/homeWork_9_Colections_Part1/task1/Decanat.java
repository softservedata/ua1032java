package homeWork_9_Colections_Part1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Decanat {

    public void removeBadStudents(List<Students> list){

        for(int i=0; i<list.size(); i++ ){
        if(list.get(i).getAverageGrade()<3){
            list.remove(i);
        }
        }
        System.out.println(list);
    }

    public void getNextCourseToStudents(List<Students> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAverageGrade() >= 3) {
                list.get(i).setCourse(list.get(i).getCourse() + 1);
            }
        }
        System.out.println(list);
    }




    public void printStudents(List<Students> list, int course){

        for(int i =0 ; i<list.size(); i++){
            if(list.get(i).getCourse() == course){
                System.out.println(list.get(i));
            }
        }

    }



}



