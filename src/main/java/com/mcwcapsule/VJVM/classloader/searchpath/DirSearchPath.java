package com.mcwcapsule.VJVM.classloader.searchpath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class DirSearchPath extends ClassSearchPath {
    private Path searchPath;

    public DirSearchPath(String path) {
        searchPath = FileSystems.getDefault().getPath(path);
    }

    @Override
    public InputStream findClass(String name) {
        try {
            return new FileInputStream(searchPath.resolve(name).toFile());
        } catch (FileNotFoundException e) {
            return null;
        }
    }

}