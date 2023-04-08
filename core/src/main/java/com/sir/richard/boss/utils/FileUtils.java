package com.sir.richard.boss.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class FileUtils {
	
	public static Set<String> listFilesForFolder(final File folder) {
		Set<String> files = new HashSet<String>();
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	Set<String> localFiles = listFilesForFolder(fileEntry);
	        	files.addAll(localFiles);
	        } else {
	        	if (StringUtils.indexOf(fileEntry.getName(), "$") < 0 && StringUtils.indexOf(fileEntry.getName(), "_") < 0) {	        		
	        		files.add(fileEntry.getName());
	        	}
	        }
	    }
	    return files;
	}

}
