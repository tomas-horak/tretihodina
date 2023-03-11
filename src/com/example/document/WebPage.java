package com.example.document;

import com.example.catalog.Readable;
import com.example.catalog.Searchable;

public class WebPage implements Searchable, Readable {
    private String address, title, contents;

    public WebPage(String address, String title, String contents) {
        this.address = address;
        this.title = title;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getDisplayName() {
        return title;
    }

    @Override
    public String prepareSearchableString() {
        return title + address + contents;
    }

    @Override
    public String printContents() {
        return contents;
    }
}
