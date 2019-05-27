package com.myob.iris.service;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ParserTest {
    Parser parser = new Parser();

    private InputStream setInputStreamWithSpace() {
        String input = "apple pie";
        return new ByteArrayInputStream(input.getBytes());
    }

    @Test
    public void parseRawInputToList() {
        InputStream in = setInputStreamWithSpace();
        String[] actual = parser.parseRawInputToList(new Scanner(in));
        String[] expect = {"apple", "pie"};
        assertThat(actual, equalTo(expect));
    }
}