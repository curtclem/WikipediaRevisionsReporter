package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.format.DateTimeFormatter;


public class AlternativeRevisionFormatter {
    public String format(Revision revision) {
        return String.format("%s made a change at %s",
                revision.name, DateTimeFormatter.ISO_INSTANT.format(revision.timestamp));
    }
}
