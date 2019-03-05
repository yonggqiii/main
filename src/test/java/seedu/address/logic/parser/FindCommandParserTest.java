package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.Test;

import seedu.address.logic.commands.FindCommand;
import seedu.address.model.person.AddressContainsKeywordPredicate;
import seedu.address.model.person.EmailContainsKeywordPredicate;
import seedu.address.model.person.NameContainsKeywordsPredicate;
import seedu.address.model.person.Person;
import seedu.address.model.person.PhoneContainsKeywordPredicate;
import seedu.address.model.person.TagsContainsKeywordPredicate;

public class FindCommandParserTest {

    private FindCommandParser parser = new FindCommandParser();

    @Test
    public void parse_emptyArg_throwsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT, FindCommand.MESSAGE_USAGE));
    }

    /*@Test
    public void parse_validArgs_returnsFindCommand() {
        String Command = "n/Alice Bob";

        String[] splitedKeywords = Command.trim().split("\\s+");
        ArrayList<Predicate<Person>> predicates = new ArrayList<>();

        predicates.add(new NameContainsKeywordsPredicate(Arrays.asList(splitedKeywords)));


        Predicate<Person>[] predicatesList = predicates.toArray(new Predicate[predicates.size()]);
        Predicate<Person> PredicateResult = Stream.of(predicatesList).reduce(condition -> false, Predicate::or);
        // no leading and trailing whitespaces
        FindCommand expectedFindCommand =
                new FindCommand(PredicateResult);
        assertParseSuccess(parser, "n/Alice Bob", expectedFindCommand);

        // multiple whitespaces between keywords
       // assertParseSuccess(parser, " \n Alice \n \t Bob  \t", expectedFindCommand);
    }
*/
}
