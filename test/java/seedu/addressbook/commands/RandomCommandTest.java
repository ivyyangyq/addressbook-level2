package seedu.addressbook.commands;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

import org.junit.Test;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.util.TestUtil;

public class RandomCommandTest {

    private final AddressBook emptyAddressBook = TestUtil.createAddressBook();

    @Test
    public void execute() {
        //check random function behavior when list is empty.
        assertRandomCommandBehavior(Collections.emptyList());
    }


    /**
     * Executes the random command and verifies
     * the result matches the persons in the expectedPersonList exactly.
     */
    private void assertRandomCommandBehavior(List<ReadOnlyPerson> expectedPersonList) {
        RandomCommand command = new RandomCommand();
        command.setData(emptyAddressBook,  Collections.emptyList())
        CommandResult result = command.execute();

        assertEquals(Command.getMessageForPersonListShownSummary(expectedPersonList), result.feedbackToUser);

    }

}

