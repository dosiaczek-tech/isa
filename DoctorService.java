import java.util.ArrayList;
import java.util.List;

class DoctorService {
    private final List<Doctor> doctors = new ArrayList<>();

    DoctorService() {
        this.doctors.add(new Doctor("Adam", "Lecz"));
        this.doctors.add(new Doctor("Marta", "KOwalska"));
        this.doctors.add(new Doctor("Marcin", "Leczniczny"));
        this.doctors.add(new Doctor("Marcin", "Nowak"));
        this.doctors.add(new Doctor("Beata", "Kozidrak"));
    }

    List<Doctor> getAll() {
        return this.doctors;
    }
}
