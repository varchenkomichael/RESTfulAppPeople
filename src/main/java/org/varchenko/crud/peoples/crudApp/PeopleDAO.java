package org.varchenko.crud.peoples.crudApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleDAO {
   private final List<Person> people;
   private static int PEOPLE_COUNTER = 0;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNTER, "Tom"));
        people.add(new Person(++PEOPLE_COUNTER, "Jake"));
        people.add(new Person(++PEOPLE_COUNTER, "Bob"));
        people.add(new Person(++PEOPLE_COUNTER, "Mike"));
    }
    public List<Person> index(){
        return people;
    }
    public Person show(int id){
       return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
