import java.util.ArrayList;
import java.util.List;

class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    PatientService() {
        this.patients.add(new Patient("Jan", "Kowalski", 94));
        this.patients.add(new Patient("Maria", "Nowakowska", 13));
        this.patients.add(new Patient("Andrzej", "Nowak", 13));
        this.patients.add(new Patient("Malgorzata", "Kolebka", 13));
        this.patients.add(new Patient("Karlos", "Juan", 13));
        this.patients.add(new Patient("Michal", "Michalski", 13));
    }

    List<Patient> getAll() {
        return this.patients;
    }
}
