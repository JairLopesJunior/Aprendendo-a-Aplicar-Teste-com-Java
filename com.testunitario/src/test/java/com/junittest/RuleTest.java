package com.junittest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class RuleTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileIsTemporaryFolder() throws IOException {
        File created = temporaryFolder.newFile("file.txt");

        Assert.assertTrue(created.isFile());
        Assert.assertEquals(temporaryFolder.getRoot(), created.getParentFile());
    }
}
