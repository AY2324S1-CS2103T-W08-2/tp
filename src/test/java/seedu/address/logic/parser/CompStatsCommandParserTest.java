package seedu.address.logic.parser;

import org.junit.jupiter.api.Test;
import seedu.address.logic.commands.CompStatsCommand;
import seedu.address.model.gradedcomponent.GcName;
import seedu.address.model.student.TutorialGroup;

import java.util.ArrayList;
import java.util.List;

import static seedu.address.logic.parser.ParserTestUtil.assertParserSuccess;


public class CompStatsCommandParserTest {
    private CompStatsCommandParser parser = new CompStatsCommandParser();
    @Test
    public void execute_stat_success() {
        String input = " c/Midterm";
        String inputWithTut = " g/T01 c/Midterm";
        String inputWithCompStats = " c/Midterm st/max";
        assertParserSuccess(input, parser, new CompStatsCommand(new ArrayList<>(), new GcName("Midterm")));
        assertParserSuccess(inputWithTut, parser, new CompStatsCommand(new ArrayList<>(),
                new GcName("Midterm"), new TutorialGroup("T01")));
        assertParserSuccess(inputWithCompStats, parser, new CompStatsCommand(new ArrayList<>(List.of("max")),
                new GcName("Midterm")));
    }
}
