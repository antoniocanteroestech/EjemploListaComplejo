package softepec.es.ejemplolistacompleja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsersRepository {

    private static UsersRepository repository = new UsersRepository();
    private HashMap<String, User> users = new HashMap<>();

    public static UsersRepository getInstance() {
        return repository;
    }

    private UsersRepository() {
        saveUser(new User("Alexander Pierrot", "CEO", "Insures S.O.", R.drawable.ic_person_black));
        saveUser(new User("Carlos Lopez", "Asistente", "Hospital Blue", R.drawable.ic_person_black));
        saveUser(new User("Sara Bonz", "Directora de Marketing", "Electrical Parts ltd", R.drawable.ic_person_black));
        saveUser(new User("Liliana Clarence", "Diseñadora de Producto", "Creativa App", R.drawable.ic_person_black));
        saveUser(new User("Benito Peralta", "Supervisor de Ventas", "Neumáticos Press", R.drawable.ic_person_black));
        saveUser(new User("Juan Jaramillo", "CEO", "Banco Nacional", R.drawable.ic_person_black));
        saveUser(new User("Christian Steps", "CTO", "Cooperativa Verde", R.drawable.ic_person_black));
        saveUser(new User("Alexa Giraldo", "Lead Programmer", "Frutisofy", R.drawable.ic_person_black));
        saveUser(new User("Linda Murillo", "Directora de Marketing", "Seguros Boliver", R.drawable.ic_person_black));
        saveUser(new User("Lizeth Astrada", "CEO", "Concesionario Motolox", R.drawable.ic_person_black));
    }

    private void saveUser(User lead) {
        users.put(lead.getId(), lead);
    }

    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }


}
