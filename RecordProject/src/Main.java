public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++){
            LPAStudent s = new LPAStudent("0100" + i, switch (i){
                case 1 -> "Facundo";
                case 2 -> "Ivo";
                case 3 -> "Nino";
                case 4 -> "Betox";
                case 5 -> "Lucas";
                default -> "Anonymous";
            }, "10/05/2023", "Programing II");
            //java implicitly calls toString method for us
            System.out.println(s);
        }
        System.out.println();
        //Students with POJO
        Student pojoStudent = new Student("0200","Jimmy", "31/05/2002", "Enfermeria");
        System.out.println(pojoStudent);
        System.out.println(pojoStudent.getName());
        pojoStudent.setClassList(pojoStudent.getClassList() + "Medicina");
        System.out.println(pojoStudent.getClassList());

        System.out.println();

        //Student with Record
        LPAStudent recordStudent = new LPAStudent("0201", "Nahuel", "17/06/2002","Ing. Sistemas");
        System.out.println(recordStudent);
        System.out.println(recordStudent.name());
        //We can't set another data in any field cause is immutable in record

    }
}