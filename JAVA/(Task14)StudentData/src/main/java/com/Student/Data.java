package com.Student;

import java.util.ArrayList;
import java.util.List;

public class Data extends Student{


    public String getSt() {
        return st.toString();
    }

    public static final List<Student> st=new ArrayList<>();
    List<Course> c=new ArrayList<>();

    public Data(){



        Course c1=new Course(1,"PYTHON");
        Course c2=new Course(2,"JAVA");
        Course c3=new Course(3,"DBMS");
        Course c4=new Course(4,"JAVASCRIPT");
        Course c5=new Course(5,"QA");
        c.add(c1);c.add(c2);c.add(c3);c.add(c4);c.add(c5);

        List<Course> cl1 = new ArrayList<>();
        List<Course> cl2 = new ArrayList<>();
        List<Course> cl3 = new ArrayList<>();
        List<Course> cl4 = new ArrayList<>();
        List<Course> cl5 = new ArrayList<>();
        cl1.add(c1); cl1.add(c4);
        cl2.add(c1);cl2.add(c3);
        cl3.add(c1);cl2.add(c3);
        cl4.add(c1);cl2.add(c3);
        cl5.add(c1);cl2.add(c5);


        Student s1=new Student(1,"Aslas","Aslas17","Pramati", (ArrayList) cl1);
        Student s2=new Student(2,"Manu","Manu17","Pramati",(ArrayList) cl2);
        Student s3=new Student(3,"Rohith","Rohith23","Pramati", (ArrayList) cl3);
        Student s4=new Student(4,"Prem","Prem07","Pramati", (ArrayList) cl4);
        Student s5=new Student(5,"Harsha","Harsha11","Pramati", (ArrayList) cl5);
        st.add(s1);st.add(s2);st.add(s3);st.add(s4);st.add(s5);
    }
    public String getStudentdataById(){
        for(int i=0;i<st.size();i++){
            if(st.get(i).student_id==1)
                return st.get(i).toString();
        }
        return "NOT FOUND";
    }
    public boolean deleteStudentdata(){
        for(int i=0;i<st.size();i++){
            if (st.get(i).student_id==4){
                st.remove(st.get(i));
                return true;
            }
        }
        return false;
    }
}
