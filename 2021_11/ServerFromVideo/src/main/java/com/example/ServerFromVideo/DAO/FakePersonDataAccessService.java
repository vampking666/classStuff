package com.example.ServerFromVideo.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.example.ServerFromVideo.Model.Person;
import org.springframework.stereotype.Repository;

@Repository("fakeDAO")
public class FakePersonDataAccessService implements PersonDAO {
    
    private static List<Person> DB = new ArrayList<>(); /* sets the json objects with the names and ids as array lists in the form of json arrays */

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName())); /* adds a person to the data base */
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB; /* returns the data base after the get */
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        // TODO Auto-generated method stub
        return 0;
    }
}
