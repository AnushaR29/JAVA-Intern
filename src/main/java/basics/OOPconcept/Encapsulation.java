package basics.OOPconcept;

class Exams {
    public int Examiner_rollno;
    public String Examiner_name;
    public String Examiner_location;

    public int getExaminer_rollno() {
        return Examiner_rollno;
    }

    public void setExaminer_rollno(int examiner_rollno) {
        Examiner_rollno = examiner_rollno;
    }

    public String getExaminer_name() {
        return Examiner_name;

    }

    public void setExaminer_name(String examiner_name) {
        Examiner_name = examiner_name;
    }

    public String getExaminer_location() {
        return Examiner_location;
    }

    public void setExaminer_location(String examiner_location) {
        Examiner_location = examiner_location;
    }
}

    public class Encapsulation {
        public static void main(String[] args) {
            Exams ed = new Exams();
            ed.setExaminer_rollno(5456);
            ed.setExaminer_name("Anu");
            ed.setExaminer_location("Salem");
            System.out.println(ed.getExaminer_rollno());
            System.out.println(ed.getExaminer_name());
            System.out.println(ed.getExaminer_location());
        }
    }
