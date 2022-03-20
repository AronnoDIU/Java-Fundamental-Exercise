package Polymorphism.OverrideVsOverloadDemo;

import java.io.File;

public class ZipArchiver implements Archiver{

	@Override
	public void archiveFiles(File... files) {
		// TODO Auto-generated method stub
		System.out.println("Method of Zip Archiver is called");
	}
	
	public void archiveFiles(int maxArchiveSize, File... files) {
		// stub method for the demo purposes
	}

}