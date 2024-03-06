package ru.homchenko.java.basic.homeworks.homework11asimptoticcomplexityofalgorithms;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {
    Map<Long, Person> personMap;

    public PersonDataBase() {
        this.personMap = new HashMap<>();
    }

    public Person findById(Long id) {
        return personMap.get(id);
    }

    public void add(Person person) {
        this.personMap.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        return person.getPosition() == Position.MANAGER ||
                person.getPosition() == Position.DIRECTOR ||
                person.getPosition() == Position.BRANCH_DIRECTOR ||
                person.getPosition() == Position.SENIOR_MANAGER;
    }

    public boolean isEmployee(Long id) {
        Person person = findById(id);
        return person != null && !isManager(person);
    }
}
