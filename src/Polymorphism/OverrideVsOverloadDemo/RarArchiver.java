package Polymorphism.OverrideVsOverloadDemo;

import java.io.File;

public class RarArchiver implements Archiver{

	@Override
	public void archiveFiles(File... files) {
		// TODO Auto-generated method stub
		System.out.println("Method of Rar Archiver is called");
		
	}

}