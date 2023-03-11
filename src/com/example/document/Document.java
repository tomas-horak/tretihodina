package com.example.document;

import com.example.catalog.Readable;
import com.example.catalog.Searchable;

public class Document implements Searchable, Readable {
    private String serialNumber, subjects, contents;

    public Document(String serialNumber, String subjects, String contents) {
        this.serialNumber = serialNumber;
        this.subjects = subjects;
        this.contents = contents;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String getDisplayName() {
        return subjects;
    }

    @Override
    public String prepareSearchableString() {
        return serialNumber + subjects + contents;
    }

    @Override
    public String printContents() {
        return contents;
    }
}
