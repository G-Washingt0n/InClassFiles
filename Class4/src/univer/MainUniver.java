package univer;


public class MainUniver {
    public static void main(String[] args){
    System.out.println("START APP");
    //создали студента
    Student[] arrayStudents = new Student[3];
    arrayStudents[0] = new Student();
    arrayStudents[1] = new Student();
    arrayStudents[2] = new Student();
    //заполняем студента
    
    for(int i=0;i<3;i++){
        arrayStudents[i].age = 10+4*i;
        arrayStudents[i].midOcenka = (5+i)/2;
    }
        arrayStudents[0].isZaochnik = true;
        arrayStudents[0].name = "Vasia";
        arrayStudents[1].isZaochnik = false;
        arrayStudents[1].name = "Boria";
        arrayStudents[2].isZaochnik = true;
        arrayStudents[2].name = "Okakij";
 Student.nameUniver = "pvt";
        showNameOS(arrayStudents[1]);
       
}
    public static void showNameOS(Student student){
        System.out.println("Student " + student.name + " is " + student.age + " clever as " +student.midOcenka + " teaches in " + Student.getUniverNameUpper());
    }
}
