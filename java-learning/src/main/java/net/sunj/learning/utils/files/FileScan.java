package net.sunj.learning.utils.files;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class FileScan {

	public static void main(String[] args) {
		
		String regex = "^\\S+\\.(?i)jsp$";
		int b = subDirList(regex, "D:/03_Development/01_Work/sda/workspace/web_buyer_sdaconst/buyer");
		int s = subDirList(regex, "D:/03_Development/01_Work/sda/workspace/web_supplier_sdaconst/supplier");
		System.out.println("jsp 총개수 : " + (b + s));
		
		regex = "^\\S*(?i)(list)\\S*\\.(?i)jsp$";
		int lb = subDirList(regex, "D:/03_Development/01_Work/sda/workspace/web_buyer_sdaconst/buyer");
		int ls = subDirList(regex, "D:/03_Development/01_Work/sda/workspace/web_supplier_sdaconst/supplier");
		System.out.println("jsp list 총개수 : " + (lb + ls));
		
	}

	private static int subDirList(String regex, String string) {
		File dir = new File(string);
		File[] fileList = dir.listFiles();

		int cnt = 0;
		try {
			//String regex = "^\\S+.(?i)jsp$";
			
			for (int i = 0; i < fileList.length; i++) {
				File file = fileList[i];
				if (file.isFile()) {
					String fileName = file.getName();

					if (Pattern.matches(regex, fileName)) {
						cnt++;
						System.out.println(fileName);
					};
				} else if (file.isDirectory()) {
					// System.out.println("디렉토리 이름 = " + file.getName());
					// 서브디렉토리가 존재하면 재귀적 방법으로 다시 탐색
					cnt = cnt + subDirList(regex, file.getCanonicalPath().toString());
				}
			}
		} catch (IOException e) {

		}
		return cnt;
	}
}
