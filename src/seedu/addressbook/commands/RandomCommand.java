package seedu.addressbook.commands;


import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import seedu.addressbook.data.person.ReadOnlyPerson;

/**
 * Randomly pick a person from the list.
 */

public class RandomCommand extends Command {
    public static final String COMMAND_WORD = "random";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Randomly display a person from the list.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> personChosen = getRandomPerson();
        return new CommandResult(getMessageForPersonListShownSummary(personChosen), personChosen);
    }

    /**
     * Find one random person from the list.

     * @return list of persons found
     */
    private List<ReadOnlyPerson> getRandomPerson() {
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        final List<ReadOnlyPerson> Persons = new ArrayList<>();
        if (allPersons.size() == 0) {
            return allPersons;
        }
        Persons.add(allPersons.get(new Random().nextInt(allPersons.size())));
        return Persons;
    }



}
