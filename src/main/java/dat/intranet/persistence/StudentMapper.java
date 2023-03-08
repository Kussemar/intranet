package dat.intranet.persistence;

import dat.intranet.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentMapper {
    private static List<Student> studentList = new ArrayList<>();

    public static void populateStudents(){
        if(studentList.size()==0) {
            studentList.add(new Student("Navn", "Email"));
            studentList.add(new Student("Jakob Heidrup Husen", "cph-jh437@cphbusiness.dk"));
            studentList.add(new Student("Dimitra Siskou", "cph-ds198@cphbusiness.dk"));
            studentList.add(new Student("Bjarke Olaf Dehlie", "cph-bd89@cphbusiness.dk"));
            studentList.add(new Student("Pelle Hald Vedsmand", "cph-pv73@cphbusiness.dk"));
            studentList.add(new Student("William Emil Yus Hansen", "cph-wh113@cphbusiness.dk"));
            studentList.add(new Student("Julius Peter Hvid Lassen", "cph-jl442@cphbusiness.dk"));
            studentList.add(new Student("Caner Turan", "cph-ct193@cphbusiness.dk"));
            studentList.add(new Student("Oliver Madsen", "cph-om76@cphbusiness.dk"));
            studentList.add(new Student("Xiaoxuan Huang Olsen", "cph-xo@cphbusiness.dk"));
            studentList.add(new Student("Anders Hein Larsen", "cph-al419@cphbusiness.dk"));
            studentList.add(new Student("Andreas Due Pihl", "cph-ap399@cphbusiness.dk"));
            studentList.add(new Student("Chris Hedin Ziegler", "cph-cz36@cphbusiness.dk"));
            studentList.add(new Student("Danyal Kitir", "cph-dk174@cphbusiness.dk"));
            studentList.add(new Student("Deniz Sönmez", "cph-ds247@cphbusiness.dk"));
            studentList.add(new Student("Jack Thorsen Oulund", "cph-jo190@cphbusiness.dk"));
            studentList.add(new Student("Morten Andreas Ehardi Nielsen", "cph-mn705@cphbusiness.dk"));
            studentList.add(new Student("Nicolai Rosendahl", "cph-nr135@cphbusiness.dk"));
            studentList.add(new Student("Orhan Secilmis", "cph-os104@cphbusiness.dk"));
            studentList.add(new Student("Philip Christopher William Hatley", "cph-ph140@cphbusiness.dk"));
            studentList.add(new Student("Tobias Stenbo Tonndorff", "cph-tt160@cphbusiness.dk"));
            studentList.add(new Student("Victor Borcher Løvendahl Christensen", "cph-vc58@cphbusiness.dk"));
            studentList.add(new Student("Carsten Juhl", "cph-cj505@cphbusiness.dk"));
            studentList.add(new Student("Martin Thuren Christensen", "cph-mc489@cphbusiness.dk"));
            studentList.add(new Student("Marcus Løbel", "cph-ml788@cphbusiness.dk"));
            studentList.add(new Student("Rasmus Tornby Arendt", "cph-ra184@cphbusiness.dk"));
        }
    }

    public static List<Student> getAllStudents(){
        return studentList;
    }
}
