package com.myob.iris.service;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class InputSplitterTest {
    private InputSplitter inputSplitter = new InputSplitter();

    private InputStream setInputStreamWithSpace() {
        String input = "Space between";
        return new ByteArrayInputStream(input.getBytes());
    }

    private InputStream setInputStreamWithoutSpace() {
        String input = "NoSpaceBetween";
        return new ByteArrayInputStream(input.getBytes());
    }

    @Test
    public void parseRawInputWithSpaceToList() {
        InputStream in = setInputStreamWithSpace();
        String[] actual = inputSplitter.splitRawInputToArray(new Scanner(in));
        String[] expect = {"Space", "between"};
        assertThat(actual, equalTo(expect));
    }

    @Test
    public void parseRawInputWithoutSpaceToList() {
        InputStream in = setInputStreamWithoutSpace();
        String[] actual = inputSplitter.splitRawInputToArray(new Scanner(in));
        String[] expect = {"NoSpaceBetween"};
        assertThat(actual, equalTo(expect));
    }
}