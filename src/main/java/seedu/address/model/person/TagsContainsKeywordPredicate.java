package seedu.address.model.person;

import java.util.List;
import java.util.function.Predicate;

import seedu.address.commons.util.StringUtil;

/**
 * Tests that a {@code Person}'s {@code Name} matches any of the keywords given.
 */
public class TagsContainsKeywordPredicate implements Predicate<Person> {
    private final List<String> keywords;

    public TagsContainsKeywordPredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean test(Person person) {
        return keywords.stream()
                .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(person.getTagsAsStringNoBracket(), keyword));
    }

    @Override
    public boolean equals(Object other) {
        return other == this || (other instanceof TagsContainsKeywordPredicate // instanceof handles nulls
                && keywords.equals(((TagsContainsKeywordPredicate) other).keywords)); // state check
    }

}
