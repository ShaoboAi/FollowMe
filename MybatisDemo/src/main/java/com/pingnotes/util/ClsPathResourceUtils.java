package com.pingnotes.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * Created by shaobo on 12/26/16.
 */
public class ClsPathResourceUtils {
    private static String defaultBasePath = "mapper";
    private static String mapperXmlSuffix = "Mapper.xml";

    public static Resource[] scan() throws IOException {
        return scan(defaultBasePath);
    }

    public static Resource[] scan(String basePath) throws IOException {
        String[] filenames = populate(basePath);
        if (filenames.length == 0) {
            return new Resource[0];
        }
        Resource[] resources = new Resource[filenames.length];
        int i = 0;
        for (String n : filenames) {
            resources[i++] = new ClassPathResource(n);
        }
        return resources;
    }

    public static String[] populate(String basePath) throws IOException {
        if (basePath == null || basePath.length() == 0) {
            basePath = defaultBasePath;
        }

        ClassPathResource resource = new ClassPathResource(basePath);
        File file = new File(resource.getURI());
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(basePath + " is not directory");
        }
        File[] files = file.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(mapperXmlSuffix)) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        String[] targets = new String[files.length];
        int i = 0;
        for (File f : files) {
            targets[i++] = basePath + File.separator + f.getName();
        }
        return targets;
    }
}
