﻿package net.sunj.learning.utils.files;

import java.io.File;
import java.io.IOException;

public class EmptyDirectoryScan {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subDirList("");
	}
	
	public static void subDirList(String source){
		File dir = new File(source); 
		File[] fileList = dir.listFiles(); 
		try{
			for(int i = 0 ; i < fileList.length ; i++){
				File file = fileList[i]; 
				if(file.isFile()){
					// 파일이 있다면 파일 이름 출력
					//System.out.println("\t 파일 이름 = " + file.getName());
				}else if(file.isDirectory()){
					if (file.listFiles().length < 1) {
						System.out.println("빈 디렉토리 이름 = " + file.getCanonicalPath().toString());
					} else {
						// System.out.println("디렉토리 이름 = " + file.getName());
						// 서브디렉토리가 존재하면 재귀적 방법으로 다시 탐색
						subDirList(file.getCanonicalPath().toString());	
					}
				}
			}
		}catch(IOException e){
			
		}
	}
}
